package com.ebaotech.salesplatform.ui.customer;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.Toolbar;
import android.support.v4.app.NavUtils;
import android.view.MenuItem;
import android.widget.Toast;
import com.ebaotech.salesplatform.R;
import com.ebaotech.salesplatform.mvp.presenter.CustomerPresenter;
import com.ebaotech.salesplatform.mvp.view.CustomerView;
import com.ebaotech.salesplatform.mvp.view.model.customer.CustomerViewModel;
import com.ebaotech.salesplatform.ui.AbstractActivity;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.OptionsItem;
import org.androidannotations.annotations.OptionsMenu;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;

/**
 * An activity representing a list of Customers. This activity
 * has different presentations for handset and tablet-size devices. On
 * handsets, the activity presents a list of items, which when touched,
 * lead to a {@link CustomerBasicActivity} representing
 * item details. On tablets, the activity presents the list of items and
 * item details side-by-side using two vertical panes.
 * <p>
 * The activity makes heavy use of fragments. The list of items is a
 * {@link CustomerEditLeftPaneFragment} and the item details
 * (if present) is a {@link CustomerDetailFragment}.
 * <p>
 * This activity also implements the required
 * {@link CustomerEditLeftPaneFragment.Callbacks} interface
 * to listen for item selections.
 */
@EActivity(R.layout.activity_customer_app_bar)
@OptionsMenu(R.menu.menu_customer_edit)
public class CustomerEditActivity extends AbstractActivity<CustomerViewModel>
    implements CustomerEditLeftPaneFragment.Callbacks,CustomerView {

  private static final String INTENT_EXTRA_PARAM_CUSTOMER_ID = "CustomerEditActivity:customerId";

  /**
   * Whether or not the activity is in two-pane mode, i.e. running on a tablet
   * device.
   */
  private boolean mTwoPane;

  @ViewById
  Toolbar toolbar;

  private Fragment[] frags;

  @Extra(INTENT_EXTRA_PARAM_CUSTOMER_ID)
  String customerId;

  private CustomerViewModel customerViewModel;

  @Bean
  CustomerPresenter customerPresenter;

  private int currentPosition = -1;

  public static void launch(Context context, String customerId) {
    CustomerEditActivity_.intent(context).extra(INTENT_EXTRA_PARAM_CUSTOMER_ID,customerId).start();
  }

  @AfterViews
  protected void initPage() {
    setSupportActionBar(toolbar);
    toolbar.setTitle(getTitle());
    getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    customerPresenter.setView(this);

    if (findViewById(R.id.customer_detail_container) != null) {
      // The detail container view will be present only in the
      // large-screen layouts (res/values-large and
      // res/values-sw600dp). If this view is present, then the
      // activity should be in two-pane mode.
      mTwoPane = true;

      // In two-pane mode, list items should be given the
      // 'activated' state when touched.
      ((CustomerEditLeftPaneFragment) getSupportFragmentManager().findFragmentById(
          R.id.customer_list)).setActivateOnItemClick(true);
    }
    // TODO: If exposing deep links into your app, handle intents here.

    frags = new Fragment[] {
        CustomerBasicFragment.newInstance(this),
        CustomerAddressFragment.newInstance(this),
        CustomerFamilyFragment.newInstance(this)
    };
  }

  @Override public boolean onOptionsItemSelected(MenuItem item) {
    int id = item.getItemId();
    if (id == android.R.id.home) {
      // This ID represents the Home or Up button. In the case of this
      // activity, the Up button is shown. Use NavUtils to allow users
      // to navigate up one level in the application structure. For
      // more details, see the Navigation pattern on Android Design:
      //
      // http://developer.android.com/design/patterns/navigation.html#up-vs-back
      //
      NavUtils.navigateUpFromSameTask(this);
      return true;
    }
    return super.onOptionsItemSelected(item);
  }

  /**
   * Callback method from {@link CustomerEditLeftPaneFragment.Callbacks}
   * indicating that the item with the given ID was selected.
   */
  @Override public void onItemSelected(int position) {
    if (mTwoPane) {
      if (currentPosition == position) {
        return;
      }
      // In two-pane mode, show the detail view in this activity by
      // adding or replacing the detail fragment using a
      // fragment transaction.
      Bundle arguments = new Bundle();
      Fragment fragment = frags[position];
      fragment.setArguments(arguments);
      getSupportFragmentManager().beginTransaction()
          .replace(R.id.customer_detail_container, fragment)
          .commit();
      currentPosition = position;
    } else {
      if(position==0) {
        CustomerBasicActivity.launch(this);
      } else if (position==1) {
        CustomerAddressActivity.launch(this);
      } else if (position==2) {
        CustomerFamilyActivity.launch(this);
      }
    }
  }

  @Override
  public void onResume() {
    super.onResume();
  }

  @Override
  public void onStart() {
    super.onStart();
    customerPresenter.load(customerId);
  }

  @OptionsItem(R.id.action_save)
  boolean menuSave() {
    boolean result = true;
    if (customerViewModel != null) {
      for (Fragment fragment : frags) {
        result &= ((CustomerFragment) fragment).save();
      }
      if (result) {
        customerPresenter.save(customerViewModel);
      }
    }
    return result;
  }

  @OptionsItem(R.id.action_delete)
  boolean menuDelete() {
    new AlertDialog.Builder(this)
        .setTitle("Delete customer")
        .setMessage("Are you sure to delete this customer?")
        .setIcon(android.R.drawable.ic_dialog_alert)
        .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {

          public void onClick(DialogInterface dialog, int whichButton) {
            customerPresenter.delete(customerId);
            CustomerEditActivity.this.finish();
          }})
        .setNegativeButton(android.R.string.no, null).show();
    return true;
  }

  @UiThread
  @Override public void onViewModelLoaded(CustomerViewModel customerViewModel) {
    this.customerViewModel = customerViewModel;
    for (Fragment fragment : frags) {
      ((CustomerFragment) fragment).setCustomerViewModel(customerViewModel);
    }
    onItemSelected(0);
  }

  @UiThread
  @Override public void onViewModelSaved(CustomerViewModel customerViewModel) {
    this.finish();
  }

  @UiThread
  @Override public void onViewModelDeleted() {
    this.finish();
  }
}

package com.ebaotech.salesplatform.ui.quotation;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.NavUtils;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.ebaotech.salesplatform.R;
import com.ebaotech.salesplatform.mvp.presenter.CustomerPresenter;
import com.ebaotech.salesplatform.mvp.presenter.QuotationPresenter;
import com.ebaotech.salesplatform.mvp.view.QuotationView;
import com.ebaotech.salesplatform.mvp.view.model.quotation.QuotationViewModel;
import com.ebaotech.salesplatform.ui.AbstractActivity;
import com.ebaotech.salesplatform.ui.customer.CustomerAddressActivity;
import com.ebaotech.salesplatform.ui.customer.CustomerBasicActivity;
import com.ebaotech.salesplatform.ui.customer.CustomerBasicFragment;
import com.ebaotech.salesplatform.ui.customer.CustomerDetailFragment;
import com.ebaotech.salesplatform.ui.customer.CustomerEditLeftPaneFragment;
import com.ebaotech.salesplatform.ui.customer.CustomerFamilyActivity;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;

/**
 * An activity representing a list of Quotations. This activity
 * has different presentations for handset and tablet-size devices. On
 * handsets, the activity presents a list of items, which when touched,
 * lead to a {@link CustomerBasicActivity} representing
 * item details. On tablets, the activity presents the list of items and
 * item details side-by-side using two vertical panes.
 * <p/>
 * The activity makes heavy use of fragments. The list of items is a
 * {@link CustomerEditLeftPaneFragment} and the item details
 * (if present) is a {@link CustomerDetailFragment}.
 * <p/>
 * This activity also implements the required
 * {@link CustomerEditLeftPaneFragment.Callbacks} interface
 * to listen for item selections.
 */
@EActivity(R.layout.activity_quotation_edit_list)
public class QuotationEditActivity extends AbstractActivity
        implements QuotationEditLefPaneFragment.Callbacks, QuotationView {

    private static final String INTENT_EXTRA_PARAM_QUOTATION_ID = "QuotationEditActivity:quotationId";
    private static final String INTENT_EXTRA_PARAM_POLICY_HOLDER_ID = "QuotationEditActivity:policyHolder";

    /**
     * Whether or not the activity is in two-pane mode, i.e. running on a tablet
     * device.
     */
    private boolean mTwoPane;
    private int mCurrentPosition = -1;

    @ViewById
    Toolbar toolbar;

    private Fragment[] frags;

    @Extra(INTENT_EXTRA_PARAM_QUOTATION_ID)
    String quotationId;

    @Extra(INTENT_EXTRA_PARAM_POLICY_HOLDER_ID)
    String policyHolderId;

    private QuotationViewModel quotationViewModel;

    @Bean
    QuotationPresenter quotationPresenter;

    @Bean
    CustomerPresenter customerPresenter;

    public static void launch(Context context, String quotationId, String policyHolderId) {
        QuotationEditActivity_.intent(context).extra(INTENT_EXTRA_PARAM_QUOTATION_ID, quotationId).extra(INTENT_EXTRA_PARAM_POLICY_HOLDER_ID, policyHolderId).start();
    }


    @AfterViews
    protected void initPage() {
        setSupportActionBar(toolbar);
        toolbar.setTitle(getTitle());
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        quotationPresenter.setView(this);

        if (findViewById(R.id.quotation_edit_detail_container) != null) {
            // The detail container view will be present only in the
            // large-screen layouts (res/values-large and
            // res/values-sw600dp). If this view is present, then the
            // activity should be in two-pane mode.
            mTwoPane = true;

            // In two-pane mode, list items should be given the
            // 'activated' state when touched.
            ((QuotationEditLefPaneFragment) getSupportFragmentManager().findFragmentById(
                    R.id.quotation_edit_list)).setActivateOnItemClick(true);
        }
        // TODO: If exposing deep links into your app, handle intents here.

        frags = new Fragment[]{
                CustomerBasicFragment.newInstance(this),
                QuotationEditProductFragment.newInstance(this)
        };
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
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
    @Override
    public void onItemSelected(int position) {

        if (mTwoPane) {
            if (mCurrentPosition != position) {
                Bundle arguments = new Bundle();
                Fragment fragment = frags[position];
                fragment.setArguments(arguments);
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.quotation_edit_detail_container, fragment)
                        .commit();
            }
            mCurrentPosition = position;
        } else {
            if (position == 0) {
                CustomerBasicActivity.launch(this);
            } else if (position == 1) {
                CustomerAddressActivity.launch(this);
            } else if (position == 2) {
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
        if (null != quotationId) {   // load Quotation and show
            quotationPresenter.setQuotationId(quotationId);
        } else if (null != policyHolderId) { //new quotation with this policy holder
            quotationPresenter.setPolicyHolderId(policyHolderId);
        }
        quotationPresenter.start();
    }

    @Override
    public void onStop() {
        super.onStop();
        quotationPresenter.setQuotationId(quotationId);
        quotationPresenter.stop();
    }

    @Override
    @UiThread
    public void setViewModel(QuotationViewModel quotationViewModel) {
        this.quotationViewModel = quotationViewModel;

        ((CustomerBasicFragment) frags[0]).setCustomerViewModel(quotationViewModel.getPolicyHolder());
        ((QuotationEditProductFragment) frags[1]).setQuotationViewModel(quotationViewModel);
        onItemSelected(0);
    }
}

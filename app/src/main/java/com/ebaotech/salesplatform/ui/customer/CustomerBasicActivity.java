package com.ebaotech.salesplatform.ui.customer;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.v4.app.NavUtils;
import android.view.MenuItem;
import com.ebaotech.salesplatform.R;
import com.ebaotech.salesplatform.ui.AbstractActivity;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

/**
 * An activity representing a single Customer detail screen. This
 * activity is only used on handset devices. On tablet-size devices,
 * item details are presented side-by-side with a list of items
 * in a {@link CustomerEditActivity}.
 * <p>
 * This activity is mostly just a 'shell' activity containing nothing
 * more than a {@link CustomerDetailFragment}.
 */
@EActivity(R.layout.activity_customer_basic)
public class CustomerBasicActivity extends AbstractActivity {

  @ViewById
  protected Toolbar toolbar;

  @AfterViews
  protected void initPage() {
    setSupportActionBar(toolbar);
    toolbar.setTitle(getTitle());
    getSupportActionBar().setDisplayHomeAsUpEnabled(true);
  }

  public static void launch(Context context) {
    CustomerBasicActivity_.intent(context).start();
  }
}

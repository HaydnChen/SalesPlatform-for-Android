package com.ebaotech.salesplatform.ui.customer;

import android.support.design.widget.FloatingActionButton;
import android.view.View;
import com.ebaotech.salesplatform.R;
import com.ebaotech.salesplatform.ui.AbstractActivity;
import com.ebaotech.salesplatform.ui.AbstractFragment;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.ViewById;

/**
 * Created by haydn.chen on 3/10/2016.
 */
@EFragment(R.layout.fragment_customer_address)
public class CustomerAddressFragment extends AbstractFragment {

  @ViewById
  FloatingActionButton fab;

  @AfterViews
  void intPage() {

  }

  public static CustomerAddressFragment newInstance(AbstractActivity abstractActivity) {
    CustomerAddressFragment fragment = new CustomerAddressFragment_();
    fragment.setContainerActivity(abstractActivity);
    return fragment;
  }

  @Click(R.id.fab)
  void onFabClick(View view) {

  }
}

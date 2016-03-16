package com.ebaotech.salesplatform.ui.customer;

import com.ebaotech.salesplatform.mvp.view.model.customer.CustomerViewModel;

/**
 * Created by haydn.chen on 3/15/2016.
 */
public interface CustomerFragment {

  boolean save();

  void setCustomerViewModel(CustomerViewModel customerViewModel);
}

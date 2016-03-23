package com.ebaotech.salesplatform.mvp.view;

import com.ebaotech.salesplatform.core.mvp.View;
import com.ebaotech.salesplatform.mvp.view.model.customer.CustomerViewModel;


public interface CustomerView extends View {

    void setViewModel(CustomerViewModel customerViewModel);

}

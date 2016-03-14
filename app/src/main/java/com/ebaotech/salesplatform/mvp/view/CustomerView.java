package com.ebaotech.salesplatform.mvp.view;

import com.ebaotech.salesplatform.core.mvp.View;
import com.ebaotech.salesplatform.mvp.view.model.customer.CustomerListViewModel;
import com.ebaotech.salesplatform.mvp.view.model.customer.CustomerViewModel;
import java.util.List;

/**
 * Created by radicsrichard on 15. 05. 13..
 */
public interface CustomerView extends View {

    void setViewModel(CustomerViewModel customerViewModel);

}

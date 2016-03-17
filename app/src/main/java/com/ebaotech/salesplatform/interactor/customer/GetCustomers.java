package com.ebaotech.salesplatform.interactor.customer;

import com.ebaotech.salesplatform.core.bo.CustomerBo;
import com.ebaotech.salesplatform.domain.Customer;

import com.ebaotech.salesplatform.domain.CustomerSearch;
import java.util.List;

/**
 * Copyright (C) 2016 ebaotech.com. All rights reserved.
 * Author: Zhu Liliang; Date:3/2/16.
 */
public interface GetCustomers {
    void getCustomers(Callback callback);
    void searchCustomers(CustomerSearch customerSearch, Callback callback);

    interface Callback {
        void onCustomersLoaded(List<Customer> customerList);
        void onError(Exception e);
    }
}

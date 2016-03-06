package com.ebaotech.salesplatform.interactor.customer;

import com.ebaotech.salesplatform.domain.Customer;

import java.util.List;

/**
 * Copyright (C) 2016 ebaotech.com. All rights reserved.
 * Author: Zhu Liliang; Date:3/2/16.
 */
public interface GetCustomers {
    void getCustomers(Callback callback);

    interface Callback {
        void onCustomersLoaded(List<Customer> customerList);
        void onError(Exception e);
    }
}
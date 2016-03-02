package com.ebaotech.salesplatform.interactor.customer;

import com.ebaotech.salesplatform.domain.Customer;
import com.ebaotech.salesplatform.exception.GetCustomersException;

import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.EBean;
import org.androidannotations.annotations.UiThread;

import java.util.List;

import hugo.weaving.DebugLog;

/*
 *  Copyright (c) 2016.  ebaotech.com. All rights reserved.
 *  Author: Zhu Liliang; Date:3/2/16 10:28 PM
 */
@EBean
public class GetCustomersImpl implements GetCustomers {

    private Callback callback;

    @Override
    @Background
    @DebugLog
    public void getCustomers(Callback callback) {
        this.callback = callback;
        try {
            // TODO: 3/2/16 10:17 PM  load data from db or cache
            List<Customer> customerList = DummyContent.ITEMS;
            onItemsLoaded(customerList);
        } catch (GetCustomersException e) {
            onError(e);
        }

    }


    @UiThread
    @DebugLog
    public void onItemsLoaded(List<Customer> customerList) {
        callback.onCustomersLoaded(customerList);
    }

    @UiThread
    public void onError(Exception e) {
        callback.onError(e);
    }

}

package com.ebaotech.salesplatform.interactor.customer;

import com.ebaotech.salesplatform.core.bo.CustomerBo;
import com.ebaotech.salesplatform.core.dao.AddressDao;
import com.ebaotech.salesplatform.core.dao.CustomerDao;
import com.ebaotech.salesplatform.core.dao.FamilyMemberDao;
import com.ebaotech.salesplatform.domain.Customer;
import hugo.weaving.DebugLog;
import java.util.List;
import org.androidannotations.annotations.AfterInject;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.EBean;
import org.androidannotations.annotations.UiThread;

/*
 *  Copyright (c) 2016.  ebaotech.com. All rights reserved.
 *  Author: Zhu Liliang; Date:3/2/16 10:28 PM
 */
@EBean
public class GetCustomerImpl implements GetCustomer {

    private Callback callback;

    @Bean
    protected CustomerDao customerDao;

    @Bean
    protected AddressDao addressDao;

    @Bean
    protected FamilyMemberDao familyMemberDao;

    @Override
    @Background
    @DebugLog
    public void getCustomer(String customerId, Callback callback) {
        this.callback = callback;
        // TODO: 3/2/16 10:17 PM  load data from db or cache
       Customer customer = CustomerMapper.convertCustomerToDomain(customerDao.queryForId(Integer.valueOf(customerId)));
        onItemLoaded(customer);
    }

    @UiThread
    @DebugLog
    public void onItemLoaded(Customer customer) {
        callback.onCustomerLoaded(customer);
    }

    @UiThread
    public void onError(Exception e) {
        callback.onError(e);
    }

}

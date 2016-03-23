package com.ebaotech.salesplatform.interactor.customer;

import android.content.Context;
import com.ebaotech.salesplatform.core.bo.CustomerBo;
import com.ebaotech.salesplatform.core.dao.CustomerDao;
import com.ebaotech.salesplatform.domain.Customer;
import com.ebaotech.salesplatform.domain.CustomerSearch;
import com.ebaotech.salesplatform.exception.GetCustomersException;

import java.sql.SQLException;
import java.util.ArrayList;
import org.androidannotations.annotations.AfterInject;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.EBean;
import org.androidannotations.annotations.RootContext;
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

    @Bean
    protected CustomerDao customerDao;

    @AfterInject
    void init() {
        buildDummyData();
    }

    void buildDummyData() {
        if (customerDao.queryForAll().isEmpty()) {
            for (Customer customer : DummyContent.ITEMS) {
                CustomerBo customerBo = new CustomerBo();
                customerBo.setName(customer.getName());
                customerBo.setAge(customer.getAge());
                customerBo.setGender(customer.getGender());
                customerBo.setComments(customer.getDetails());
                customerDao.createIfNotExists(customerBo);
            }
        }
    }

    @Override
    @Background
    @DebugLog
    public void getCustomers(Callback callback) {
        this.callback = callback;
        // TODO: 3/2/16 10:17 PM  load data from db or cache
        List<Customer> customerList = CustomerMapper.convertCustomerListToDomain(customerDao.queryForAll());
        onItemsLoaded(customerList);
    }

    @Override
    @Background
    @DebugLog
    public void searchCustomers(CustomerSearch customerSearch, Callback callback) {
        this.callback = callback;
        List<Customer> customerList = CustomerMapper.convertCustomerListToDomain(
            customerDao.queryByCriteria(customerSearch.getName(),customerSearch.getGender(),
                customerSearch.getAgeFrom(),customerSearch.getAgeTo(),customerSearch.getIdNumber()));
        onItemsLoaded(customerList);
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

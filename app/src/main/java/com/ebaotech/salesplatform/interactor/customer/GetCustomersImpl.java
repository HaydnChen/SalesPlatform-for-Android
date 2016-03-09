package com.ebaotech.salesplatform.interactor.customer;

import com.ebaotech.salesplatform.core.bo.CustomerBo;
import com.ebaotech.salesplatform.core.dao.CustomerDao;
import com.ebaotech.salesplatform.domain.Customer;

import org.androidannotations.annotations.AfterInject;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.EBean;
import org.androidannotations.annotations.UiThread;

import java.util.ArrayList;
import java.util.List;

import hugo.weaving.DebugLog;

/*
 *  Copyright (c) 2016.  ebaotech.com. All rights reserved.
 *  Author: Zhu Liliang; Date:3/2/16 10:28 PM
 */
@EBean
public class GetCustomersImpl implements GetCustomers {

    @Bean
    protected CustomerDao customerDao;
    private Callback callback;

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
                customerBo.setDetails(customer.getDetails());
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
        List<Customer> customerList = convertToDomain(customerDao.queryForAll());
        onItemsLoaded(customerList);
    }

    @Override
    public Customer convertToDomain(CustomerBo customerBo) {
        Customer customer = new Customer(customerBo.getId().toString(), customerBo.getName(), customerBo.getAge(), customerBo.getGender(), customerBo.getDetails());
        return customer;
    }

    @Override
    public List<Customer> convertToDomain(List<CustomerBo> customerBoList) {
        List<Customer> customerList = new ArrayList<Customer>();
        for (CustomerBo bo : customerBoList) {
            customerList.add(convertToDomain(bo));
        }
        return customerList;
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

package com.ebaotech.salesplatform.mvp.presenter;

import com.ebaotech.salesplatform.core.mvp.Presenter;
import com.ebaotech.salesplatform.core.mvp.View;
import com.ebaotech.salesplatform.domain.Customer;
import com.ebaotech.salesplatform.interactor.customer.GetCustomers;
import com.ebaotech.salesplatform.interactor.customer.GetCustomersImpl;
import com.ebaotech.salesplatform.mvp.view.CustomerListView;
import com.ebaotech.salesplatform.mvp.view.model.customer.CustomerListViewModel;

import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.EBean;
import org.androidannotations.annotations.UiThread;

import java.util.ArrayList;
import java.util.List;

/*
 *  Copyright (c) 2016.  ebaotech.com. All rights reserved.
 *  Author: Zhu Liliang; Date:3/2/16 10:56 PM
 */

@EBean(scope = EBean.Scope.Singleton)
public class CustomerListPresenter extends BasePresenter implements Presenter {

    private CustomerListView customerListView;

    @Bean(GetCustomersImpl.class)
    GetCustomers getCustomers;

    @Override
    public void setView(View view) {
        this.customerListView = (CustomerListView) view;
    }


    @Override
    public void start() {
        customerListView.showLoading("Loading");

        getCustomers.getCustomers(new GetCustomers.Callback() {

            @Override
            public void onCustomersLoaded(List<Customer> customerList) {
                customerListView.setListViewModels(convertToMainModel(customerList));
                customerListView.hideLoading(true);
            }

            @Override
            public void onError(Exception e) {
                customerListView.showActionLabel("Error during fetching data!");
                customerListView.hideLoading(false);
            }
        });
    }


    @Override
    public void stop() {
        //TODO if something needed to
    }

    @Override
    @UiThread
    public void onError(Exception exception) {
        customerListView.showActionLabel(exception.getMessage());
    }

    public List<CustomerListViewModel> convertToMainModel(List<Customer> customerList) {
        List<CustomerListViewModel> modelList = new ArrayList<>();
        try {

            for (Customer item : customerList) {
                CustomerListViewModel customerListViewModel = new CustomerListViewModel();
                customerListViewModel.setId(item.getId());
                customerListViewModel.setAge(item.getAge());
                customerListViewModel.setGender(item.getGender());
                customerListViewModel.setName(item.getName());
                customerListViewModel.setDetails(item.getDetails());

                modelList.add(customerListViewModel);
            }
        } catch (Exception e) {
            cleanErrorHandler.logExpception(e);
        }
        return modelList;
    }

}

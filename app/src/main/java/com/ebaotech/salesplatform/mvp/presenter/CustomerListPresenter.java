package com.ebaotech.salesplatform.mvp.presenter;

import com.ebaotech.salesplatform.core.mvp.Presenter;
import com.ebaotech.salesplatform.core.mvp.View;
import com.ebaotech.salesplatform.domain.Customer;
import com.ebaotech.salesplatform.domain.CustomerSearch;
import com.ebaotech.salesplatform.interactor.customer.GetCustomers;
import com.ebaotech.salesplatform.interactor.customer.GetCustomersImpl;
import com.ebaotech.salesplatform.mvp.view.CustomerListView;
import com.ebaotech.salesplatform.mvp.view.model.customer.CustomerListViewModel;

import com.ebaotech.salesplatform.mvp.view.model.customer.CustomerSearchModel;
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
public class CustomerListPresenter extends BasePresenter implements Presenter<List<CustomerListViewModel>,CustomerSearchModel> {

    private CustomerListView customerListView;

    @Bean(GetCustomersImpl.class)
    GetCustomers getCustomers;

    @Override
    public void setView(View view) {
        this.customerListView = (CustomerListView) view;
    }

    @Override public void load(CustomerSearchModel searchModel) {
        customerListView.showLoading("Loading");

        getCustomers.searchCustomers(convertCustomerSearchModelToDomain(searchModel),
            new GetCustomers.Callback() {

                @Override public void onCustomersLoaded(List<Customer> customerList) {
                    customerListView.onViewModelLoaded(convertToMainModel(customerList));
                    customerListView.hideLoading(true);
                }

                @Override public void onError(Exception e) {
                    customerListView.showActionLabel("Error during fetching data!");
                    customerListView.hideLoading(false);
                }
        });
    }

    @Override public void save(List<CustomerListViewModel> viewModel) {

    }

    @Override public void delete(CustomerSearchModel searchModel) {

    }

    @Override
    @UiThread
    public void onError(Exception exception) {
        customerListView.showActionLabel(exception.getMessage());
    }

    public CustomerSearch convertCustomerSearchModelToDomain(CustomerSearchModel customerSearchModel) {
        CustomerSearch customerSearch = new CustomerSearch();
        customerSearch.setName(customerSearchModel.getName());
        customerSearch.setGender(customerSearchModel.getGender());
        customerSearch.setAgeFrom(customerSearchModel.getAgeFrom());
        customerSearch.setAgeTo(customerSearchModel.getAgeTo());
        customerSearch.setIdNumber(customerSearchModel.getIdNumber());
        return customerSearch;
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

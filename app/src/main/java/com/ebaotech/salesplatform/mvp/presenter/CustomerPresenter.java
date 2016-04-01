package com.ebaotech.salesplatform.mvp.presenter;

import com.ebaotech.salesplatform.core.mvp.Presenter;
import com.ebaotech.salesplatform.core.mvp.View;
import com.ebaotech.salesplatform.domain.Address;
import com.ebaotech.salesplatform.domain.Customer;
import com.ebaotech.salesplatform.domain.FamilyMember;
import com.ebaotech.salesplatform.interactor.customer.GetCustomer;
import com.ebaotech.salesplatform.interactor.customer.GetCustomerImpl;
import com.ebaotech.salesplatform.mapper.domain2model.CustomerDomainModelMapper;
import com.ebaotech.salesplatform.mvp.view.CustomerView;
import com.ebaotech.salesplatform.mvp.view.model.customer.AddressViewModel;
import com.ebaotech.salesplatform.mvp.view.model.customer.CustomerSearchModel;
import com.ebaotech.salesplatform.mvp.view.model.customer.CustomerViewModel;
import com.ebaotech.salesplatform.mvp.view.model.customer.FamilyViewModel;

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
public class CustomerPresenter extends BasePresenter implements Presenter<CustomerViewModel, String> {

    private CustomerView customerView;

    private String customerId;

    @Bean(GetCustomerImpl.class) GetCustomer getCustomer;

    @Override
    public void setView(View view) {
        this.customerView = (CustomerView) view;
    }

    @Override
    public void load(String customerId) {
        customerView.showLoading("Loading");

        getCustomer.getCustomer(customerId, new GetCustomer.LoadCallback() {
            @Override public void onCustomerLoaded(Customer customer) {
                customerView.onViewModelLoaded(CustomerDomainModelMapper.convertCustomerToModel(
                    customer)); customerView.hideLoading(true);
            }

            @Override public void onError(Exception e) {
                customerView.showActionLabel("Error during fetching data!");
                customerView.hideLoading(false);
            }
        });
    }

    @Override
    public void save(CustomerViewModel customerViewModel) {
        customerView.showLoading("Loading");
        Customer customer = CustomerDomainModelMapper.convertCustomerViewModelToDomain(
            customerViewModel);
        getCustomer.saveCustomer(customer, new GetCustomer.SaveCallback() {

            @Override public void onCustomerSaved(Customer customer) {
                customerView.onViewModelSaved(CustomerDomainModelMapper.convertCustomerToModel(
                    customer));
                customerView.hideLoading(true);
            }

            @Override public void onError(Exception e) {
                customerView.showActionLabel("Error during saving data!");
                customerView.hideLoading(false);
            }
        });
    }

    public void delete(String customerId) {
        customerView.showLoading("Loading");
        getCustomer.deleteCustomer(customerId, new GetCustomer.DeleteCallback() {

            @Override public void onCustomerDeleted() {
                customerView.onViewModelDeleted();
                customerView.hideLoading(true);
            }

            @Override public void onError(Exception e) {
                customerView.showActionLabel("Error during deleting data!");
                customerView.hideLoading(false);
            }
        });
    }

    @Override
    @UiThread
    public void onError(Exception exception) {
        customerView.showActionLabel(exception.getMessage());
    }
}

package com.ebaotech.salesplatform.mvp.presenter;

import com.ebaotech.salesplatform.core.mvp.Presenter;
import com.ebaotech.salesplatform.core.mvp.View;
import com.ebaotech.salesplatform.domain.Address;
import com.ebaotech.salesplatform.domain.Customer;
import com.ebaotech.salesplatform.domain.FamilyMember;
import com.ebaotech.salesplatform.interactor.customer.GetCustomer;
import com.ebaotech.salesplatform.interactor.customer.GetCustomerImpl;
import com.ebaotech.salesplatform.mvp.view.CustomerView;
import com.ebaotech.salesplatform.mvp.view.model.customer.AddressViewModel;
import com.ebaotech.salesplatform.mvp.view.model.customer.CustomerViewModel;
import com.ebaotech.salesplatform.mvp.view.model.customer.FamilyViewModel;
import java.util.ArrayList;
import java.util.List;
import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.EBean;
import org.androidannotations.annotations.UiThread;

/*
 *  Copyright (c) 2016.  ebaotech.com. All rights reserved.
 *  Author: Zhu Liliang; Date:3/2/16 10:56 PM
 */

@EBean(scope = EBean.Scope.Singleton)
public class CustomerPresenter extends BasePresenter implements Presenter {

    private CustomerView customerView;

    private String customerId;

    @Bean(GetCustomerImpl.class) GetCustomer getCustomer;

    @Override
    public void setView(View view) {
        this.customerView = (CustomerView) view;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    @Override
    public void start() {
        customerView.showLoading("Loading");

        getCustomer.getCustomer(customerId, new GetCustomer.Callback() {

                @Override public void onCustomerLoaded(Customer customer) {
                    customerView.setViewModel(convertCustomerToModel(customer));
                    customerView.hideLoading(true);
                }

                @Override public void onError(Exception e) {
                    customerView.showActionLabel("Error during fetching data!");
                    customerView.hideLoading(false);
                }
            }

        );
    }


    @Override
    public void stop() {
        //TODO if something needed to
    }

    @Override
    @UiThread
    public void onError(Exception exception) {
        customerView.showActionLabel(exception.getMessage());
    }

    public CustomerViewModel convertCustomerToModel(Customer customer) {
        CustomerViewModel customerViewModel = new CustomerViewModel();
        customerViewModel.setId(customer.getId());
        customerViewModel.setName(customer.getName());
        customerViewModel.setAge(customer.getAge());
        customerViewModel.setDetails(customer.getDetails());
        customerViewModel.setIdNumber(customer.getIdNumber());
        customerViewModel.setCountry(customer.getCountry());
        customerViewModel.setGender(customer.getGender());
        customerViewModel.setMaritalStatus(customer.getMaritalStatus());
        customerViewModel.setMobile(customer.getMobile());
        customerViewModel.setEmail(customer.getEmail());
        if (customer.getAddresses()!=null) {
            customerViewModel.setAddressViewModels(convertAddressListToModelList(customer.getAddresses()));
        }
        if (customer.getFamilyMembers()!=null) {
            customerViewModel.setFamilyViewModels(convertFamilyListToModelList(customer.getFamilyMembers()));
        }
        return customerViewModel;
    }

    public AddressViewModel convertAddressToModel(Address address) {
        AddressViewModel addressViewModel = new AddressViewModel();
        addressViewModel.setId(address.getId());
        addressViewModel.setType(address.getType());
        addressViewModel.setCity(address.getCity());
        addressViewModel.setCountry(address.getCountry());
        addressViewModel.setPostcode(address.getPostcode());
        return addressViewModel;
    }

    public List<AddressViewModel> convertAddressListToModelList(List<Address> addressList) {
        List<AddressViewModel> addressViewModelList = new ArrayList<AddressViewModel>();
        for (Address address : addressList) {
            addressViewModelList.add(convertAddressToModel(address));
        }
        return addressViewModelList;
    }

    public FamilyViewModel convertFamilyToModel(FamilyMember familyMember) {
        FamilyViewModel familyViewModel = new FamilyViewModel();
        familyViewModel.setId(familyMember.getId());
        familyViewModel.setAge(familyMember.getAge());
        familyViewModel.setName(familyMember.getName());
        familyViewModel.setRelationToPh(familyMember.getRelationToPh());
        familyViewModel.setGender(familyMember.getGender());
        familyViewModel.setMobile(familyMember.getMobile());
        familyViewModel.setEmail(familyMember.getEmail());
        return familyViewModel;
    }

    public List<FamilyViewModel> convertFamilyListToModelList(List<FamilyMember> familyMemberList) {
        List<FamilyViewModel> familyViewModelList = new ArrayList<FamilyViewModel>();
        for (FamilyMember familyMember : familyMemberList) {
            familyViewModelList.add(convertFamilyToModel(familyMember));
        }
        return familyViewModelList;
    }
}

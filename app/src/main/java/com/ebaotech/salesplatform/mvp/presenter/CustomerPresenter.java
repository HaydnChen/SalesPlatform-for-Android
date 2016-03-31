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
                customerView.onViewModelLoaded(convertCustomerToModel(customer));
                customerView.hideLoading(true);
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
        Customer customer = convertCustomerViewModelToDomain(customerViewModel);
        getCustomer.saveCustomer(customer, new GetCustomer.SaveCallback() {

            @Override public void onCustomerSaved(Customer customer) {
                customerView.onViewModelSaved(convertCustomerToModel(customer));
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

    public static CustomerViewModel convertCustomerToModel(Customer customer) {
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

    public Customer convertCustomerViewModelToDomain(CustomerViewModel customerViewModel) {
        Customer customer = new Customer();
        customer.setId(customerViewModel.getId());
        customer.setName(customerViewModel.getName());
        customer.setAge(customerViewModel.getAge());
        customer.setDetails(customerViewModel.getDetails());
        customer.setIdNumber(customerViewModel.getIdNumber());
        customer.setCountry(customerViewModel.getCountry());
        customer.setGender(customerViewModel.getGender());
        customer.setMaritalStatus(customerViewModel.getMaritalStatus());
        customer.setMobile(customerViewModel.getMobile());
        customer.setEmail(customerViewModel.getEmail());
        if (customerViewModel.getAddressViewModels()!=null) {
            customer.setAddresses(convertAddressViewModelListToDomain(customerViewModel.getAddressViewModels()));
        }
        if (customerViewModel.getFamilyViewModels()!=null) {
            customer.setFamilyMembers(convertFamilyViewModelListToDomain(customerViewModel.getFamilyViewModels()));
        }
        return customer;
    }

    public static AddressViewModel convertAddressToModel(Address address) {
        AddressViewModel addressViewModel = new AddressViewModel();
        addressViewModel.setId(address.getId());
        addressViewModel.setType(address.getType());
        addressViewModel.setAddress(address.getAddress());
        addressViewModel.setCity(address.getCity());
        addressViewModel.setCountry(address.getCountry());
        addressViewModel.setPostcode(address.getPostcode());
        return addressViewModel;
    }

    public Address convertAddressViewModelToDomain(AddressViewModel addressViewModel) {
        Address address = new Address();
        address.setId(addressViewModel.getId());
        address.setType(addressViewModel.getType());
        address.setAddress(addressViewModel.getAddress());
        address.setCity(addressViewModel.getCity());
        address.setCountry(addressViewModel.getCountry());
        address.setPostcode(addressViewModel.getPostcode());
        return address;
    }

        public static List<AddressViewModel> convertAddressListToModelList(List<Address> addressList) {

            List<AddressViewModel> addressViewModelList = new ArrayList<AddressViewModel>();
        for (Address address : addressList) {
            addressViewModelList.add(convertAddressToModel(address));
        }
        return addressViewModelList;
    }

    public List<Address> convertAddressViewModelListToDomain(List<AddressViewModel> addressViewModelList) {
        List<Address> addressList = new ArrayList<Address>();
        for (AddressViewModel addressViewModel : addressViewModelList) {
            addressList.add(convertAddressViewModelToDomain(addressViewModel));
        }
        return addressList;
    }

        public static FamilyViewModel convertFamilyToModel(FamilyMember familyMember) {
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


    public FamilyMember convertFamilyViewModelToDomain(FamilyViewModel familyViewModel) {
        FamilyMember familyMember = new FamilyMember();
        familyMember.setId(familyViewModel.getId());
        familyMember.setAge(familyViewModel.getAge());
        familyMember.setName(familyViewModel.getName());
        familyMember.setRelationToPh(familyViewModel.getRelationToPh());
        familyMember.setGender(familyViewModel.getGender());
        familyMember.setMobile(familyViewModel.getMobile());
        familyMember.setEmail(familyViewModel.getEmail());
        return familyMember;
    }

    public static List<FamilyViewModel> convertFamilyListToModelList(List<FamilyMember> familyMemberList) {

        List<FamilyViewModel> familyViewModelList = new ArrayList<FamilyViewModel>();
        for (FamilyMember familyMember : familyMemberList) {
            familyViewModelList.add(convertFamilyToModel(familyMember));
        }
        return familyViewModelList;
    }

    public List<FamilyMember> convertFamilyViewModelListToDomain(List<FamilyViewModel> familyViewModelList) {
        List<FamilyMember> familyMemberList = new ArrayList<FamilyMember>();
        for (FamilyViewModel familyViewModel : familyViewModelList) {
            familyMemberList.add(convertFamilyViewModelToDomain(familyViewModel));
        }
        return familyMemberList;
    }
}

package com.ebaotech.salesplatform.mapper.domain2model;

import com.ebaotech.salesplatform.domain.Address;
import com.ebaotech.salesplatform.domain.Customer;
import com.ebaotech.salesplatform.domain.FamilyMember;
import com.ebaotech.salesplatform.mvp.view.model.customer.AddressViewModel;
import com.ebaotech.salesplatform.mvp.view.model.customer.CustomerViewModel;
import com.ebaotech.salesplatform.mvp.view.model.customer.FamilyViewModel;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by haydn.chen on 4/1/2016.
 */
public class CustomerDomainModelMapper {
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

  public static Customer convertCustomerViewModelToDomain(CustomerViewModel customerViewModel) {
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

  public static Address convertAddressViewModelToDomain(AddressViewModel addressViewModel) {
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

  public static List<Address> convertAddressViewModelListToDomain(List<AddressViewModel> addressViewModelList) {
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


  public static FamilyMember convertFamilyViewModelToDomain(FamilyViewModel familyViewModel) {
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

  public static List<FamilyMember> convertFamilyViewModelListToDomain(List<FamilyViewModel> familyViewModelList) {
    List<FamilyMember> familyMemberList = new ArrayList<FamilyMember>();
    for (FamilyViewModel familyViewModel : familyViewModelList) {
      familyMemberList.add(convertFamilyViewModelToDomain(familyViewModel));
    }
    return familyMemberList;
  }
}

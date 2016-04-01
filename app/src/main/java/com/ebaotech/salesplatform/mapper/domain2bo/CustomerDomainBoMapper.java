package com.ebaotech.salesplatform.mapper.domain2bo;

import com.ebaotech.salesplatform.core.bo.AddressBo;
import com.ebaotech.salesplatform.core.bo.CustomerBo;
import com.ebaotech.salesplatform.core.bo.FamilyMemberBo;
import com.ebaotech.salesplatform.domain.Address;
import com.ebaotech.salesplatform.domain.Customer;
import com.ebaotech.salesplatform.domain.FamilyMember;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

/**
 * Created by haydn.chen on 3/9/2016.
 */
public class CustomerDomainBoMapper {

  public static Customer convertCustomerToDomain(CustomerBo customerBo) {
    Customer customer = new Customer();
    customer.setId(customerBo.getId().toString());
    customer.setName(customerBo.getName());
    customer.setTitle(customerBo.getTitle());
    customer.setBirthday(customerBo.getBirthday());
    customer.setAge(customerBo.getAge());
    customer.setGender(customerBo.getGender());
    customer.setCountry(customerBo.getCountry());
    customer.setOccupation(customerBo.getOccupation());
    customer.setDetails(customerBo.getComments());
    customer.setIdType(customerBo.getIdType());
    customer.setIdNumber(customerBo.getIdNumber());
    customer.setMaritalStatus(customerBo.getMaritalStatus());
    customer.setMobile(customerBo.getMobile());
    customer.setEmail(customerBo.getEmail());
    customer.setPhone(customerBo.getPhone());
    if (customerBo.getAddresses()!=null) {
      customer.setAddresses(convertAddressListToDomain(customerBo.getAddresses()));
    }
    if (customerBo.getFamilyMembers()!=null) {
      customer.setFamilyMembers(convertFamilyMemberListToDomain(customerBo.getFamilyMembers()));
    }
    return customer;
  }

  public static List<Customer> convertCustomerListToDomain(List<CustomerBo> customerBoList) {
    List<Customer> customerList = new ArrayList<Customer>();
    for (CustomerBo bo : customerBoList) {
      customerList.add(convertCustomerToDomain(bo));
    }
    return customerList;
  }

  public static Address convertAddressToDomain(AddressBo addressBo) {
    Address address = new Address();
    address.setId(addressBo.getId().toString());
    address.setAddress(addressBo.getAddress());
    address.setType(addressBo.getType());
    address.setCity(addressBo.getCity());
    address.setCountry(addressBo.getCountry());
    address.setPostcode(addressBo.getPostcode());
    return address;
  }

  public static AddressBo convertAddressToBo(Address address) {
    AddressBo addressBo = new AddressBo();
    if (StringUtils.isNotBlank(address.getId())) {
      addressBo.setId(Integer.valueOf(address.getId()));
    }
    addressBo.setType(address.getType());
    addressBo.setAddress(address.getAddress());
    addressBo.setCity(address.getCity());
    addressBo.setCountry(address.getCountry());
    addressBo.setPostcode(address.getPostcode());
    return addressBo;
  }

  public static List<Address> convertAddressListToDomain(Collection<AddressBo> addressBoList) {
    List<Address> addressList = new ArrayList<Address>();
    for (AddressBo bo : addressBoList) {
      addressList.add(convertAddressToDomain(bo));
    }
    return addressList;
  }

  public static FamilyMember convertFamilyMemberToDomain(FamilyMemberBo familyMemberBo) {
    FamilyMember familyMember = new FamilyMember();
    familyMember.setId(familyMemberBo.getId().toString());
    familyMember.setRelationToPh(familyMemberBo.getRelationToPh());
    familyMember.setName(familyMemberBo.getName());
    familyMember.setBirthday(familyMemberBo.getBirthday());
    familyMember.setAge(familyMemberBo.getAge());
    familyMember.setGender(familyMemberBo.getGender());
    familyMember.setOccupation(familyMemberBo.getOccupation());
    familyMember.setMobile(familyMemberBo.getMobile());
    familyMember.setEmail(familyMemberBo.getEmail());
    return familyMember;
  }

  public static FamilyMemberBo convertFamilyMemberToBo(FamilyMember familyMember) {
    FamilyMemberBo familyMemberBo = new FamilyMemberBo();
    if (StringUtils.isNotBlank(familyMember.getId())) {
      familyMemberBo.setId(Integer.valueOf(familyMember.getId()));
    }
    familyMemberBo.setRelationToPh(familyMember.getRelationToPh());
    familyMemberBo.setName(familyMember.getName());
    familyMemberBo.setBirthday(familyMember.getBirthday());
    familyMemberBo.setAge(familyMember.getAge());
    familyMemberBo.setGender(familyMember.getGender());
    familyMemberBo.setOccupation(familyMember.getOccupation());
    familyMemberBo.setMobile(familyMember.getMobile());
    familyMemberBo.setEmail(familyMember.getEmail());
    return familyMemberBo;
  }

  public static List<FamilyMember> convertFamilyMemberListToDomain(Collection<FamilyMemberBo> familyMemberBoList) {
    List<FamilyMember> familyMemberList = new ArrayList<FamilyMember>();
    for (FamilyMemberBo bo : familyMemberBoList) {
      familyMemberList.add(convertFamilyMemberToDomain(bo));
    }
    return familyMemberList;
  }
}

package com.ebaotech.salesplatform.interactor.customer;

import com.ebaotech.salesplatform.core.bo.AddressBo;
import com.ebaotech.salesplatform.core.bo.CustomerBo;
import com.ebaotech.salesplatform.core.bo.FamilyMemberBo;
import com.ebaotech.salesplatform.core.dao.AddressDao;
import com.ebaotech.salesplatform.core.dao.CustomerDao;
import com.ebaotech.salesplatform.core.dao.FamilyMemberDao;
import com.ebaotech.salesplatform.domain.Address;
import com.ebaotech.salesplatform.domain.Customer;
import com.ebaotech.salesplatform.domain.FamilyMember;
import com.j256.ormlite.dao.ForeignCollection;
import hugo.weaving.DebugLog;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.EBean;
import org.androidannotations.annotations.UiThread;
import org.apache.commons.lang3.StringUtils;

/*
 *  Copyright (c) 2016.  ebaotech.com. All rights reserved.
 *  Author: Zhu Liliang; Date:3/2/16 10:28 PM
 */
@EBean
public class GetCustomerImpl implements GetCustomer {
    private LoadCallback loadCallback;
    private SaveCallback saveCallback;
    private DeleteCallback deleteCallback;

    @Bean
    protected CustomerDao customerDao;

    @Bean
    protected AddressDao addressDao;

    @Bean
    protected FamilyMemberDao familyMemberDao;

    @UiThread
    @DebugLog
    public void onItemLoaded(Customer customer) {
        loadCallback.onCustomerLoaded(customer);
    }

    @UiThread
    @DebugLog
    public void onItemSaved(Customer customer) {
        saveCallback.onCustomerSaved(customer);
    }

    @UiThread
    @DebugLog
    public void onItemDelete() {
        deleteCallback.onCustomerDeleted();
    }

    @Background
    @DebugLog
    @Override
    public void getCustomer(String customerId, LoadCallback loadCallback) {
        this.loadCallback = loadCallback;
        Customer customer;
        if (StringUtils.isNotBlank(customerId)) {
            customer = CustomerMapper.convertCustomerToDomain(customerDao.queryForId(Integer.valueOf(customerId)));
        } else {
            customer = new Customer();
        }
        onItemLoaded(customer);
    }

    @Background
    @DebugLog
    @Override
    public void saveCustomer(Customer customer, SaveCallback saveCallback) {
        this.saveCallback = saveCallback;
        CustomerBo customerBo;
        if (StringUtils.isNotBlank(customer.getId())) {
            customerBo = customerDao.queryForId(Integer.valueOf(customer.getId()));
        } else {
            customerBo = new CustomerBo();
        }
        customerBo.setName(customer.getName());
        customerBo.setTitle(customer.getTitle());
        customerBo.setAge(customer.getAge());
        customerBo.setGender(customer.getGender());
        customerBo.setBirthday(customer.getBirthday());
        customerBo.setCountry(customer.getCountry());
        customerBo.setOccupation(customer.getOccupation());
        customerBo.setComments(customer.getDetails());
        customerBo.setIdNumber(customer.getIdType());
        customerBo.setIdNumber(customer.getIdNumber());
        customerBo.setMaritalStatus(customer.getMaritalStatus());
        customerBo.setMobile(customer.getMobile());
        customerBo.setEmail(customer.getEmail());
        customerBo.setPhone(customer.getPhone());
        if (customerBo.getAddresses() != null) {
            for (AddressBo addressBo : customerBo.getAddresses()) {
                addressBo.setCustomer(null);
                addressDao.delete(addressBo);
            }
            customerBo.getAddresses().clear();
        }
        if (customerBo.getFamilyMembers()!=null) {
            for (FamilyMemberBo familyMemberBo : customerBo.getFamilyMembers()){
                familyMemberBo.setCustomer(null);
                familyMemberDao.delete(familyMemberBo);
            }
            customerBo.getFamilyMembers().clear();
        }
        customerDao.createOrUpdate(customerBo);
        ForeignCollection<AddressBo> addressBos = customerDao.getEmptyForeignCollection("addresses");
        customerBo.setAddresses(addressBos);
        if (customer.getAddresses() != null) {
            for (Address address : customer.getAddresses()) {
                AddressBo addressBo = CustomerMapper.convertAddressToBo(address);
                addressBo.setCustomer(customerBo);
                customerBo.getAddresses().add(addressBo);
            }
        }
        ForeignCollection<FamilyMemberBo> familyMemberBos = customerDao.getEmptyForeignCollection("familyMembers");
        customerBo.setFamilyMembers(familyMemberBos);
        if (customer.getFamilyMembers()!=null) {
            for (FamilyMember familyMember : customer.getFamilyMembers()) {
                FamilyMemberBo familyMemberBo = CustomerMapper.convertFamilyMemberToBo(familyMember);
                familyMemberBo.setCustomer(customerBo);
                customerBo.getFamilyMembers().add(familyMemberBo);
            }
        }
        customerDao.createOrUpdate(customerBo);
        onItemSaved(customer);
    }

    @Background
    @DebugLog
    @Override
    public void deleteCustomer(String customerId, DeleteCallback deleteCallback) {
        this.deleteCallback = deleteCallback;
        if (StringUtils.isNotBlank(customerId)) {
            CustomerBo customerBo = customerDao.queryForId(Integer.valueOf(customerId));
            if (customerBo.getAddresses() != null) {
                for (AddressBo addressBo : customerBo.getAddresses()) {
                    addressBo.setCustomer(null);
                    addressDao.delete(addressBo);
                }
                customerBo.getAddresses().clear();
            }
            if (customerBo.getFamilyMembers()!=null) {
                for (FamilyMemberBo familyMemberBo : customerBo.getFamilyMembers()){
                    familyMemberBo.setCustomer(null);
                    familyMemberDao.delete(familyMemberBo);
                }
                customerBo.getFamilyMembers().clear();
            }
            customerDao.delete(customerBo);
        }
        onItemDelete();
    }
}

package com.ebaotech.salesplatform.interactor.customer;

import com.ebaotech.salesplatform.domain.Customer;
import java.util.List;

/**
 * Created by haydn.chen on 3/11/2016.
 */
public interface GetCustomer {
  void getCustomer(String customerId, LoadCallback loadCallback);
  void saveCustomer(Customer customer, SaveCallback saveCallback);
  void deleteCustomer(String customerId, DeleteCallback deleteCallback);

  interface LoadCallback {
    void onCustomerLoaded(Customer customer);
    void onError(Exception e);
  }

  interface SaveCallback {
    void onCustomerSaved(Customer customer);
    void onError(Exception e);
  }

  interface DeleteCallback {
    void onCustomerDeleted();
    void onError(Exception e);
  }
}

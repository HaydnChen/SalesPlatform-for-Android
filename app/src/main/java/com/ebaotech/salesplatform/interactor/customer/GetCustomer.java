package com.ebaotech.salesplatform.interactor.customer;

import com.ebaotech.salesplatform.domain.Customer;
import java.util.List;

/**
 * Created by haydn.chen on 3/11/2016.
 */
public interface GetCustomer {
  void getCustomer(String customerId, Callback callback);
  void saveCustomer(Customer customer);

  interface Callback {
    void onCustomerLoaded(Customer customer);
    void onError(Exception e);
  }
}

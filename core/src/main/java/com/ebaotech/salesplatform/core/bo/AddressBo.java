package com.ebaotech.salesplatform.core.bo;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by haydn.chen on 3/9/2016.
 */
@DatabaseTable(tableName = "t_address")
public class AddressBo {
  @DatabaseField(generatedId = true)
  private Integer id;
  @DatabaseField
  private String type;
  @DatabaseField
  private String city;
  @DatabaseField
  private String country;
  @DatabaseField
  private String address;
  @DatabaseField
  private String postcode;
  @DatabaseField(foreign = true, foreignAutoRefresh = true,columnName="customer_id")
  private CustomerBo customer;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getPostcode() {
    return postcode;
  }

  public void setPostcode(String postcode) {
    this.postcode = postcode;
  }

  public CustomerBo getCustomer() {
    return customer;
  }

  public void setCustomer(CustomerBo customer) {
    this.customer = customer;
  }
}

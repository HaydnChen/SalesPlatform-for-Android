package com.ebaotech.salesplatform.mvp.view.model.customer;

import java.util.List;

/**
 * Created by haydn.chen on 3/11/2016.
 */
public class CustomerViewModel {

  private String id;
  private String name;
  private Integer age;
  private String gender;
  private String country;
  private String details;
  private String idNumber;
  private String maritalStatus;
  private String mobile;
  private String email;
  private List<AddressViewModel> addressViewModels;
  private List<FamilyViewModel> familyViewModels;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public String getDetails() {
    return details;
  }

  public void setDetails(String details) {
    this.details = details;
  }

  public String getIdNumber() {
    return idNumber;
  }

  public void setIdNumber(String idNumber) {
    this.idNumber = idNumber;
  }

  public String getMaritalStatus() {
    return maritalStatus;
  }

  public void setMaritalStatus(String maritalStatus) {
    this.maritalStatus = maritalStatus;
  }

  public String getMobile() {
    return mobile;
  }

  public void setMobile(String mobile) {
    this.mobile = mobile;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public List<AddressViewModel> getAddressViewModels() {
    return addressViewModels;
  }

  public void setAddressViewModels(List<AddressViewModel> addressViewModels) {
    this.addressViewModels = addressViewModels;
  }

  public List<FamilyViewModel> getFamilyViewModels() {
    return familyViewModels;
  }

  public void setFamilyViewModels(List<FamilyViewModel> familyViewModels) {
    this.familyViewModels = familyViewModels;
  }
}

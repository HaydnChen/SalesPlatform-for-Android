package com.ebaotech.salesplatform.domain;

/**
 * Created by haydn.chen on 3/17/2016.
 */
public class CustomerSearch {
  private String name;
  private String gender;
  private Integer ageFrom;
  private Integer ageTo;
  private String idNumber;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public Integer getAgeFrom() {
    return ageFrom;
  }

  public void setAgeFrom(Integer ageFrom) {
    this.ageFrom = ageFrom;
  }

  public Integer getAgeTo() {
    return ageTo;
  }

  public void setAgeTo(Integer ageTo) {
    this.ageTo = ageTo;
  }

  public String getIdNumber() {
    return idNumber;
  }

  public void setIdNumber(String idNumber) {
    this.idNumber = idNumber;
  }
}

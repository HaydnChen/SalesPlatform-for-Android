package com.ebaotech.salesplatform.core.bo.prospect;

import com.ebaotech.salesplatform.core.bo.AbstractSyncableBo;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import java.util.UUID;

/**
 * Created by haydn.chen on 4/1/2016.
 */
@DatabaseTable(tableName = "T_SP_ADDRESS")
public class AddressBo extends AbstractSyncableBo {
  @DatabaseField
  private String address1;
  @DatabaseField
  private String address2;
  @DatabaseField
  private String address3;
  @DatabaseField
  private String address4;
  @DatabaseField
  private String address5;
  @DatabaseField
  private String address6;
  @DatabaseField
  private String address7;
  @DatabaseField
  private String addressFormat;
  @DatabaseField
  private String postCode;
  @DatabaseField
  private String state;
  @DatabaseField
  private String countryCode;
  @DatabaseField
  private String foreignIndi;
  @DatabaseField
  private String addressFormatType;
  @DatabaseField
  private String city;
  @DatabaseField
  private String telephone;

  public String getAddress1() {
    return address1;
  }

  public void setAddress1(String address1) {
    this.address1 = address1;
  }

  public String getAddress2() {
    return address2;
  }

  public void setAddress2(String address2) {
    this.address2 = address2;
  }

  public String getAddress3() {
    return address3;
  }

  public void setAddress3(String address3) {
    this.address3 = address3;
  }

  public String getAddress4() {
    return address4;
  }

  public void setAddress4(String address4) {
    this.address4 = address4;
  }

  public String getAddress5() {
    return address5;
  }

  public void setAddress5(String address5) {
    this.address5 = address5;
  }

  public String getAddress6() {
    return address6;
  }

  public void setAddress6(String address6) {
    this.address6 = address6;
  }

  public String getAddress7() {
    return address7;
  }

  public void setAddress7(String address7) {
    this.address7 = address7;
  }

  public String getAddressFormat() {
    return addressFormat;
  }

  public void setAddressFormat(String addressFormat) {
    this.addressFormat = addressFormat;
  }

  public String getPostCode() {
    return postCode;
  }

  public void setPostCode(String postCode) {
    this.postCode = postCode;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public String getForeignIndi() {
    return foreignIndi;
  }

  public void setForeignIndi(String foreignIndi) {
    this.foreignIndi = foreignIndi;
  }

  public String getAddressFormatType() {
    return addressFormatType;
  }

  public void setAddressFormatType(String addressFormatType) {
    this.addressFormatType = addressFormatType;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getTelephone() {
    return telephone;
  }

  public void setTelephone(String telephone) {
    this.telephone = telephone;
  }
}

package com.ebaotech.salesplatform.core.bo.quotation;

import com.ebaotech.salesplatform.core.bo.prospect.AddressBo;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import java.util.Date;

/**
 * Created by haydn.chen on 4/5/2016.
 */
@DatabaseTable(tableName = "T_SP_POLICY_HOLDER")
public class PolicyHolderBo extends QuotationRoleBo {
  @DatabaseField(foreign = true, foreignAutoRefresh = true, columnName = "ADDRESS_OFFLINE_ID")
  private AddressBo address;
  @DatabaseField
  private Long applicantAge;
  @DatabaseField
  private Date birthDay;
  @DatabaseField
  private String telephone;
  @DatabaseField
  private String mobileTel;
  @DatabaseField
  private String dispatchType;
  @DatabaseField
  private String companyOrTrustName;

  public AddressBo getAddress() {
    return address;
  }

  public void setAddress(AddressBo address) {
    this.address = address;
  }

  public Long getApplicantAge() {
    return applicantAge;
  }

  public void setApplicantAge(Long applicantAge) {
    this.applicantAge = applicantAge;
  }

  public Date getBirthDay() {
    return birthDay;
  }

  public void setBirthDay(Date birthDay) {
    this.birthDay = birthDay;
  }

  public String getTelephone() {
    return telephone;
  }

  public void setTelephone(String telephone) {
    this.telephone = telephone;
  }

  public String getMobileTel() {
    return mobileTel;
  }

  public void setMobileTel(String mobileTel) {
    this.mobileTel = mobileTel;
  }

  public String getDispatchType() {
    return dispatchType;
  }

  public void setDispatchType(String dispatchType) {
    this.dispatchType = dispatchType;
  }

  public String getCompanyOrTrustName() {
    return companyOrTrustName;
  }

  public void setCompanyOrTrustName(String companyOrTrustName) {
    this.companyOrTrustName = companyOrTrustName;
  }
}

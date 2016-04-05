package com.ebaotech.salesplatform.core.bo.quotation;

import com.ebaotech.salesplatform.core.bo.prospect.ProspectBo;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import java.util.Date;
import java.util.UUID;

/**
 * Created by haydn.chen on 4/5/2016.
 */
@DatabaseTable(tableName = "T_SP_INSURED_LIST")
public class InsuredBo extends QuotationRoleBo {
  @DatabaseField
  private Long relationToPh;
  @DatabaseField
  private Date birthDate;
  @DatabaseField
  private Long industryType;
  @DatabaseField
  private Long jobCateId;
  @DatabaseField
  private String smoking;
  @DatabaseField
  private String mobile;
  @DatabaseField
  private String telephone;
  @DatabaseField
  private Long relationM;
  @DatabaseField
  private String phIndi;
  @DatabaseField
  private String smokeUnit;
  @DatabaseField
  private Long smokeAmount;
  @DatabaseField
  private Long smokeYears;
  @DatabaseField
  private String smokeFrequency;
  @DatabaseField
  private String companyOrTrustName;
  @DatabaseField
  private String gender;

  public Long getRelationToPh() {
    return relationToPh;
  }

  public void setRelationToPh(Long relationToPh) {
    this.relationToPh = relationToPh;
  }

  public Date getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(Date birthDate) {
    this.birthDate = birthDate;
  }

  public Long getIndustryType() {
    return industryType;
  }

  public void setIndustryType(Long industryType) {
    this.industryType = industryType;
  }

  public Long getJobCateId() {
    return jobCateId;
  }

  public void setJobCateId(Long jobCateId) {
    this.jobCateId = jobCateId;
  }

  public String getSmoking() {
    return smoking;
  }

  public void setSmoking(String smoking) {
    this.smoking = smoking;
  }

  public String getMobile() {
    return mobile;
  }

  public void setMobile(String mobile) {
    this.mobile = mobile;
  }

  public String getTelephone() {
    return telephone;
  }

  public void setTelephone(String telephone) {
    this.telephone = telephone;
  }

  public Long getRelationM() {
    return relationM;
  }

  public void setRelationM(Long relationM) {
    this.relationM = relationM;
  }

  public String getPhIndi() {
    return phIndi;
  }

  public void setPhIndi(String phIndi) {
    this.phIndi = phIndi;
  }

  public String getSmokeUnit() {
    return smokeUnit;
  }

  public void setSmokeUnit(String smokeUnit) {
    this.smokeUnit = smokeUnit;
  }

  public Long getSmokeAmount() {
    return smokeAmount;
  }

  public void setSmokeAmount(Long smokeAmount) {
    this.smokeAmount = smokeAmount;
  }

  public Long getSmokeYears() {
    return smokeYears;
  }

  public void setSmokeYears(Long smokeYears) {
    this.smokeYears = smokeYears;
  }

  public String getSmokeFrequency() {
    return smokeFrequency;
  }

  public void setSmokeFrequency(String smokeFrequency) {
    this.smokeFrequency = smokeFrequency;
  }

  public String getCompanyOrTrustName() {
    return companyOrTrustName;
  }

  public void setCompanyOrTrustName(String companyOrTrustName) {
    this.companyOrTrustName = companyOrTrustName;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }
}

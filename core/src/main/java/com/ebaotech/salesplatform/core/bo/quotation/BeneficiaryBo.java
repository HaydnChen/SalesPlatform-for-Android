package com.ebaotech.salesplatform.core.bo.quotation;

import com.ebaotech.salesplatform.core.bo.AddressBo;
import com.ebaotech.salesplatform.core.bo.prospect.ProspectBo;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import java.math.BigDecimal;
import java.util.UUID;

/**
 * Created by haydn.chen on 4/5/2016.
 */
@DatabaseTable(tableName = "T_SP_BENEFICIARY")
public class BeneficiaryBo extends QuotationRoleBo {
  @DatabaseField(foreign = true, foreignAutoRefresh = true, columnName = "ADDRESS_OFFLINE_ID")
  private AddressBo address;
  @DatabaseField(foreign = true, foreignAutoRefresh = true, columnName = "INSURED_OFFLINE_ID")
  private ProspectBo insured;
  @DatabaseField
  private String beneType;
  @DatabaseField
  private Long shareOrder;
  @DatabaseField
  private BigDecimal shareRate;
  @DatabaseField
  private Long designation;
  @DatabaseField
  private String legalBene;
  @DatabaseField
  private String telephone;
  @DatabaseField
  private String mobile;

  public AddressBo getAddress() {
    return address;
  }

  public void setAddress(AddressBo address) {
    this.address = address;
  }

  public ProspectBo getInsured() {
    return insured;
  }

  public void setInsured(ProspectBo insured) {
    this.insured = insured;
  }

  public String getBeneType() {
    return beneType;
  }

  public void setBeneType(String beneType) {
    this.beneType = beneType;
  }

  public Long getShareOrder() {
    return shareOrder;
  }

  public void setShareOrder(Long shareOrder) {
    this.shareOrder = shareOrder;
  }

  public BigDecimal getShareRate() {
    return shareRate;
  }

  public void setShareRate(BigDecimal shareRate) {
    this.shareRate = shareRate;
  }

  public Long getDesignation() {
    return designation;
  }

  public void setDesignation(Long designation) {
    this.designation = designation;
  }

  public String getLegalBene() {
    return legalBene;
  }

  public void setLegalBene(String legalBene) {
    this.legalBene = legalBene;
  }

  public String getTelephone() {
    return telephone;
  }

  public void setTelephone(String telephone) {
    this.telephone = telephone;
  }

  public String getMobile() {
    return mobile;
  }

  public void setMobile(String mobile) {
    this.mobile = mobile;
  }
}

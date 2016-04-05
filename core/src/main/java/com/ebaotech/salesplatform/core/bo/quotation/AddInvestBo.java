package com.ebaotech.salesplatform.core.bo.quotation;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;

/**
 * Created by haydn.chen on 4/5/2016.
 */
@DatabaseTable(tableName = "T_SP_ADD_INVEST")
public class AddInvestBo {
  @DatabaseField(generatedId = true, columnName = "OFFLINE_ID", allowGeneratedIdInsert = true)
  private UUID offlineId;
  @DatabaseField(foreign = true, foreignAutoRefresh = true, columnName = "QUOTATION_OFFLINE_ID")
  private QuotationBo quotation;
  @DatabaseField(foreign = true, foreignAutoRefresh = true, columnName = "QUOTATION_PRODUCT_OFFLINE_ID")
  private QuotationProductBo quotationProduct;
  @DatabaseField
  private String addPremType;
  @DatabaseField
  private BigDecimal addPrem;
  @DatabaseField
  private Long payMode;
  @DatabaseField
  private Long addYear;
  @DatabaseField
  private Long addPeriod;
  @DatabaseField
  private Date addStartDate;
  @DatabaseField
  private Date paidupDate;
  @DatabaseField
  private Date payToDate;
  @DatabaseField
  private String chargeMode;
  @DatabaseField
  private BigDecimal addPremAn;

  public UUID getOfflineId() {
    return offlineId;
  }

  public void setOfflineId(UUID offlineId) {
    this.offlineId = offlineId;
  }

  public QuotationBo getQuotation() {
    return quotation;
  }

  public void setQuotation(QuotationBo quotation) {
    this.quotation = quotation;
  }

  public QuotationProductBo getQuotationProduct() {
    return quotationProduct;
  }

  public void setQuotationProduct(QuotationProductBo quotationProduct) {
    this.quotationProduct = quotationProduct;
  }

  public String getAddPremType() {
    return addPremType;
  }

  public void setAddPremType(String addPremType) {
    this.addPremType = addPremType;
  }

  public BigDecimal getAddPrem() {
    return addPrem;
  }

  public void setAddPrem(BigDecimal addPrem) {
    this.addPrem = addPrem;
  }

  public Long getPayMode() {
    return payMode;
  }

  public void setPayMode(Long payMode) {
    this.payMode = payMode;
  }

  public Long getAddYear() {
    return addYear;
  }

  public void setAddYear(Long addYear) {
    this.addYear = addYear;
  }

  public Long getAddPeriod() {
    return addPeriod;
  }

  public void setAddPeriod(Long addPeriod) {
    this.addPeriod = addPeriod;
  }

  public Date getAddStartDate() {
    return addStartDate;
  }

  public void setAddStartDate(Date addStartDate) {
    this.addStartDate = addStartDate;
  }

  public Date getPaidupDate() {
    return paidupDate;
  }

  public void setPaidupDate(Date paidupDate) {
    this.paidupDate = paidupDate;
  }

  public Date getPayToDate() {
    return payToDate;
  }

  public void setPayToDate(Date payToDate) {
    this.payToDate = payToDate;
  }

  public String getChargeMode() {
    return chargeMode;
  }

  public void setChargeMode(String chargeMode) {
    this.chargeMode = chargeMode;
  }

  public BigDecimal getAddPremAn() {
    return addPremAn;
  }

  public void setAddPremAn(BigDecimal addPremAn) {
    this.addPremAn = addPremAn;
  }
}

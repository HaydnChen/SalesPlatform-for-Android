package com.ebaotech.salesplatform.core.bo.quotation;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.field.ForeignCollectionField;
import com.j256.ormlite.table.DatabaseTable;
import java.util.Collection;
import java.util.List;
import java.util.UUID;

/**
 * Created by haydn.chen on 4/5/2016.
 */
@DatabaseTable(tableName = "T_SP_PAY_PLAN")
public class PayPlanBo {
  @DatabaseField(generatedId = true, columnName = "OFFLINE_ID", allowGeneratedIdInsert = true)
  private UUID offlineId;
  @DatabaseField(foreign = true, foreignAutoRefresh = true, columnName = "QUOTATION_OFFLINE_ID")
  private QuotationBo quotation;
  @DatabaseField(foreign = true, foreignAutoRefresh = true, columnName = "QUOTATION_PRODUCT_OFFLINE_ID")
  private QuotationProductBo quotationProduct;
  @DatabaseField
  private String payPlanType;
  @DatabaseField
  private String planFreq;
  @DatabaseField
  private String payPeriod;
  @DatabaseField
  private Long payYear;
  @DatabaseField
  private Long guaranteePeriod;
  @DatabaseField
  private Long endYear;
  @DatabaseField
  private String endPeriod;
  @DatabaseField
  private Long payMode;
  @DatabaseField
  private String payOption;
  @ForeignCollectionField(eager = true)
  private Collection<PayPlanPayeeBo> payPlanPayees;

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

  public String getPayPlanType() {
    return payPlanType;
  }

  public void setPayPlanType(String payPlanType) {
    this.payPlanType = payPlanType;
  }

  public String getPlanFreq() {
    return planFreq;
  }

  public void setPlanFreq(String planFreq) {
    this.planFreq = planFreq;
  }

  public String getPayPeriod() {
    return payPeriod;
  }

  public void setPayPeriod(String payPeriod) {
    this.payPeriod = payPeriod;
  }

  public Long getPayYear() {
    return payYear;
  }

  public void setPayYear(Long payYear) {
    this.payYear = payYear;
  }

  public Long getGuaranteePeriod() {
    return guaranteePeriod;
  }

  public void setGuaranteePeriod(Long guaranteePeriod) {
    this.guaranteePeriod = guaranteePeriod;
  }

  public Long getEndYear() {
    return endYear;
  }

  public void setEndYear(Long endYear) {
    this.endYear = endYear;
  }

  public String getEndPeriod() {
    return endPeriod;
  }

  public void setEndPeriod(String endPeriod) {
    this.endPeriod = endPeriod;
  }

  public Long getPayMode() {
    return payMode;
  }

  public void setPayMode(Long payMode) {
    this.payMode = payMode;
  }

  public String getPayOption() {
    return payOption;
  }

  public void setPayOption(String payOption) {
    this.payOption = payOption;
  }

  public Collection<PayPlanPayeeBo> getPayPlanPayees() {
    return payPlanPayees;
  }

  public void setPayPlanPayees(Collection<PayPlanPayeeBo> payPlanPayees) {
    this.payPlanPayees = payPlanPayees;
  }
}

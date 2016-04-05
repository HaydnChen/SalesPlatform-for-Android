package com.ebaotech.salesplatform.core.bo.quotation;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import java.util.UUID;

/**
 * Created by haydn.chen on 4/5/2016.
 */
@DatabaseTable(tableName = "T_SP_BENEFIT_INSURED")
public class BenefitInsuredBo {
  @DatabaseField(generatedId = true, columnName = "OFFLINE_ID", allowGeneratedIdInsert = true)
  private UUID offlineId;
  @DatabaseField(foreign = true, foreignAutoRefresh = true, columnName = "QUOTATION_OFFLINE_ID")
  private QuotationBo quotation;
  @DatabaseField(foreign = true, foreignAutoRefresh = true, columnName = "QUOTATION_PRODUCT_OFFLINE_ID")
  private QuotationProductBo quotationProduct;
  @DatabaseField(foreign = true, foreignAutoRefresh = true, columnName = "INSURED_OFFLINE_ID")
  private InsuredBo insured;
  @DatabaseField
  private Long entryAge;
  @DatabaseField
  private Long orderId;
  @DatabaseField
  private Long jobClass;

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

  public InsuredBo getInsured() {
    return insured;
  }

  public void setInsured(InsuredBo insured) {
    this.insured = insured;
  }

  public Long getEntryAge() {
    return entryAge;
  }

  public void setEntryAge(Long entryAge) {
    this.entryAge = entryAge;
  }

  public Long getOrderId() {
    return orderId;
  }

  public void setOrderId(Long orderId) {
    this.orderId = orderId;
  }

  public Long getJobClass() {
    return jobClass;
  }

  public void setJobClass(Long jobClass) {
    this.jobClass = jobClass;
  }
}

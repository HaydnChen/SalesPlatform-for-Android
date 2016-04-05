package com.ebaotech.salesplatform.core.bo.quotation;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import java.math.BigDecimal;
import java.util.UUID;

/**
 * Created by haydn.chen on 4/5/2016.
 */
@DatabaseTable(tableName = "T_SP_INVEST_RATE")
public class InvestRateBo {
  @DatabaseField(generatedId = true, columnName = "OFFLINE_ID", allowGeneratedIdInsert = true)
  private UUID offlineId;
  @DatabaseField(foreign = true, foreignAutoRefresh = true, columnName = "QUOTATION_OFFLINE_ID")
  private QuotationBo quotation;
  @DatabaseField(foreign = true, foreignAutoRefresh = true, columnName = "QUOTATION_PRODUCT_OFFLINE_ID")
  private QuotationProductBo quotationProduct;
  @DatabaseField
  private String fundCode;
  @DatabaseField
  private Long lowPlyYear;
  @DatabaseField
  private Long highPlyYear;
  @DatabaseField
  private BigDecimal assignRate;
  @DatabaseField
  private BigDecimal amount;
  @DatabaseField
  private String premType;
  @DatabaseField
  private String allocationFlag;

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

  public String getFundCode() {
    return fundCode;
  }

  public void setFundCode(String fundCode) {
    this.fundCode = fundCode;
  }

  public Long getLowPlyYear() {
    return lowPlyYear;
  }

  public void setLowPlyYear(Long lowPlyYear) {
    this.lowPlyYear = lowPlyYear;
  }

  public Long getHighPlyYear() {
    return highPlyYear;
  }

  public void setHighPlyYear(Long highPlyYear) {
    this.highPlyYear = highPlyYear;
  }

  public BigDecimal getAssignRate() {
    return assignRate;
  }

  public void setAssignRate(BigDecimal assignRate) {
    this.assignRate = assignRate;
  }

  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public String getPremType() {
    return premType;
  }

  public void setPremType(String premType) {
    this.premType = premType;
  }

  public String getAllocationFlag() {
    return allocationFlag;
  }

  public void setAllocationFlag(String allocationFlag) {
    this.allocationFlag = allocationFlag;
  }
}

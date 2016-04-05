package com.ebaotech.salesplatform.core.bo.quotation;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;

/**
 * Created by haydn.chen on 4/5/2016.
 */
@DatabaseTable(tableName = "T_SP_QUOTATION_ALTERRATION")
public class QuotationAlterationBo {
  @DatabaseField(generatedId = true, columnName = "OFFLINE_ID", allowGeneratedIdInsert = true)
  private UUID offlineId;
  @DatabaseField(foreign = true, foreignAutoRefresh = true, columnName = "QUOTATION_OFFLINE_ID")
  private QuotationBo quotation;
  @DatabaseField
  private Long alterType;
  @DatabaseField
  private Long startYear;
  @DatabaseField
  private Long endYear;
  @DatabaseField
  private BigDecimal annualTopup;
  @DatabaseField
  private BigDecimal annualWithdraw;
  @DatabaseField
  private Date applyDate;
  @DatabaseField
  private String payFrequency;

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

  public Long getAlterType() {
    return alterType;
  }

  public void setAlterType(Long alterType) {
    this.alterType = alterType;
  }

  public Long getStartYear() {
    return startYear;
  }

  public void setStartYear(Long startYear) {
    this.startYear = startYear;
  }

  public Long getEndYear() {
    return endYear;
  }

  public void setEndYear(Long endYear) {
    this.endYear = endYear;
  }

  public BigDecimal getAnnualTopup() {
    return annualTopup;
  }

  public void setAnnualTopup(BigDecimal annualTopup) {
    this.annualTopup = annualTopup;
  }

  public BigDecimal getAnnualWithdraw() {
    return annualWithdraw;
  }

  public void setAnnualWithdraw(BigDecimal annualWithdraw) {
    this.annualWithdraw = annualWithdraw;
  }

  public Date getApplyDate() {
    return applyDate;
  }

  public void setApplyDate(Date applyDate) {
    this.applyDate = applyDate;
  }

  public String getPayFrequency() {
    return payFrequency;
  }

  public void setPayFrequency(String payFrequency) {
    this.payFrequency = payFrequency;
  }
}

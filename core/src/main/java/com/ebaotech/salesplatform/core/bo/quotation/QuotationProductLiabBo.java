package com.ebaotech.salesplatform.core.bo.quotation;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;

/**
 * Created by haydn.chen on 4/5/2016.
 */
@DatabaseTable(tableName = "T_SP_QUOTATION_PROD_LIAB")
public class QuotationProductLiabBo {
  @DatabaseField(generatedId = true, columnName = "OFFLINE_ID", allowGeneratedIdInsert = true)
  private UUID offlineId;
  @DatabaseField(foreign = true, foreignAutoRefresh = true, columnName = "QUOTATION_OFFLINE_ID")
  private QuotationBo quotation;
  @DatabaseField(foreign = true, foreignAutoRefresh = true, columnName = "QUOTATION_PRODUCT_OFFLINE_ID")
  private QuotationProductBo quotationProduct;
  @DatabaseField
  private Long liabId;
  @DatabaseField
  private String premIndi;
  @DatabaseField
  private BigDecimal sa;
  @DatabaseField
  private BigDecimal unit;
  @DatabaseField
  private Date applyDate;
  @DatabaseField
  private Date validateDate;
  @DatabaseField
  private String countWay;
  @DatabaseField
  private BigDecimal stdPremBf;
  @DatabaseField
  private BigDecimal stdPremAf;
  @DatabaseField
  private BigDecimal totalPremAf;
  @DatabaseField
  private BigDecimal discountPrem;
  @DatabaseField
  private BigDecimal grossPremAf;
  @DatabaseField
  private BigDecimal extraPremAf;
  @DatabaseField
  private BigDecimal extraPremBf;
  @DatabaseField
  private BigDecimal extraPremAn;
  @DatabaseField
  private String benefitLevel;

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

  public Long getLiabId() {
    return liabId;
  }

  public void setLiabId(Long liabId) {
    this.liabId = liabId;
  }

  public String getPremIndi() {
    return premIndi;
  }

  public void setPremIndi(String premIndi) {
    this.premIndi = premIndi;
  }

  public BigDecimal getSa() {
    return sa;
  }

  public void setSa(BigDecimal sa) {
    this.sa = sa;
  }

  public BigDecimal getUnit() {
    return unit;
  }

  public void setUnit(BigDecimal unit) {
    this.unit = unit;
  }

  public Date getApplyDate() {
    return applyDate;
  }

  public void setApplyDate(Date applyDate) {
    this.applyDate = applyDate;
  }

  public Date getValidateDate() {
    return validateDate;
  }

  public void setValidateDate(Date validateDate) {
    this.validateDate = validateDate;
  }

  public String getCountWay() {
    return countWay;
  }

  public void setCountWay(String countWay) {
    this.countWay = countWay;
  }

  public BigDecimal getStdPremBf() {
    return stdPremBf;
  }

  public void setStdPremBf(BigDecimal stdPremBf) {
    this.stdPremBf = stdPremBf;
  }

  public BigDecimal getStdPremAf() {
    return stdPremAf;
  }

  public void setStdPremAf(BigDecimal stdPremAf) {
    this.stdPremAf = stdPremAf;
  }

  public BigDecimal getTotalPremAf() {
    return totalPremAf;
  }

  public void setTotalPremAf(BigDecimal totalPremAf) {
    this.totalPremAf = totalPremAf;
  }

  public BigDecimal getDiscountPrem() {
    return discountPrem;
  }

  public void setDiscountPrem(BigDecimal discountPrem) {
    this.discountPrem = discountPrem;
  }

  public BigDecimal getGrossPremAf() {
    return grossPremAf;
  }

  public void setGrossPremAf(BigDecimal grossPremAf) {
    this.grossPremAf = grossPremAf;
  }

  public BigDecimal getExtraPremAf() {
    return extraPremAf;
  }

  public void setExtraPremAf(BigDecimal extraPremAf) {
    this.extraPremAf = extraPremAf;
  }

  public BigDecimal getExtraPremBf() {
    return extraPremBf;
  }

  public void setExtraPremBf(BigDecimal extraPremBf) {
    this.extraPremBf = extraPremBf;
  }

  public BigDecimal getExtraPremAn() {
    return extraPremAn;
  }

  public void setExtraPremAn(BigDecimal extraPremAn) {
    this.extraPremAn = extraPremAn;
  }

  public String getBenefitLevel() {
    return benefitLevel;
  }

  public void setBenefitLevel(String benefitLevel) {
    this.benefitLevel = benefitLevel;
  }
}

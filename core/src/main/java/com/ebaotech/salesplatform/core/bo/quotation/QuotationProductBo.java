package com.ebaotech.salesplatform.core.bo.quotation;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.field.ForeignCollectionField;
import com.j256.ormlite.table.DatabaseTable;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * Created by haydn.chen on 4/5/2016.
 */
@DatabaseTable(tableName = "T_SP_QUOTATION_PRODUCT")
public class QuotationProductBo {
  @DatabaseField(generatedId = true, columnName = "OFFLINE_ID", allowGeneratedIdInsert = true)
  private UUID offlineId;
  @DatabaseField(foreign = true, foreignAutoRefresh = true, columnName = "QUOTATION_OFFLINE_ID")
  private QuotationBo quotation;
  @DatabaseField(foreign = true, foreignAutoRefresh = true, columnName = "MASTER_QUOTATION_PRODUCT_OFFLINE_ID")
  private QuotationProductBo masterProduct;
  @DatabaseField
  private Long productId;
  @DatabaseField
  private BigDecimal sa;
  @DatabaseField
  private BigDecimal unit;
  @DatabaseField
  private Date applyDate;
  @DatabaseField
  private Date validateDate;
  @DatabaseField
  private String payFrequency;
  @DatabaseField
  private String chargePeriod;
  @DatabaseField
  private Long chargeYear;
  @DatabaseField
  private String coveragePeriod;
  @DatabaseField
  private Long coverageYear;
  @DatabaseField
  private Long payMode;
  @DatabaseField
  private Long payNext;
  @DatabaseField
  private String countWay;
  @DatabaseField
  private BigDecimal stdPremBf;
  @DatabaseField
  private BigDecimal stdPremAf;
  @DatabaseField
  private BigDecimal stdPremAn;
  @DatabaseField
  private BigDecimal annualPrem;
  @DatabaseField
  private BigDecimal totalPremAf;
  @DatabaseField
  private BigDecimal policyFeeBf;
  @DatabaseField
  private BigDecimal policyFeeAf;
  @DatabaseField
  private BigDecimal policyFeeAn;
  @DatabaseField
  private BigDecimal grossPremAf;
  @DatabaseField
  private BigDecimal discountPrem;
  @DatabaseField
  private Long distributionMethod;
  @DatabaseField
  private BigDecimal basicPremRate;
  @DatabaseField
  private BigDecimal expenseRate;
  @DatabaseField
  private String immInvestment;
  @DatabaseField
  private String waiver;
  @DatabaseField
  private BigDecimal waivedSa;
  @DatabaseField
  private String benefitLevel;
  @DatabaseField
  private String hpsExemption;
  @DatabaseField
  private Float interestRate;
  @DatabaseField
  private String basePlan;
  @DatabaseField
  private String coverageTerm;
  @DatabaseField
  private String premiumTerm;
  @ForeignCollectionField(eager = true)
  private Collection<InvestRateBo> investRates;
  @ForeignCollectionField(eager = true)
  private Collection<BenefitInsuredBo> benefitInsureds;
  @ForeignCollectionField(eager = true)
  private Collection<QuotationProductLiabBo> liabilitys;
  @ForeignCollectionField(eager = true)
  private Collection<AddInvestBo> addInvests;
  @ForeignCollectionField(eager = true)
  private Collection<PayPlanBo> payPlans;

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

  public QuotationProductBo getMasterProduct() {
    return masterProduct;
  }

  public void setMasterProduct(QuotationProductBo masterProduct) {
    this.masterProduct = masterProduct;
  }

  public Long getProductId() {
    return productId;
  }

  public void setProductId(Long productId) {
    this.productId = productId;
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

  public String getPayFrequency() {
    return payFrequency;
  }

  public void setPayFrequency(String payFrequency) {
    this.payFrequency = payFrequency;
  }

  public String getChargePeriod() {
    return chargePeriod;
  }

  public void setChargePeriod(String chargePeriod) {
    this.chargePeriod = chargePeriod;
  }

  public Long getChargeYear() {
    return chargeYear;
  }

  public void setChargeYear(Long chargeYear) {
    this.chargeYear = chargeYear;
  }

  public String getCoveragePeriod() {
    return coveragePeriod;
  }

  public void setCoveragePeriod(String coveragePeriod) {
    this.coveragePeriod = coveragePeriod;
  }

  public Long getCoverageYear() {
    return coverageYear;
  }

  public void setCoverageYear(Long coverageYear) {
    this.coverageYear = coverageYear;
  }

  public Long getPayMode() {
    return payMode;
  }

  public void setPayMode(Long payMode) {
    this.payMode = payMode;
  }

  public Long getPayNext() {
    return payNext;
  }

  public void setPayNext(Long payNext) {
    this.payNext = payNext;
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

  public BigDecimal getStdPremAn() {
    return stdPremAn;
  }

  public void setStdPremAn(BigDecimal stdPremAn) {
    this.stdPremAn = stdPremAn;
  }

  public BigDecimal getAnnualPrem() {
    return annualPrem;
  }

  public void setAnnualPrem(BigDecimal annualPrem) {
    this.annualPrem = annualPrem;
  }

  public BigDecimal getTotalPremAf() {
    return totalPremAf;
  }

  public void setTotalPremAf(BigDecimal totalPremAf) {
    this.totalPremAf = totalPremAf;
  }

  public BigDecimal getPolicyFeeBf() {
    return policyFeeBf;
  }

  public void setPolicyFeeBf(BigDecimal policyFeeBf) {
    this.policyFeeBf = policyFeeBf;
  }

  public BigDecimal getPolicyFeeAf() {
    return policyFeeAf;
  }

  public void setPolicyFeeAf(BigDecimal policyFeeAf) {
    this.policyFeeAf = policyFeeAf;
  }

  public BigDecimal getPolicyFeeAn() {
    return policyFeeAn;
  }

  public void setPolicyFeeAn(BigDecimal policyFeeAn) {
    this.policyFeeAn = policyFeeAn;
  }

  public BigDecimal getGrossPremAf() {
    return grossPremAf;
  }

  public void setGrossPremAf(BigDecimal grossPremAf) {
    this.grossPremAf = grossPremAf;
  }

  public BigDecimal getDiscountPrem() {
    return discountPrem;
  }

  public void setDiscountPrem(BigDecimal discountPrem) {
    this.discountPrem = discountPrem;
  }

  public Long getDistributionMethod() {
    return distributionMethod;
  }

  public void setDistributionMethod(Long distributionMethod) {
    this.distributionMethod = distributionMethod;
  }

  public BigDecimal getBasicPremRate() {
    return basicPremRate;
  }

  public void setBasicPremRate(BigDecimal basicPremRate) {
    this.basicPremRate = basicPremRate;
  }

  public BigDecimal getExpenseRate() {
    return expenseRate;
  }

  public void setExpenseRate(BigDecimal expenseRate) {
    this.expenseRate = expenseRate;
  }

  public String getImmInvestment() {
    return immInvestment;
  }

  public void setImmInvestment(String immInvestment) {
    this.immInvestment = immInvestment;
  }

  public String getWaiver() {
    return waiver;
  }

  public void setWaiver(String waiver) {
    this.waiver = waiver;
  }

  public BigDecimal getWaivedSa() {
    return waivedSa;
  }

  public void setWaivedSa(BigDecimal waivedSa) {
    this.waivedSa = waivedSa;
  }

  public String getBenefitLevel() {
    return benefitLevel;
  }

  public void setBenefitLevel(String benefitLevel) {
    this.benefitLevel = benefitLevel;
  }

  public String getHpsExemption() {
    return hpsExemption;
  }

  public void setHpsExemption(String hpsExemption) {
    this.hpsExemption = hpsExemption;
  }

  public Float getInterestRate() {
    return interestRate;
  }

  public void setInterestRate(Float interestRate) {
    this.interestRate = interestRate;
  }

  public String getBasePlan() {
    return basePlan;
  }

  public void setBasePlan(String basePlan) {
    this.basePlan = basePlan;
  }

  public String getCoverageTerm() {
    return coverageTerm;
  }

  public void setCoverageTerm(String coverageTerm) {
    this.coverageTerm = coverageTerm;
  }

  public String getPremiumTerm() {
    return premiumTerm;
  }

  public void setPremiumTerm(String premiumTerm) {
    this.premiumTerm = premiumTerm;
  }

  public Collection<InvestRateBo> getInvestRates() {
    return investRates;
  }

  public void setInvestRates(Collection<InvestRateBo> investRates) {
    this.investRates = investRates;
  }

  public Collection<BenefitInsuredBo> getBenefitInsureds() {
    return benefitInsureds;
  }

  public void setBenefitInsureds(Collection<BenefitInsuredBo> benefitInsureds) {
    this.benefitInsureds = benefitInsureds;
  }

  public Collection<QuotationProductLiabBo> getLiabilitys() {
    return liabilitys;
  }

  public void setLiabilitys(Collection<QuotationProductLiabBo> liabilitys) {
    this.liabilitys = liabilitys;
  }

  public Collection<AddInvestBo> getAddInvests() {
    return addInvests;
  }

  public void setAddInvests(Collection<AddInvestBo> addInvests) {
    this.addInvests = addInvests;
  }

  public Collection<PayPlanBo> getPayPlans() {
    return payPlans;
  }

  public void setPayPlans(Collection<PayPlanBo> payPlans) {
    this.payPlans = payPlans;
  }
}

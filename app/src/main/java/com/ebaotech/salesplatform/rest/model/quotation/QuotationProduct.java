package com.ebaotech.salesplatform.rest.model.quotation;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class QuotationProduct implements Serializable {
	private static final long serialVersionUID = -2981044821126391492L;

	// point to quotation.quotationProducts[masterProductIndex]
	private Integer masterProductIndex;

	private Long productId;

	private BigDecimal sa;

	private BigDecimal unit;

	private Long applyDateTimestamp;

	private Long validateDateTimestamp;

	private String payFrequency;

	private String chargePeriod;

	private Long chargeYear;

	private String coveragePeriod;

	private Long coverageYear;

	private Long payMode;

	private Long payNext;

	private String countWay;

	private BigDecimal stdPremBf;

	private BigDecimal stdPremAf;

	private BigDecimal stdPremAn;

	private BigDecimal annualPrem;

	private BigDecimal totalPremAf;

	private BigDecimal policyFeeBf;

	private BigDecimal policyFeeAf;

	private BigDecimal policyFeeAn;

	private BigDecimal grossPremAf;

	private BigDecimal discountPrem;

	private Long distributionMethod;

	private BigDecimal basicPremRate;

	private BigDecimal expenseRate;

	private String immInvestment;

	private String waiver;

	private BigDecimal waivedSa;

	private String benefitLevel;

	private String hpsExemption;

	private Float interestRate;

	private String basePlan;

	private String coverageTerm;

	private String premiumTerm;

	// point to quotation.extraMortality[extraMortalityIndex]
	private List<Integer> extraMortalityIndexes = new ArrayList<Integer>();

	private List<InvestRate> investRates = new ArrayList<InvestRate>();

	private List<BenefitInsured> benefitInsureds = new ArrayList<BenefitInsured>();

	private List<QuotationProductLiab> liabilitys = new ArrayList<QuotationProductLiab>();

	private List<AddInvest> addInvests = new ArrayList<AddInvest>();

	private List<PayPlan> payPlans = new ArrayList<PayPlan>();

	public Integer getMasterProductIndex() {
		return masterProductIndex;
	}

	public void setMasterProductIndex(Integer masterProductIndex) {
		this.masterProductIndex = masterProductIndex;
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

	public Long getApplyDateTimestamp() {
		return applyDateTimestamp;
	}

	public void setApplyDateTimestamp(Long applyDateTimestamp) {
		this.applyDateTimestamp = applyDateTimestamp;
	}

	public Long getValidateDateTimestamp() {
		return validateDateTimestamp;
	}

	public void setValidateDateTimestamp(Long validateDateTimestamp) {
		this.validateDateTimestamp = validateDateTimestamp;
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

	public List<Integer> getExtraMortalityIndexes() {
		return extraMortalityIndexes;
	}

	public void setExtraMortalityIndexes(List<Integer> extraMortalityIndexes) {
		this.extraMortalityIndexes = extraMortalityIndexes;
	}

	public List<InvestRate> getInvestRates() {
		return investRates;
	}

	public void setInvestRates(List<InvestRate> investRates) {
		this.investRates = investRates;
	}

	public List<BenefitInsured> getBenefitInsureds() {
		return benefitInsureds;
	}

	public void setBenefitInsureds(List<BenefitInsured> benefitInsureds) {
		this.benefitInsureds = benefitInsureds;
	}

	public List<QuotationProductLiab> getLiabilitys() {
		return liabilitys;
	}

	public void setLiabilitys(List<QuotationProductLiab> liabilitys) {
		this.liabilitys = liabilitys;
	}

	public List<AddInvest> getAddInvests() {
		return addInvests;
	}

	public void setAddInvests(List<AddInvest> addInvests) {
		this.addInvests = addInvests;
	}

	public List<PayPlan> getPayPlans() {
		return payPlans;
	}

	public void setPayPlans(List<PayPlan> payPlans) {
		this.payPlans = payPlans;
	}
}

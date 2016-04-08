package com.ebaotech.salesplatform.rest.model.quotation;

import com.ebaotech.salesplatform.rest.model.AbstractSyncableModel;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Quotation extends AbstractSyncableModel {
	private static final long serialVersionUID = -9012675607223340867L;

	private String quotationRequestOfflineId;

	private String prospectOfflineId;

	private Long assessId;

	private Long status;

	private String quotationCode;

	private String policyCode;

	private String proposalCode;

	private Long organId;

	private Long applyDateTimestamp;

	private Long validateDateTimestamp;

	private Long regDateTimestamp;

	private Long moneyId;

	private String assessIndi;

	private Long producerId;

	private Long channelType;

	private Long distributorId;

	private Long campaignId;

	private String submissionNumber;

	private String introducerCode;

	private String introducerName;

	private String intermediaryName;

	private String intermediaryCode;

	private String dispatchType;

	private String discountType;

	private Long postStatus;

	private Long proposalStatus;

	private Long planOrder;

	private String selectedIndi;

	private String submitChannel;

	private Long packageId;

	private String coveragePeriod;

	private Long coverageYear;

	private String chargePeriod;

	private Long chargeYear;

	private String payFrequency;

	private BigDecimal sa;

	private BigDecimal unit;

	private String benefitLevel;

	private BigDecimal prem;

	private String isPackage;

	private BigDecimal premAn;

	private Long esignStatus;

	private String installmentPaymentIndi;

	private String benefitOption;

	private BigDecimal totalFreqPremium;

	private String rejectReason;

	private String fnaOption;

	private String expireIndi;

	private Long expireDateTimestamp;

	private String policyDeliveryOption;

	private Long fnaId;

	private List<ExtraMortality> extraMortalitys = new ArrayList<ExtraMortality>();

	private List<ProposalDocumentInfo> proposalDocumentInfos = new ArrayList<ProposalDocumentInfo>();

	private List<QuotationProduct> quotationProducts = new ArrayList<QuotationProduct>();

	private List<Beneficiary> beneficiarys = new ArrayList<Beneficiary>();

	private List<PayerAccount> payerAccounts = new ArrayList<PayerAccount>();

	private List<PolicyAccount> policyAccounts = new ArrayList<PolicyAccount>();

	private List<PolicyHolder> policyHolders = new ArrayList<PolicyHolder>();

	private List<Insured> insureds = new ArrayList<Insured>();

	private List<ProposalRuleResult> proposalRuleResults = new ArrayList<ProposalRuleResult>();

	private List<QuotationComment> quotationComments = new ArrayList<QuotationComment>();

	private List<Payment> payments = new ArrayList<Payment>();

	private List<QuotationAlteration> quotationAlterations = new ArrayList<QuotationAlteration>();

	public String getQuotationRequestOfflineId() {
		return quotationRequestOfflineId;
	}

	public void setQuotationRequestOfflineId(String quotationRequestOfflineId) {
		this.quotationRequestOfflineId = quotationRequestOfflineId;
	}

	public String getProspectOfflineId() {
		return prospectOfflineId;
	}

	public void setProspectOfflineId(String prospectOfflineId) {
		this.prospectOfflineId = prospectOfflineId;
	}

	public Long getAssessId() {
		return assessId;
	}

	public void setAssessId(Long assessId) {
		this.assessId = assessId;
	}

	public Long getStatus() {
		return status;
	}

	public void setStatus(Long status) {
		this.status = status;
	}

	public String getQuotationCode() {
		return quotationCode;
	}

	public void setQuotationCode(String quotationCode) {
		this.quotationCode = quotationCode;
	}

	public String getPolicyCode() {
		return policyCode;
	}

	public void setPolicyCode(String policyCode) {
		this.policyCode = policyCode;
	}

	public String getProposalCode() {
		return proposalCode;
	}

	public void setProposalCode(String proposalCode) {
		this.proposalCode = proposalCode;
	}

	public Long getOrganId() {
		return organId;
	}

	public void setOrganId(Long organId) {
		this.organId = organId;
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

	public Long getRegDateTimestamp() {
		return regDateTimestamp;
	}

	public void setRegDateTimestamp(Long regDateTimestamp) {
		this.regDateTimestamp = regDateTimestamp;
	}

	public Long getMoneyId() {
		return moneyId;
	}

	public void setMoneyId(Long moneyId) {
		this.moneyId = moneyId;
	}

	public String getAssessIndi() {
		return assessIndi;
	}

	public void setAssessIndi(String assessIndi) {
		this.assessIndi = assessIndi;
	}

	public Long getProducerId() {
		return producerId;
	}

	public void setProducerId(Long producerId) {
		this.producerId = producerId;
	}

	public Long getChannelType() {
		return channelType;
	}

	public void setChannelType(Long channelType) {
		this.channelType = channelType;
	}

	public Long getDistributorId() {
		return distributorId;
	}

	public void setDistributorId(Long distributorId) {
		this.distributorId = distributorId;
	}

	public Long getCampaignId() {
		return campaignId;
	}

	public void setCampaignId(Long campaignId) {
		this.campaignId = campaignId;
	}

	public String getSubmissionNumber() {
		return submissionNumber;
	}

	public void setSubmissionNumber(String submissionNumber) {
		this.submissionNumber = submissionNumber;
	}

	public String getIntroducerCode() {
		return introducerCode;
	}

	public void setIntroducerCode(String introducerCode) {
		this.introducerCode = introducerCode;
	}

	public String getIntroducerName() {
		return introducerName;
	}

	public void setIntroducerName(String introducerName) {
		this.introducerName = introducerName;
	}

	public String getIntermediaryName() {
		return intermediaryName;
	}

	public void setIntermediaryName(String intermediaryName) {
		this.intermediaryName = intermediaryName;
	}

	public String getIntermediaryCode() {
		return intermediaryCode;
	}

	public void setIntermediaryCode(String intermediaryCode) {
		this.intermediaryCode = intermediaryCode;
	}

	public String getDispatchType() {
		return dispatchType;
	}

	public void setDispatchType(String dispatchType) {
		this.dispatchType = dispatchType;
	}

	public String getDiscountType() {
		return discountType;
	}

	public void setDiscountType(String discountType) {
		this.discountType = discountType;
	}

	public Long getPostStatus() {
		return postStatus;
	}

	public void setPostStatus(Long postStatus) {
		this.postStatus = postStatus;
	}

	public Long getProposalStatus() {
		return proposalStatus;
	}

	public void setProposalStatus(Long proposalStatus) {
		this.proposalStatus = proposalStatus;
	}

	public Long getPlanOrder() {
		return planOrder;
	}

	public void setPlanOrder(Long planOrder) {
		this.planOrder = planOrder;
	}

	public String getSelectedIndi() {
		return selectedIndi;
	}

	public void setSelectedIndi(String selectedIndi) {
		this.selectedIndi = selectedIndi;
	}

	public String getSubmitChannel() {
		return submitChannel;
	}

	public void setSubmitChannel(String submitChannel) {
		this.submitChannel = submitChannel;
	}

	public Long getPackageId() {
		return packageId;
	}

	public void setPackageId(Long packageId) {
		this.packageId = packageId;
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

	public String getPayFrequency() {
		return payFrequency;
	}

	public void setPayFrequency(String payFrequency) {
		this.payFrequency = payFrequency;
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

	public String getBenefitLevel() {
		return benefitLevel;
	}

	public void setBenefitLevel(String benefitLevel) {
		this.benefitLevel = benefitLevel;
	}

	public BigDecimal getPrem() {
		return prem;
	}

	public void setPrem(BigDecimal prem) {
		this.prem = prem;
	}

	public String getIsPackage() {
		return isPackage;
	}

	public void setIsPackage(String isPackage) {
		this.isPackage = isPackage;
	}

	public BigDecimal getPremAn() {
		return premAn;
	}

	public void setPremAn(BigDecimal premAn) {
		this.premAn = premAn;
	}

	public Long getEsignStatus() {
		return esignStatus;
	}

	public void setEsignStatus(Long esignStatus) {
		this.esignStatus = esignStatus;
	}

	public String getInstallmentPaymentIndi() {
		return installmentPaymentIndi;
	}

	public void setInstallmentPaymentIndi(String installmentPaymentIndi) {
		this.installmentPaymentIndi = installmentPaymentIndi;
	}

	public String getBenefitOption() {
		return benefitOption;
	}

	public void setBenefitOption(String benefitOption) {
		this.benefitOption = benefitOption;
	}

	public BigDecimal getTotalFreqPremium() {
		return totalFreqPremium;
	}

	public void setTotalFreqPremium(BigDecimal totalFreqPremium) {
		this.totalFreqPremium = totalFreqPremium;
	}

	public String getRejectReason() {
		return rejectReason;
	}

	public void setRejectReason(String rejectReason) {
		this.rejectReason = rejectReason;
	}

	public String getFnaOption() {
		return fnaOption;
	}

	public void setFnaOption(String fnaOption) {
		this.fnaOption = fnaOption;
	}

	public String getExpireIndi() {
		return expireIndi;
	}

	public void setExpireIndi(String expireIndi) {
		this.expireIndi = expireIndi;
	}

	public Long getExpireDateTimestamp() {
		return expireDateTimestamp;
	}

	public void setExpireDateTimestamp(Long expireDateTimestamp) {
		this.expireDateTimestamp = expireDateTimestamp;
	}

	public String getPolicyDeliveryOption() {
		return policyDeliveryOption;
	}

	public void setPolicyDeliveryOption(String policyDeliveryOption) {
		this.policyDeliveryOption = policyDeliveryOption;
	}

	public Long getFnaId() {
		return fnaId;
	}

	public void setFnaId(Long fnaId) {
		this.fnaId = fnaId;
	}

	public List<ExtraMortality> getExtraMortalitys() {
		return extraMortalitys;
	}

	public void setExtraMortalitys(List<ExtraMortality> extraMortalitys) {
		this.extraMortalitys = extraMortalitys;
	}

	public List<ProposalDocumentInfo> getProposalDocumentInfos() {
		return proposalDocumentInfos;
	}

	public void setProposalDocumentInfos(
			List<ProposalDocumentInfo> proposalDocumentInfos) {
		this.proposalDocumentInfos = proposalDocumentInfos;
	}

	public List<QuotationProduct> getQuotationProducts() {
		return quotationProducts;
	}

	public void setQuotationProducts(List<QuotationProduct> quotationProducts) {
		this.quotationProducts = quotationProducts;
	}

	public List<Beneficiary> getBeneficiarys() {
		return beneficiarys;
	}

	public void setBeneficiarys(List<Beneficiary> beneficiarys) {
		this.beneficiarys = beneficiarys;
	}

	public List<PayerAccount> getPayerAccounts() {
		return payerAccounts;
	}

	public void setPayerAccounts(List<PayerAccount> payerAccounts) {
		this.payerAccounts = payerAccounts;
	}

	public List<PolicyAccount> getPolicyAccounts() {
		return policyAccounts;
	}

	public void setPolicyAccounts(List<PolicyAccount> policyAccounts) {
		this.policyAccounts = policyAccounts;
	}

	public List<PolicyHolder> getPolicyHolders() {
		return policyHolders;
	}

	public void setPolicyHolders(List<PolicyHolder> policyHolders) {
		this.policyHolders = policyHolders;
	}

	public List<Insured> getInsureds() {
		return insureds;
	}

	public void setInsureds(List<Insured> insureds) {
		this.insureds = insureds;
	}

	public List<ProposalRuleResult> getProposalRuleResults() {
		return proposalRuleResults;
	}

	public void setProposalRuleResults(
			List<ProposalRuleResult> proposalRuleResults) {
		this.proposalRuleResults = proposalRuleResults;
	}

	public List<QuotationComment> getQuotationComments() {
		return quotationComments;
	}

	public void setQuotationComments(List<QuotationComment> quotationComments) {
		this.quotationComments = quotationComments;
	}

	public List<Payment> getPayments() {
		return payments;
	}

	public void setPayments(List<Payment> payments) {
		this.payments = payments;
	}

	public List<QuotationAlteration> getQuotationAlterations() {
		return quotationAlterations;
	}

	public void setQuotationAlterations(
			List<QuotationAlteration> quotationAlterations) {
		this.quotationAlterations = quotationAlterations;
	}
}

package com.ebaotech.salesplatform.core.bo.quotation;

import com.ebaotech.salesplatform.core.bo.AbstractSyncableBo;
import com.ebaotech.salesplatform.core.bo.prospect.ProspectBo;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.field.ForeignCollectionField;
import com.j256.ormlite.table.DatabaseTable;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;
import java.util.UUID;

/**
 * Created by haydn.chen on 4/1/2016.
 */
@DatabaseTable(tableName = "T_SP_QUOTATION")
public class QuotationBo extends AbstractSyncableBo {
  @DatabaseField(foreign = true, foreignAutoRefresh = true, columnName = "QUOTATION_REQUEST_OFFLINE_ID")
  private QuotationRequestBo quotationRequest;
  @DatabaseField(foreign = true, foreignAutoRefresh = true, columnName = "PROSPECT_OFFLINE_ID")
  private ProspectBo prospect;
  @DatabaseField
  private Long assessId;
  @DatabaseField
  private Long status;
  @DatabaseField
  private String quotationCode;
  @DatabaseField
  private String policyCode;
  @DatabaseField
  private String proposalCode;
  @DatabaseField
  private Long organId;
  @DatabaseField
  private Date applyDate;
  @DatabaseField
  private Date validateDate;
  @DatabaseField
  private Date regDate;
  @DatabaseField
  private Long moneyId;
  @DatabaseField
  private String assessIndi;
  @DatabaseField
  private Long channelType;
  @DatabaseField
  private Long distributorId;
  @DatabaseField
  private Long campaignId;
  @DatabaseField
  private String submissionNumber;
  @DatabaseField
  private String introducerCode;
  @DatabaseField
  private String introducerName;
  @DatabaseField
  private String intermediaryName;
  @DatabaseField
  private String intermediaryCode;
  @DatabaseField
  private String dispatchType;
  @DatabaseField
  private String discountType;
  @DatabaseField
  private Long postStatus;
  @DatabaseField
  private Long proposalStatus;
  @DatabaseField
  private Long planOrder;
  @DatabaseField
  private String selectedIndi;
  @DatabaseField
  private String submitChannel;
  @DatabaseField
  private Long packageId;
  @DatabaseField
  private String coveragePeriod;
  @DatabaseField
  private Long coverageYear;
  @DatabaseField
  private String chargePeriod;
  @DatabaseField
  private Long chargeYear;
  @DatabaseField
  private String payFrequency;
  @DatabaseField
  private BigDecimal sa;
  @DatabaseField
  private BigDecimal unit;
  @DatabaseField
  private String benefitLevel;
  @DatabaseField
  private BigDecimal prem;
  @DatabaseField
  private String isPackage;
  @DatabaseField
  private BigDecimal premAn;
  @DatabaseField
  private Long esignStatus;
  @DatabaseField
  private String installmentPaymentIndi;
  @DatabaseField
  private String benefitOption;
  @DatabaseField
  private BigDecimal totalFreqPremium;
  @DatabaseField
  private String rejectReason;
  @DatabaseField
  private String fnaOption;
  @DatabaseField
  private String expireIndi;
  @DatabaseField
  private Date expireDate;
  @DatabaseField
  private String policyDeliveryOption;
  @DatabaseField
  private Long fnaId;
  @ForeignCollectionField(eager = true)
  private Collection<ExtraMortalityBo> extraMortalitys;
  @ForeignCollectionField(eager = true)
  private Collection<ProposalDocumentInfoBo> proposalDocumentInfos;
  @ForeignCollectionField(eager = true)
  private Collection<QuotationProductBo> quotationProducts;
  @ForeignCollectionField(eager = true)
  private Collection<BeneficiaryBo> beneficiarys;
  @ForeignCollectionField(eager = true)
  private Collection<PayerAccountBo> payerAccounts;
  @ForeignCollectionField(eager = true)
  private Collection<PolicyAccountBo> policyAccounts;
  @ForeignCollectionField(eager = true)
  private Collection<PolicyHolderBo> policyHolders;
  @ForeignCollectionField(eager = true)
  private Collection<InsuredBo> insureds;
  @ForeignCollectionField(eager = true)
  private Collection<ProposalRuleResultBo> proposalRuleResults;
  @ForeignCollectionField(eager = true)
  private Collection<QuotationCommentBo> quotationComments;
  @ForeignCollectionField(eager = true)
  private Collection<PaymentBo> payments;
  @ForeignCollectionField(eager = true)
  private Collection<QuotationAlterationBo> quotationAlterations;

  public QuotationRequestBo getQuotationRequest() {
    return quotationRequest;
  }

  public void setQuotationRequest(QuotationRequestBo quotationRequest) {
    this.quotationRequest = quotationRequest;
  }

  public ProspectBo getProspect() {
    return prospect;
  }

  public void setProspect(ProspectBo prospect) {
    this.prospect = prospect;
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

  public Date getRegDate() {
    return regDate;
  }

  public void setRegDate(Date regDate) {
    this.regDate = regDate;
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

  public Date getExpireDate() {
    return expireDate;
  }

  public void setExpireDate(Date expireDate) {
    this.expireDate = expireDate;
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

  public Collection<ExtraMortalityBo> getExtraMortalitys() {
    return extraMortalitys;
  }

  public void setExtraMortalitys(Collection<ExtraMortalityBo> extraMortalitys) {
    this.extraMortalitys = extraMortalitys;
  }

  public Collection<ProposalDocumentInfoBo> getProposalDocumentInfos() {
    return proposalDocumentInfos;
  }

  public void setProposalDocumentInfos(Collection<ProposalDocumentInfoBo> proposalDocumentInfos) {
    this.proposalDocumentInfos = proposalDocumentInfos;
  }

  public Collection<QuotationProductBo> getQuotationProducts() {
    return quotationProducts;
  }

  public void setQuotationProducts(Collection<QuotationProductBo> quotationProducts) {
    this.quotationProducts = quotationProducts;
  }

  public Collection<BeneficiaryBo> getBeneficiarys() {
    return beneficiarys;
  }

  public void setBeneficiarys(Collection<BeneficiaryBo> beneficiarys) {
    this.beneficiarys = beneficiarys;
  }

  public Collection<PayerAccountBo> getPayerAccounts() {
    return payerAccounts;
  }

  public void setPayerAccounts(Collection<PayerAccountBo> payerAccounts) {
    this.payerAccounts = payerAccounts;
  }

  public Collection<PolicyAccountBo> getPolicyAccounts() {
    return policyAccounts;
  }

  public void setPolicyAccounts(Collection<PolicyAccountBo> policyAccounts) {
    this.policyAccounts = policyAccounts;
  }

  public Collection<PolicyHolderBo> getPolicyHolders() {
    return policyHolders;
  }

  public void setPolicyHolders(Collection<PolicyHolderBo> policyHolders) {
    this.policyHolders = policyHolders;
  }

  public Collection<InsuredBo> getInsureds() {
    return insureds;
  }

  public void setInsureds(Collection<InsuredBo> insureds) {
    this.insureds = insureds;
  }

  public Collection<ProposalRuleResultBo> getProposalRuleResults() {
    return proposalRuleResults;
  }

  public void setProposalRuleResults(Collection<ProposalRuleResultBo> proposalRuleResults) {
    this.proposalRuleResults = proposalRuleResults;
  }

  public Collection<QuotationCommentBo> getQuotationComments() {
    return quotationComments;
  }

  public void setQuotationComments(Collection<QuotationCommentBo> quotationComments) {
    this.quotationComments = quotationComments;
  }

  public Collection<PaymentBo> getPayments() {
    return payments;
  }

  public void setPayments(Collection<PaymentBo> payments) {
    this.payments = payments;
  }

  public Collection<QuotationAlterationBo> getQuotationAlterations() {
    return quotationAlterations;
  }

  public void setQuotationAlterations(Collection<QuotationAlterationBo> quotationAlterations) {
    this.quotationAlterations = quotationAlterations;
  }
}

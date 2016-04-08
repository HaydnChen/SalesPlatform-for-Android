package com.ebaotech.salesplatform.rest.model.prospect;

import com.ebaotech.salesplatform.rest.model.AbstractSyncableModel;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Prospect extends AbstractSyncableModel {
	private static final long serialVersionUID = -4500548668843641770L;

	private Long prospectSource;

	private Long prospectType;

	private Long customerId;

	private String gender;

	private Long birthdayTimestamp;

	private Long certiType;

	private String certiCode;

	private String marriageId;

	private BigDecimal height;

	private BigDecimal weight;

	private String email;

	private Long income;

	private Long jobCateId;

	private String nationality;

	private Long jobKind;

	private String title;

	private String smoking;

	private String homeplace;

	private String nationCode;

	private Long blacklistCause;

	private String mobile;

	private String officeTel;

	private String homeTel;

	private String firstName;

	private String midName;

	private String lastName;

	private String aliasName;

	private String fax;

	private String proofAge;

	private Long childCount;

	private String blacklistCode;

	private String langId;

	private Long producerId;

	private Long channelType;

	private Long distributorId;

	private String agesOfKids;

	private String spouseName;

	private Long spouseBirthdayTimestamp;

	private Long spouseJobCateId;

	private String completeness;

	private String contactPerson;

	private String contactMobile;

	private String contactId;

	private String contactStatus;

	private String contactUpdateIndi;

	private Long age;

	private String comments;

	private String companyName;

	private String nationBoCode;

	private String nationReCode;

	private Long empStatId;

	private String empStatOther;

	private String jobOther;

	private String officeName;

	private String smokerComments;

	private Long sticksPerMon;

	private Long smokingYears;

	private String titleOthers;

	private String disturbanceVision;

	private String addressInfo;

	private String jobName;

	private String educationLevel;

	private List<BankAccount> bankAccounts = new ArrayList<BankAccount>();

	private List<ProspectAddress> addresses = new ArrayList<ProspectAddress>();

	private List<ProspectRela> familyMembers = new ArrayList<ProspectRela>();

	public Long getProspectSource() {
		return prospectSource;
	}

	public void setProspectSource(Long prospectSource) {
		this.prospectSource = prospectSource;
	}

	public Long getProspectType() {
		return prospectType;
	}

	public void setProspectType(Long prospectType) {
		this.prospectType = prospectType;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Long getBirthdayTimestamp() {
		return birthdayTimestamp;
	}

	public void setBirthdayTimestamp(Long birthdayTimestamp) {
		this.birthdayTimestamp = birthdayTimestamp;
	}

	public Long getCertiType() {
		return certiType;
	}

	public void setCertiType(Long certiType) {
		this.certiType = certiType;
	}

	public String getCertiCode() {
		return certiCode;
	}

	public void setCertiCode(String certiCode) {
		this.certiCode = certiCode;
	}

	public String getMarriageId() {
		return marriageId;
	}

	public void setMarriageId(String marriageId) {
		this.marriageId = marriageId;
	}

	public BigDecimal getHeight() {
		return height;
	}

	public void setHeight(BigDecimal height) {
		this.height = height;
	}

	public BigDecimal getWeight() {
		return weight;
	}

	public void setWeight(BigDecimal weight) {
		this.weight = weight;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getIncome() {
		return income;
	}

	public void setIncome(Long income) {
		this.income = income;
	}

	public Long getJobCateId() {
		return jobCateId;
	}

	public void setJobCateId(Long jobCateId) {
		this.jobCateId = jobCateId;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public Long getJobKind() {
		return jobKind;
	}

	public void setJobKind(Long jobKind) {
		this.jobKind = jobKind;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSmoking() {
		return smoking;
	}

	public void setSmoking(String smoking) {
		this.smoking = smoking;
	}

	public String getHomeplace() {
		return homeplace;
	}

	public void setHomeplace(String homeplace) {
		this.homeplace = homeplace;
	}

	public String getNationCode() {
		return nationCode;
	}

	public void setNationCode(String nationCode) {
		this.nationCode = nationCode;
	}

	public Long getBlacklistCause() {
		return blacklistCause;
	}

	public void setBlacklistCause(Long blacklistCause) {
		this.blacklistCause = blacklistCause;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getOfficeTel() {
		return officeTel;
	}

	public void setOfficeTel(String officeTel) {
		this.officeTel = officeTel;
	}

	public String getHomeTel() {
		return homeTel;
	}

	public void setHomeTel(String homeTel) {
		this.homeTel = homeTel;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMidName() {
		return midName;
	}

	public void setMidName(String midName) {
		this.midName = midName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAliasName() {
		return aliasName;
	}

	public void setAliasName(String aliasName) {
		this.aliasName = aliasName;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getProofAge() {
		return proofAge;
	}

	public void setProofAge(String proofAge) {
		this.proofAge = proofAge;
	}

	public Long getChildCount() {
		return childCount;
	}

	public void setChildCount(Long childCount) {
		this.childCount = childCount;
	}

	public String getBlacklistCode() {
		return blacklistCode;
	}

	public void setBlacklistCode(String blacklistCode) {
		this.blacklistCode = blacklistCode;
	}

	public String getLangId() {
		return langId;
	}

	public void setLangId(String langId) {
		this.langId = langId;
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

	public String getAgesOfKids() {
		return agesOfKids;
	}

	public void setAgesOfKids(String agesOfKids) {
		this.agesOfKids = agesOfKids;
	}

	public String getSpouseName() {
		return spouseName;
	}

	public void setSpouseName(String spouseName) {
		this.spouseName = spouseName;
	}

	public Long getSpouseBirthdayTimestamp() {
		return spouseBirthdayTimestamp;
	}

	public void setSpouseBirthdayTimestamp(Long spouseBirthdayTimestamp) {
		this.spouseBirthdayTimestamp = spouseBirthdayTimestamp;
	}

	public Long getSpouseJobCateId() {
		return spouseJobCateId;
	}

	public void setSpouseJobCateId(Long spouseJobCateId) {
		this.spouseJobCateId = spouseJobCateId;
	}

	public String getCompleteness() {
		return completeness;
	}

	public void setCompleteness(String completeness) {
		this.completeness = completeness;
	}

	public String getContactPerson() {
		return contactPerson;
	}

	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}

	public String getContactMobile() {
		return contactMobile;
	}

	public void setContactMobile(String contactMobile) {
		this.contactMobile = contactMobile;
	}

	public String getContactId() {
		return contactId;
	}

	public void setContactId(String contactId) {
		this.contactId = contactId;
	}

	public String getContactStatus() {
		return contactStatus;
	}

	public void setContactStatus(String contactStatus) {
		this.contactStatus = contactStatus;
	}

	public String getContactUpdateIndi() {
		return contactUpdateIndi;
	}

	public void setContactUpdateIndi(String contactUpdateIndi) {
		this.contactUpdateIndi = contactUpdateIndi;
	}

	public Long getAge() {
		return age;
	}

	public void setAge(Long age) {
		this.age = age;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getNationBoCode() {
		return nationBoCode;
	}

	public void setNationBoCode(String nationBoCode) {
		this.nationBoCode = nationBoCode;
	}

	public String getNationReCode() {
		return nationReCode;
	}

	public void setNationReCode(String nationReCode) {
		this.nationReCode = nationReCode;
	}

	public Long getEmpStatId() {
		return empStatId;
	}

	public void setEmpStatId(Long empStatId) {
		this.empStatId = empStatId;
	}

	public String getEmpStatOther() {
		return empStatOther;
	}

	public void setEmpStatOther(String empStatOther) {
		this.empStatOther = empStatOther;
	}

	public String getJobOther() {
		return jobOther;
	}

	public void setJobOther(String jobOther) {
		this.jobOther = jobOther;
	}

	public String getOfficeName() {
		return officeName;
	}

	public void setOfficeName(String officeName) {
		this.officeName = officeName;
	}

	public String getSmokerComments() {
		return smokerComments;
	}

	public void setSmokerComments(String smokerComments) {
		this.smokerComments = smokerComments;
	}

	public Long getSticksPerMon() {
		return sticksPerMon;
	}

	public void setSticksPerMon(Long sticksPerMon) {
		this.sticksPerMon = sticksPerMon;
	}

	public Long getSmokingYears() {
		return smokingYears;
	}

	public void setSmokingYears(Long smokingYears) {
		this.smokingYears = smokingYears;
	}

	public String getTitleOthers() {
		return titleOthers;
	}

	public void setTitleOthers(String titleOthers) {
		this.titleOthers = titleOthers;
	}

	public String getDisturbanceVision() {
		return disturbanceVision;
	}

	public void setDisturbanceVision(String disturbanceVision) {
		this.disturbanceVision = disturbanceVision;
	}

	public String getAddressInfo() {
		return addressInfo;
	}

	public void setAddressInfo(String addressInfo) {
		this.addressInfo = addressInfo;
	}

	public String getJobName() {
		return jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

	public String getEducationLevel() {
		return educationLevel;
	}

	public void setEducationLevel(String educationLevel) {
		this.educationLevel = educationLevel;
	}

	public List<BankAccount> getBankAccounts() {
		return bankAccounts;
	}

	public void setBankAccounts(List<BankAccount> bankAccounts) {
		this.bankAccounts = bankAccounts;
	}

	public List<ProspectAddress> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<ProspectAddress> addresses) {
		this.addresses = addresses;
	}

	public List<ProspectRela> getFamilyMembers() {
		return familyMembers;
	}

	public void setFamilyMembers(List<ProspectRela> familyMembers) {
		this.familyMembers = familyMembers;
	}

}

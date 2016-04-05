package com.ebaotech.salesplatform.core.bo.prospect;

import com.ebaotech.salesplatform.core.bo.AbstractSyncableBo;
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
@DatabaseTable(tableName = "T_SP_PROSPECT")
public class ProspectBo extends AbstractSyncableBo {
  @DatabaseField
  private Long prospectSource;
  @DatabaseField
  private Long prospectType;
  @DatabaseField
  private Long customerId;
  @DatabaseField
  private String gender;
  @DatabaseField
  private Date birthday;
  @DatabaseField
  private Long certiType;
  @DatabaseField
  private String certiCode;
  @DatabaseField
  private String marriageId;
  @DatabaseField
  private BigDecimal height;
  @DatabaseField
  private BigDecimal weight;
  @DatabaseField
  private String email;
  @DatabaseField
  private Long income;
  @DatabaseField
  private Long jobCateId;
  @DatabaseField
  private String nationality;
  @DatabaseField
  private Long jobKind;
  @DatabaseField
  private String title;
  @DatabaseField
  private String smoking;
  @DatabaseField
  private String homeplace;
  @DatabaseField
  private String nationCode;
  @DatabaseField
  private Long blacklistCause;
  @DatabaseField
  private String mobile;
  @DatabaseField
  private String officeTel;
  @DatabaseField
  private String homeTel;
  @DatabaseField
  private String firstName;
  @DatabaseField
  private String midName;
  @DatabaseField
  private String lastName;
  @DatabaseField
  private String aliasName;
  @DatabaseField
  private String fax;
  @DatabaseField
  private String proofAge;
  @DatabaseField
  private Long childCount;
  @DatabaseField
  private String blacklistCode;
  @DatabaseField
  private String langId;
  @DatabaseField
  private Long channelType;
  @DatabaseField
  private Long distributorId;
  @DatabaseField
  private String agesOfKids;
  @DatabaseField
  private String spouseName;
  @DatabaseField
  private Date spouseBirthday;
  @DatabaseField
  private Long spouseJobCateId;
  @DatabaseField
  private String completeness;
  @DatabaseField
  private String contactPerson;
  @DatabaseField
  private String contactMobile;
  @DatabaseField
  private String contactId;
  @DatabaseField
  private String contactStatus;
  @DatabaseField
  private String contactUpdateIndi;
  @DatabaseField
  private Long age;
  @DatabaseField
  private String comments;
  @DatabaseField
  private String companyName;
  @DatabaseField
  private String nationBoCode;
  @DatabaseField
  private String nationReCode;
  @DatabaseField
  private Long empStatId;
  @DatabaseField
  private String empStatOther;
  @DatabaseField
  private String jobOther;
  @DatabaseField
  private String officeName;
  @DatabaseField
  private String smokerComments;
  @DatabaseField
  private Long sticksPerMon;
  @DatabaseField
  private Long smokingYears;
  @DatabaseField
  private String titleOthers;
  @DatabaseField
  private String disturbanceVision;
  @DatabaseField
  private String addressInfo;
  @DatabaseField
  private String jobName;
  @DatabaseField
  private String educationLevel;
  @ForeignCollectionField(eager = true)
  private Collection<BankAccountBo> bankAccounts;
  @ForeignCollectionField(eager = true)
  private Collection<ProspectAddressBo> addresses;
  @ForeignCollectionField(eager = true)
  private Collection<ProspectRelaBo> members;

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

  public Date getBirthday() {
    return birthday;
  }

  public void setBirthday(Date birthday) {
    this.birthday = birthday;
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

  public Date getSpouseBirthday() {
    return spouseBirthday;
  }

  public void setSpouseBirthday(Date spouseBirthday) {
    this.spouseBirthday = spouseBirthday;
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

  public Collection<BankAccountBo> getBankAccounts() {
    return bankAccounts;
  }

  public void setBankAccounts(Collection<BankAccountBo> bankAccounts) {
    this.bankAccounts = bankAccounts;
  }

  public Collection<ProspectAddressBo> getAddresses() {
    return addresses;
  }

  public void setAddresses(Collection<ProspectAddressBo> addresses) {
    this.addresses = addresses;
  }

  public Collection<ProspectRelaBo> getMembers() {
    return members;
  }

  public void setMembers(Collection<ProspectRelaBo> members) {
    this.members = members;
  }
}

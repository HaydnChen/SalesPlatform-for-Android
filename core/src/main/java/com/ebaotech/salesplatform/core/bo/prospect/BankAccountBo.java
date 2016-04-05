package com.ebaotech.salesplatform.core.bo.prospect;

import com.ebaotech.salesplatform.core.bo.AbstractSyncableBo;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import java.util.Date;
import java.util.UUID;

/**
 * Created by haydn.chen on 4/1/2016.
 */
@DatabaseTable(tableName = "T_SP_BANK_ACCOUNT")
public class BankAccountBo extends AbstractSyncableBo {
  @DatabaseField(foreign = true, foreignAutoRefresh = true, columnName = "PROSPECT_OFFLINE_ID")
  private ProspectBo prospect;
  @DatabaseField
  private String bankCode;
  @DatabaseField
  private String bankAccount;
  @DatabaseField
  private String accoName;
  @DatabaseField
  private Date applyDate;
  @DatabaseField
  private String accountType;
  @DatabaseField
  private Date expireDate;
  @DatabaseField
  private String isSelf;
  @DatabaseField
  private String branchCode;
  @DatabaseField
  private String bankAccountCity;
  @DatabaseField
  private String ibanCode;
  @DatabaseField
  private String creditCardType;
  @DatabaseField
  private String debitCreditType;
  @DatabaseField
  private String issueBankName;
  @DatabaseField
  private String chequeNumber;
  @DatabaseField
  private String bankName;
  @DatabaseField
  private String passPort;

  public ProspectBo getProspect() {
    return prospect;
  }

  public void setProspect(ProspectBo prospect) {
    this.prospect = prospect;
  }

  public String getBankCode() {
    return bankCode;
  }

  public void setBankCode(String bankCode) {
    this.bankCode = bankCode;
  }

  public String getBankAccount() {
    return bankAccount;
  }

  public void setBankAccount(String bankAccount) {
    this.bankAccount = bankAccount;
  }

  public String getAccoName() {
    return accoName;
  }

  public void setAccoName(String accoName) {
    this.accoName = accoName;
  }

  public Date getApplyDate() {
    return applyDate;
  }

  public void setApplyDate(Date applyDate) {
    this.applyDate = applyDate;
  }

  public String getAccountType() {
    return accountType;
  }

  public void setAccountType(String accountType) {
    this.accountType = accountType;
  }

  public Date getExpireDate() {
    return expireDate;
  }

  public void setExpireDate(Date expireDate) {
    this.expireDate = expireDate;
  }

  public String getIsSelf() {
    return isSelf;
  }

  public void setIsSelf(String isSelf) {
    this.isSelf = isSelf;
  }

  public String getBranchCode() {
    return branchCode;
  }

  public void setBranchCode(String branchCode) {
    this.branchCode = branchCode;
  }

  public String getBankAccountCity() {
    return bankAccountCity;
  }

  public void setBankAccountCity(String bankAccountCity) {
    this.bankAccountCity = bankAccountCity;
  }

  public String getIbanCode() {
    return ibanCode;
  }

  public void setIbanCode(String ibanCode) {
    this.ibanCode = ibanCode;
  }

  public String getCreditCardType() {
    return creditCardType;
  }

  public void setCreditCardType(String creditCardType) {
    this.creditCardType = creditCardType;
  }

  public String getDebitCreditType() {
    return debitCreditType;
  }

  public void setDebitCreditType(String debitCreditType) {
    this.debitCreditType = debitCreditType;
  }

  public String getIssueBankName() {
    return issueBankName;
  }

  public void setIssueBankName(String issueBankName) {
    this.issueBankName = issueBankName;
  }

  public String getChequeNumber() {
    return chequeNumber;
  }

  public void setChequeNumber(String chequeNumber) {
    this.chequeNumber = chequeNumber;
  }

  public String getBankName() {
    return bankName;
  }

  public void setBankName(String bankName) {
    this.bankName = bankName;
  }

  public String getPassPort() {
    return passPort;
  }

  public void setPassPort(String passPort) {
    this.passPort = passPort;
  }
}

package com.ebaotech.salesplatform.rest.model.prospect;

import com.ebaotech.salesplatform.rest.model.AbstractSyncableModel;

public class BankAccount extends AbstractSyncableModel {
	private static final long serialVersionUID = 8212350477581810428L;

	private String bankCode;

	private String bankAccount;

	private String accoName;

	private Long applyDateTimestamp;

	private String accountType;

	private Long expireDateTimestamp;

	private String isSelf;

	private String branchCode;

	private String bankAccountCity;

	private String ibanCode;

	private String creditCardType;

	private String debitCreditType;

	private String issueBankName;

	private String chequeNumber;

	private String bankName;

	private String passPort;

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

	public Long getApplyDateTimestamp() {
		return applyDateTimestamp;
	}

	public void setApplyDateTimestamp(Long applyDateTimestamp) {
		this.applyDateTimestamp = applyDateTimestamp;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public Long getExpireDateTimestamp() {
		return expireDateTimestamp;
	}

	public void setExpireDateTimestamp(Long expireDateTimestamp) {
		this.expireDateTimestamp = expireDateTimestamp;
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

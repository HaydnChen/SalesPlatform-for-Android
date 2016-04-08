package com.ebaotech.salesplatform.rest.model.quotation;

import java.io.Serializable;

public class ProposalRuleResult implements Serializable {
	private static final long serialVersionUID = 377034171001323698L;

	private String ruleName;

	private Long ruleType;

	private Long ruleStatus;

	private String printable;

	private String violatedDesc;

	private String letterContent;

	private String notes;

	public String getRuleName() {
		return ruleName;
	}

	public void setRuleName(String ruleName) {
		this.ruleName = ruleName;
	}

	public Long getRuleType() {
		return ruleType;
	}

	public void setRuleType(Long ruleType) {
		this.ruleType = ruleType;
	}

	public Long getRuleStatus() {
		return ruleStatus;
	}

	public void setRuleStatus(Long ruleStatus) {
		this.ruleStatus = ruleStatus;
	}

	public String getPrintable() {
		return printable;
	}

	public void setPrintable(String printable) {
		this.printable = printable;
	}

	public String getViolatedDesc() {
		return violatedDesc;
	}

	public void setViolatedDesc(String violatedDesc) {
		this.violatedDesc = violatedDesc;
	}

	public String getLetterContent() {
		return letterContent;
	}

	public void setLetterContent(String letterContent) {
		this.letterContent = letterContent;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}
}

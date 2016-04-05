package com.ebaotech.salesplatform.core.bo.quotation;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import java.util.UUID;

/**
 * Created by haydn.chen on 4/5/2016.
 */
@DatabaseTable(tableName = "T_SP_PROPOSAL_RULE_RESULT")
public class ProposalRuleResultBo {
  @DatabaseField(generatedId = true, columnName = "OFFLINE_ID", allowGeneratedIdInsert = true)
  private UUID offlineId;
  @DatabaseField(foreign = true, foreignAutoRefresh = true, columnName = "QUOTATION_OFFLINE_ID")
  private QuotationBo quotation;
  @DatabaseField
  private String ruleName;
  @DatabaseField
  private Long ruleType;
  @DatabaseField
  private Long ruleStatus;
  @DatabaseField
  private String printable;
  @DatabaseField
  private String violatedDesc;
  @DatabaseField
  private String letterContent;
  @DatabaseField
  private String notes;

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

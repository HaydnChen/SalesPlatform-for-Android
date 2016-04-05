package com.ebaotech.salesplatform.core.bo.quotation;

import com.ebaotech.salesplatform.core.bo.prospect.BankAccountBo;
import com.ebaotech.salesplatform.core.bo.prospect.ProspectBo;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import java.util.UUID;

/**
 * Created by haydn.chen on 4/5/2016.
 */
@DatabaseTable(tableName = "T_SP_PAYER_ACCOUNT")
public class PayerAccountBo {
  @DatabaseField(generatedId = true, columnName = "OFFLINE_ID", allowGeneratedIdInsert = true)
  private UUID offlineId;
  @DatabaseField(foreign = true, foreignAutoRefresh = true, columnName = "QUOTATION_OFFLINE_ID")
  private QuotationBo quotation;
  @DatabaseField(foreign = true, foreignAutoRefresh = true, columnName = "ACCOUNT_OFFLINE_ID")
  private BankAccountBo account;
  @DatabaseField(foreign = true, foreignAutoRefresh = true, columnName = "PAYER_OFFLINE_ID")
  private ProspectBo payer;
  @DatabaseField
  private Long payMode;
  @DatabaseField
  private Long payNext;
  @DatabaseField(foreign = true, foreignAutoRefresh = true, columnName = "NEXT_ACCOUNT_OFFLINE_ID")
  private BankAccountBo nextAccount;
  @DatabaseField
  private Integer preferredDeductionDay;
  @DatabaseField
  private String relationToPh;

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

  public BankAccountBo getAccount() {
    return account;
  }

  public void setAccount(BankAccountBo account) {
    this.account = account;
  }

  public ProspectBo getPayer() {
    return payer;
  }

  public void setPayer(ProspectBo payer) {
    this.payer = payer;
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

  public BankAccountBo getNextAccount() {
    return nextAccount;
  }

  public void setNextAccount(BankAccountBo nextAccount) {
    this.nextAccount = nextAccount;
  }

  public Integer getPreferredDeductionDay() {
    return preferredDeductionDay;
  }

  public void setPreferredDeductionDay(Integer preferredDeductionDay) {
    this.preferredDeductionDay = preferredDeductionDay;
  }

  public String getRelationToPh() {
    return relationToPh;
  }

  public void setRelationToPh(String relationToPh) {
    this.relationToPh = relationToPh;
  }
}

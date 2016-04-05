package com.ebaotech.salesplatform.core.bo.quotation;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;

/**
 * Created by haydn.chen on 4/5/2016.
 */
@DatabaseTable(tableName = "T_SP_PAYMENT")
public class PaymentBo {
  @DatabaseField(generatedId = true, columnName = "OFFLINE_ID", allowGeneratedIdInsert = true)
  private UUID offlineId;
  @DatabaseField(foreign = true, foreignAutoRefresh = true, columnName = "QUOTATION_OFFLINE_ID")
  private QuotationBo quotation;
  @DatabaseField
  private Long payMode;
  @DatabaseField
  private BigDecimal payAmount;
  @DatabaseField
  private String payAccountNO;
  @DatabaseField
  private String bankCode;
  @DatabaseField
  private Long moneyId;
  @DatabaseField
  private Date payDueDate;

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

  public Long getPayMode() {
    return payMode;
  }

  public void setPayMode(Long payMode) {
    this.payMode = payMode;
  }

  public BigDecimal getPayAmount() {
    return payAmount;
  }

  public void setPayAmount(BigDecimal payAmount) {
    this.payAmount = payAmount;
  }

  public String getPayAccountNO() {
    return payAccountNO;
  }

  public void setPayAccountNO(String payAccountNO) {
    this.payAccountNO = payAccountNO;
  }

  public String getBankCode() {
    return bankCode;
  }

  public void setBankCode(String bankCode) {
    this.bankCode = bankCode;
  }

  public Long getMoneyId() {
    return moneyId;
  }

  public void setMoneyId(Long moneyId) {
    this.moneyId = moneyId;
  }

  public Date getPayDueDate() {
    return payDueDate;
  }

  public void setPayDueDate(Date payDueDate) {
    this.payDueDate = payDueDate;
  }
}

package com.ebaotech.salesplatform.core.bo.quotation;

import com.ebaotech.salesplatform.core.bo.prospect.AddressBo;
import com.ebaotech.salesplatform.core.bo.prospect.BankAccountBo;
import com.ebaotech.salesplatform.core.bo.prospect.ProspectBo;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import java.math.BigDecimal;
import java.util.UUID;

/**
 * Created by haydn.chen on 4/5/2016.
 */
@DatabaseTable(tableName = "T_SP_PAY_PLAN_PAYEE")
public class PayPlanPayeeBo {
  @DatabaseField(generatedId = true, columnName = "OFFLINE_ID", allowGeneratedIdInsert = true)
  private UUID offlineId;
  @DatabaseField(foreign = true, foreignAutoRefresh = true, columnName = "QUOTATION_OFFLINE_ID")
  private QuotationBo quotation;
  @DatabaseField(foreign = true, foreignAutoRefresh = true, columnName = "QUOTATION_PRODUCT_OFFLINE_ID")
  private QuotationProductBo quotationProduct;
  @DatabaseField(foreign = true, foreignAutoRefresh = true, columnName = "PAYEE_ADDRESS_OFFLINE_ID")
  private AddressBo payeeAddress;
  @DatabaseField(foreign = true, foreignAutoRefresh = true, columnName = "PAY_PLAN_OFFLINE_ID")
  private PayPlanBo PayPlan;
  @DatabaseField(foreign = true, foreignAutoRefresh = true, columnName = "PAYEE_ACCOUNT_OFFLINE_ID")
  private BankAccountBo payeeAccount;
  @DatabaseField(foreign = true, foreignAutoRefresh = true, columnName = "PAYEE_OFFLINE_ID")
  private ProspectBo payee;
  @DatabaseField
  private Long payMode;
  @DatabaseField
  private BigDecimal payeeRate;

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

  public QuotationProductBo getQuotationProduct() {
    return quotationProduct;
  }

  public void setQuotationProduct(QuotationProductBo quotationProduct) {
    this.quotationProduct = quotationProduct;
  }

  public AddressBo getPayeeAddress() {
    return payeeAddress;
  }

  public void setPayeeAddress(AddressBo payeeAddress) {
    this.payeeAddress = payeeAddress;
  }

  public PayPlanBo getPayPlan() {
    return PayPlan;
  }

  public void setPayPlan(PayPlanBo payPlan) {
    PayPlan = payPlan;
  }

  public BankAccountBo getPayeeAccount() {
    return payeeAccount;
  }

  public void setPayeeAccount(BankAccountBo payeeAccount) {
    this.payeeAccount = payeeAccount;
  }

  public ProspectBo getPayee() {
    return payee;
  }

  public void setPayee(ProspectBo payee) {
    this.payee = payee;
  }

  public Long getPayMode() {
    return payMode;
  }

  public void setPayMode(Long payMode) {
    this.payMode = payMode;
  }

  public BigDecimal getPayeeRate() {
    return payeeRate;
  }

  public void setPayeeRate(BigDecimal payeeRate) {
    this.payeeRate = payeeRate;
  }
}

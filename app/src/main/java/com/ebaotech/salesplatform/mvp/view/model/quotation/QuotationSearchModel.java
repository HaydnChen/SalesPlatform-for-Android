package com.ebaotech.salesplatform.mvp.view.model.quotation;

/**
 * Created by haydn.chen on 3/31/2016.
 */
public class QuotationSearchModel {
  private String quotationId;

  private String policyHolderId;

  public String getQuotationId() {
    return quotationId;
  }

  public void setQuotationId(String quotationId) {
    this.quotationId = quotationId;
  }

  public String getPolicyHolderId() {
    return policyHolderId;
  }

  public void setPolicyHolderId(String policyHolderId) {
    this.policyHolderId = policyHolderId;
  }
}

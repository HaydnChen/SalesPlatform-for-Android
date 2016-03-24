package com.ebaotech.salesplatform.mvp.view.model.quotation;

import com.ebaotech.salesplatform.mvp.view.model.customer.CustomerViewModel;

import java.math.BigDecimal;
import java.util.List;

/**
 * Copyright (C) 2016 ebaotech.com. All rights reserved.
 * Author: Zhu Liliang; Date:3/15/16.
 */
public class QuotationViewModel {
    private String quotationId;
    private String productId;
    private CustomerViewModel policyHolder;
    private List<CustomerViewModel> insureds;
    private BigDecimal premium;
    private BigDecimal SA;

    public String getQuotationId() {
        return quotationId;
    }

    public void setQuotationId(String quotationId) {
        this.quotationId = quotationId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public CustomerViewModel getPolicyHolder() {
        return policyHolder;
    }

    public void setPolicyHolder(CustomerViewModel policyHolder) {
        this.policyHolder = policyHolder;
    }

    public List<CustomerViewModel> getInsureds() {
        return insureds;
    }

    public void setInsureds(List<CustomerViewModel> insureds) {
        this.insureds = insureds;
    }

    public BigDecimal getPremium() {
        return premium;
    }

    public void setPremium(BigDecimal premium) {
        this.premium = premium;
    }

    public BigDecimal getSA() {
        return SA;
    }

    public void setSA(BigDecimal SA) {
        this.SA = SA;
    }
}

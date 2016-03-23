package com.ebaotech.salesplatform.domain;

import java.math.BigDecimal;
import java.util.List;

/**
 * Copyright (C) 2016 ebaotech.com. All rights reserved.
 * Author: Zhu Liliang; Date:3/15/16.
 */
public class Quotation {
    private String quotationId;
    private String productId;
    private Customer policyHolder;
    private List<Customer> insureds;
    private BigDecimal premium;
    private BigDecimal SA;

    public Quotation() {
    }

    public Quotation(String quotationId) {
        this.quotationId = quotationId;
    }

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

    public Customer getPolicyHolder() {
        return policyHolder;
    }

    public void setPolicyHolder(Customer policyHolder) {
        this.policyHolder = policyHolder;
    }

    public List<Customer> getInsureds() {
        return insureds;
    }

    public void setInsureds(List<Customer> insureds) {
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

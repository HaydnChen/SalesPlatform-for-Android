package com.ebaotech.salesplatform.core.bo;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.math.BigDecimal;

/**
 * Copyright (C) 2016 ebaotech.com. All rights reserved.
 * Author: Zhu Liliang; Date:3/15/16.
 */
@DatabaseTable(tableName = "t_quotation")
public class QuotationBo {

    @DatabaseField(generatedId = true)
    private Integer quotationId;

    @DatabaseField
    private String productId;

    @DatabaseField
    private BigDecimal premium;

    @DatabaseField
    private BigDecimal SA;


    public Integer getQuotationId() {
        return quotationId;
    }

    public void setQuotationId(Integer quotationId) {
        this.quotationId = quotationId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
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

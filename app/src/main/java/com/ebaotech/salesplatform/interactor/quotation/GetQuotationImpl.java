  package com.ebaotech.salesplatform.interactor.quotation;

import com.ebaotech.salesplatform.core.dao.CustomerDao;
import com.ebaotech.salesplatform.core.dao.QuotationDao;
import com.ebaotech.salesplatform.domain.Quotation;
import com.ebaotech.salesplatform.interactor.customer.CustomerMapper;

import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.EBean;
import org.androidannotations.annotations.UiThread;

import hugo.weaving.DebugLog;

/*
 *  Copyright (c) 2016.  ebaotech.com. All rights reserved.
 *  Author: Zhu Liliang; Date:3/2/16 10:28 PM
 */
@EBean
public class GetQuotationImpl implements GetQuotation {

    private Callback callback;

    @Bean
    protected QuotationDao quotationDao;

    @Bean
    protected CustomerDao customerDao;

    @Override
    @Background
    @DebugLog
    public void getQuotation(String quotationId, Callback callback) {
        this.callback = callback;
        // TODO: 3/2/16 10:17 PM  load data from db or cache
        Quotation quotation = QuotationMapper.convertQuotationBoToDomain(quotationDao.queryForId(Integer.valueOf(quotationId)));
        onItemLoaded(quotation);
    }

    @Override
    @Background
    @DebugLog
    public void newQuotation(String policyHolderId, Callback callback) {
        this.callback = callback;
        Quotation quotation = new Quotation();
        quotation.setPolicyHolder(CustomerMapper.convertCustomerToDomain(customerDao.queryForId(Integer.valueOf(policyHolderId))));
        onItemLoaded(quotation);
    }

    @UiThread
    @DebugLog
    public void onItemLoaded(Quotation quotation) {
        callback.onQuotationLoaded(quotation);
    }

    @UiThread
    public void onError(Exception e) {
        callback.onError(e);
    }

}

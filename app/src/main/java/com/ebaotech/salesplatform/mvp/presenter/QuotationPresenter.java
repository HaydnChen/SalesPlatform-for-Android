package com.ebaotech.salesplatform.mvp.presenter;

import com.ebaotech.salesplatform.core.mvp.Presenter;
import com.ebaotech.salesplatform.core.mvp.View;
import com.ebaotech.salesplatform.domain.Quotation;
import com.ebaotech.salesplatform.interactor.quotation.GetQuotation;
import com.ebaotech.salesplatform.interactor.quotation.GetQuotationImpl;
import com.ebaotech.salesplatform.mvp.view.QuotationView;
import com.ebaotech.salesplatform.mvp.view.model.quotation.QuotationViewModel;

import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.EBean;
import org.androidannotations.annotations.UiThread;

/*
 *  Copyright (c) 2016.  ebaotech.com. All rights reserved.
 *  Author: Zhu Liliang; Date:3/2/16 10:56 PM
 */

@EBean(scope = EBean.Scope.Singleton)
public class QuotationPresenter extends BasePresenter implements Presenter {

    private QuotationView quotationView;

    private String quotationId;

    private String policyHolderId;

    @Bean(GetQuotationImpl.class)
    GetQuotation getQuotation;

    @Override
    public void setView(View view) {
        this.quotationView = (QuotationView) view;
    }

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

    @Override
    public void start() {
        quotationView.showLoading("Loading");

        if (quotationId != null) {  //load quotation
            getQuotation.getQuotation(quotationId, new GetQuotation.Callback() {

                @Override
                public void onQuotationLoaded(Quotation quotation) {
                    quotationView.setViewModel(convertQuotationToViewModel(quotation));
                    quotationView.hideLoading(true);
                }

                @Override
                public void onError(Exception e) {
                    quotationView.showActionLabel("Error during fetching quotation data!");
                    quotationView.hideLoading(false);
                }
            });

        } else if (null != policyHolderId) {  // new quotation with this customer
            getQuotation.newQuotation(policyHolderId, new GetQuotation.Callback() {

                @Override
                public void onQuotationLoaded(Quotation quotation) {
                    quotationView.setViewModel(convertQuotationToViewModel(quotation));
                    quotationView.hideLoading(true);
                }

                @Override
                public void onError(Exception e) {
                    quotationView.showActionLabel("Error during fetching policy holder data!");
                    quotationView.hideLoading(false);
                }
            });

        } else {  // wrong parameter
            onError(new Exception("choose customer first."));
        }
    }

    @Override
    public void stop() {
        //TODO if something needed to
    }

    @Override
    @UiThread
    public void onError(Exception exception) {
        quotationView.showActionLabel(exception.getMessage());
    }

    public QuotationViewModel convertQuotationToViewModel(Quotation quotation) {
        QuotationViewModel quotationViewModel = new QuotationViewModel();
        quotationViewModel.setQuotationId(quotation.getQuotationId());
        quotationViewModel.setSA(quotation.getSA());
        quotationViewModel.setProductId(quotation.getProductId());
        quotationViewModel.setPremium(quotation.getPremium());

        quotationViewModel.setPolicyHolder(CustomerPresenter.convertCustomerToModel(quotation.getPolicyHolder()));

        return quotationViewModel;
    }

}

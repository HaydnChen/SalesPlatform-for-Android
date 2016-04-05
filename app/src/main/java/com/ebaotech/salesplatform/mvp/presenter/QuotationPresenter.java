package com.ebaotech.salesplatform.mvp.presenter;

import com.ebaotech.salesplatform.core.mvp.Presenter;
import com.ebaotech.salesplatform.core.mvp.View;
import com.ebaotech.salesplatform.domain.Quotation;
import com.ebaotech.salesplatform.interactor.quotation.GetQuotation;
import com.ebaotech.salesplatform.interactor.quotation.GetQuotationImpl;
import com.ebaotech.salesplatform.mapper.domain2model.CustomerDomainModelMapper;
import com.ebaotech.salesplatform.mvp.view.QuotationView;
import com.ebaotech.salesplatform.mvp.view.model.quotation.QuotationSearchModel;
import com.ebaotech.salesplatform.mvp.view.model.quotation.QuotationViewModel;

import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.EBean;
import org.androidannotations.annotations.UiThread;

/*
 *  Copyright (c) 2016.  ebaotech.com. All rights reserved.
 *  Author: Zhu Liliang; Date:3/2/16 10:56 PM
 */

@EBean(scope = EBean.Scope.Singleton)
public class QuotationPresenter extends BasePresenter implements Presenter<QuotationViewModel, QuotationSearchModel> {

    private QuotationView quotationView;

    @Bean(GetQuotationImpl.class)
    GetQuotation getQuotation;

    @Override
    public void setView(View view) {
        this.quotationView = (QuotationView) view;
    }

    @Override public void load(QuotationSearchModel quotationSearchModel) {
        quotationView.showLoading("Loading");

        if (quotationSearchModel.getQuotationId() != null) {  //load quotation
            getQuotation.getQuotation(quotationSearchModel.getQuotationId(),
                new GetQuotation.Callback() {

                    @Override public void onQuotationLoaded(Quotation quotation) {
                        quotationView.onViewModelLoaded(convertQuotationToViewModel(quotation));
                        quotationView.hideLoading(true);
                    }

                    @Override public void onError(Exception e) {
                        quotationView.showActionLabel("Error during fetching quotation data!");
                        quotationView.hideLoading(false);
                    }
            });

        } else if (null != quotationSearchModel.getPolicyHolderId()) {  // new quotation with this customer
            getQuotation.newQuotation(quotationSearchModel.getPolicyHolderId(), new GetQuotation.Callback() {

                @Override
                public void onQuotationLoaded(Quotation quotation) {
                    quotationView.onViewModelLoaded(convertQuotationToViewModel(quotation));
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

    @Override public void save(QuotationViewModel viewModel) {

    }

    @Override public void delete(QuotationSearchModel searchModel) {

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

        quotationViewModel.setPolicyHolder(
            CustomerDomainModelMapper.convertCustomerToModel(quotation.getPolicyHolder()));

        return quotationViewModel;
    }

}

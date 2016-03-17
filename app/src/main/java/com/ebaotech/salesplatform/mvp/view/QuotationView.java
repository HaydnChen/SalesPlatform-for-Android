package com.ebaotech.salesplatform.mvp.view;

import com.ebaotech.salesplatform.core.mvp.View;
import com.ebaotech.salesplatform.mvp.view.model.quotation.QuotationViewModel;


public interface QuotationView extends View {

    void setViewModel(QuotationViewModel quotationViewModel);

}

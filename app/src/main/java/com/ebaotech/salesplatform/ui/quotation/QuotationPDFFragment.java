package com.ebaotech.salesplatform.ui.quotation;

import com.ebaotech.salesplatform.R;
import com.ebaotech.salesplatform.mvp.view.model.customer.CustomerViewModel;
import com.ebaotech.salesplatform.ui.AbstractActivity;
import com.ebaotech.salesplatform.ui.AbstractFragment;

import org.androidannotations.annotations.EFragment;

/**
 * Copyright (C) 2016 ebaotech.com. All rights reserved.
 * Author: Zhu Liliang; Date:3/15/16.
 */

// TODO: 3/15/16 4:49 PM  detail fragment UI
@EFragment(R.layout.fragment_customer_basic)
public class QuotationPDFFragment extends AbstractFragment {

    private CustomerViewModel customerViewModel;

    public static QuotationPDFFragment newInstance(AbstractActivity abstractActivity) {
        QuotationPDFFragment fragment = new QuotationPDFFragment_();
        fragment.setContainerActivity(abstractActivity);
        return fragment;
    }


    public void setCustomerViewModel(CustomerViewModel customerViewModel) {
        this.customerViewModel = customerViewModel;
    }
}

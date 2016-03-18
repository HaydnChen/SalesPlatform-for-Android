package com.ebaotech.salesplatform.ui.quotation;

import android.widget.EditText;

import com.ebaotech.salesplatform.R;
import com.ebaotech.salesplatform.mvp.view.model.quotation.QuotationViewModel;
import com.ebaotech.salesplatform.ui.AbstractActivity;
import com.ebaotech.salesplatform.ui.AbstractFragment;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.ViewById;

/**
 * Copyright (C) 2016 ebaotech.com. All rights reserved.
 * Author: Zhu Liliang; Date:3/15/16.
 */

// TODO: 3/15/16 4:49 PM  detail fragment UI

@EFragment(R.layout.fragment_quotation_product)
public class QuotationEditProductFragment extends AbstractFragment {

    @ViewById(R.id.et_input__customer_name)
    EditText customerName;

    private QuotationViewModel quotationViewModel;

    public static QuotationEditProductFragment newInstance(AbstractActivity abstractActivity) {
        QuotationEditProductFragment fragment = new QuotationEditProductFragment_();
        fragment.setContainerActivity(abstractActivity);
        return fragment;
    }

    @AfterViews
    void initPage() {
        if (null != quotationViewModel) {
            customerName.setText(quotationViewModel.getPolicyHolder().getName());
        }

    }

    public void setQuotationViewModel(QuotationViewModel quotationViewModel) {
        this.quotationViewModel = quotationViewModel;
    }
}

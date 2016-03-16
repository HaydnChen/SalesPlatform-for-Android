package com.ebaotech.salesplatform.ui.quotation;

import com.ebaotech.salesplatform.R;
import com.ebaotech.salesplatform.ui.AbstractActivity;
import com.ebaotech.salesplatform.ui.AbstractFragment;

import org.androidannotations.annotations.EFragment;

/**
 * Copyright (C) 2016 ebaotech.com. All rights reserved.
 * Author: Zhu Liliang; Date:3/15/16.
 */

// TODO: 3/15/16 4:49 PM  detail fragment UI
@EFragment(R.layout.fragment_customer_basic)
public class QuotationProductFragment extends AbstractFragment {

    public static QuotationProductFragment newInstance(AbstractActivity abstractActivity) {
        QuotationProductFragment fragment = new QuotationProductFragment_();
        fragment.setContainerActivity(abstractActivity);
        return fragment;
    }
}

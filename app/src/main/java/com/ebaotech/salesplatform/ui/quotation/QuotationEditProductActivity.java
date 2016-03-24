package com.ebaotech.salesplatform.ui.quotation;

import android.content.Context;
import android.support.v7.widget.Toolbar;

import com.ebaotech.salesplatform.R;
import com.ebaotech.salesplatform.ui.AbstractActivity;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

/**
 * Copyright (C) 2016 ebaotech.com. All rights reserved.
 * Author: Zhu Liliang; Date:3/18/16.
 */

@EActivity(R.layout.activity_quotation_product)
public class QuotationEditProductActivity extends AbstractActivity {

        @ViewById
        protected Toolbar toolbar;

        @AfterViews
        protected void initPage() {
            setSupportActionBar(toolbar);
            toolbar.setTitle(getTitle());
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

    public static void launch(Context context) {
        QuotationEditProductActivity_.intent(context).start();
    }
}

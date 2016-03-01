package com.ebaotech.salesplatform.ui;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.widget.ImageView;
import android.widget.TextView;

import com.ebaotech.salesplatform.R;
import com.ebaotech.salesplatform.domain.Customer;

import org.androidannotations.annotations.EViewGroup;
import org.androidannotations.annotations.ViewById;

/**
 * Copyright (C) 2016 ebaotech.com. All rights reserved.
 * Author: Zhu Liliang; Date:2/29/16.
 */
@EViewGroup(R.layout.fragment_customer_list_item)
public class CustomerItemCardView extends CardView {

    @ViewById(R.id.customer_age)
    TextView ageView;
    @ViewById(R.id.customer_name)
    TextView nameView;
    @ViewById(R.id.customer_detail)
    TextView detailView;
    @ViewById(R.id.customer_photo)
    ImageView photoImage;


    public CustomerItemCardView(Context context) {
        super(context);
    }

    public void bind(Customer customer) {
        ageView.setText(customer.age + " ");
        nameView.setText(customer.name);
        detailView.setText(customer.details);
        photoImage.setImageResource(R.drawable.ic_person);
    }
}

package com.ebaotech.salesplatform.mvp.view.model.customer;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.ebaotech.salesplatform.R;
import com.ebaotech.salesplatform.commons.util.TextUtil;

import com.ebaotech.salesplatform.ui.customer.CustomerEditActivity;
import com.ebaotech.salesplatform.ui.quotation.QuotationEditActivity;

import java.util.ArrayList;
import java.util.List;

/**
 * Copyright (C) 2016 ebaotech.com. All rights reserved.
 * Author: Zhu Liliang; Date:3/2/16.
 */
public class CustomerListModelAdapter extends RecyclerView.Adapter<CustomerListModelAdapter.CustomerListViewHolder> {

    private static final String TAG = "CustomerListModelAdapter";
    private List<CustomerListViewModel> viewModels;

    public CustomerListModelAdapter(List<CustomerListViewModel> viewModels) {
        this.viewModels = viewModels;
    }

    public CustomerListModelAdapter() {
        this.viewModels = new ArrayList<>();
    }


    @Override
    public CustomerListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new CustomerListViewHolder(
                LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_customer_list_item, parent, false)
        );
    }


    @Override
    public void onBindViewHolder(CustomerListViewHolder holder, int position) {
        CustomerListViewModel model = viewModels.get(position);
        holder.ageView.setText(model.getAge() + " years old");
        holder.nameView.setText(model.getName());
        holder.genderView.setText(model.getGender());
        holder.detailView.setText(TextUtil.truncateIfLengthMoreThan(80, model.getDetails()));
        holder.photoImage.setImageResource(R.drawable.ic_action_user);

        holder.customerCardView.setTag(model.getId());
        holder.customerCardView.setOnClickListener(new View.OnClickListener() {
            /**
             * Called when a view has been clicked.
             *
             * @param v The view that was clicked.
             */
            @SuppressLint("LongLogTag")
            @Override
            public void onClick(View v) {
                String customerId = (String) v.getTag();
                Log.d(TAG, "Customer " + customerId + " clicked.");
                Context context = v.getContext();
                CustomerEditActivity.launch(context, customerId);
            }
        });
        holder.newQuotation.setTag(model.getId());
        holder.newQuotation.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String customerId = (String) v.getTag();
                Context context = v.getContext();
                QuotationEditActivity.launch(context,null,customerId);
            }
        });

    }

    @Override
    public int getItemCount() {
        return viewModels.size();
    }

    public void clear() {
        viewModels.clear();
    }


    public void addAll(List<CustomerListViewModel> modelList) {
        for (CustomerListViewModel m : modelList) {
            if (!viewModels.contains(m)) {
                viewModels.add(m);
            }
        }
    }

    public CustomerListViewModel getItemByPosition(int position) {
        return viewModels.get(position);
    }


    /**
     * ViewHolder for CustomerBo List (Home page)
     */
    public class CustomerListViewHolder extends RecyclerView.ViewHolder {

        TextView ageView;
        TextView nameView;
        TextView genderView;
        TextView detailView;
        ImageView photoImage;
        ImageView newQuotation;
        ImageView newFNA;

        private CardView customerCardView;


        public CustomerListViewHolder(View itemView) {
            super(itemView);
            //this.itemView = itemView;

            customerCardView = (CardView) itemView;

            // TODO: 3/2/16 3:49 PM add View Items
            ageView = (TextView) itemView.findViewById(R.id.customer_age);
            nameView = (TextView) itemView.findViewById(R.id.customer_name);
            genderView = (TextView) itemView.findViewById(R.id.customer_gender);
            detailView = (TextView) itemView.findViewById(R.id.customer_detail);
            photoImage = (ImageView) itemView.findViewById(R.id.customer_photo);
            newQuotation = (ImageView) itemView.findViewById(R.id.new_quotation);
            newFNA = (ImageView) itemView.findViewById(R.id.new_fna);

        }
    }
}

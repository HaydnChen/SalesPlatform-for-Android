package com.ebaotech.salesplatform.mvp.view.model.customer;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.ebaotech.salesplatform.R;
import com.ebaotech.salesplatform.commons.util.TextUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * Copyright (C) 2016 ebaotech.com. All rights reserved.
 * Author: Zhu Liliang; Date:3/2/16.
 */
public class CustomerListModelAdapter extends RecyclerView.Adapter<CustomerListModelAdapter.CustomerListViewHolder> {

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
        holder.ageView.setText(model.getAge()+" years old");
        holder.nameView.setText(model.getName());
        holder.genderView.setText(model.getGender());
        holder.detailView.setText(TextUtil.truncateIfLengthMoreThan(80,model.getDetails()));
        holder.photoImage.setImageResource(R.drawable.ic_action_user);
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
        View view;

        TextView ageView;
        TextView nameView;
        TextView genderView;
        TextView detailView;
        ImageView photoImage;

        public CustomerListViewHolder(View itemView) {
            super(itemView);
            this.view = itemView;

            // TODO: 3/2/16 3:49 PM add View Items

            ageView = (TextView) view.findViewById(R.id.customer_age);
            nameView = (TextView) view.findViewById(R.id.customer_name);
            genderView = (TextView) view.findViewById(R.id.customer_gender);
            detailView = (TextView) view.findViewById(R.id.customer_detail);
            photoImage = (ImageView) view.findViewById(R.id.customer_photo);

        }
    }
}

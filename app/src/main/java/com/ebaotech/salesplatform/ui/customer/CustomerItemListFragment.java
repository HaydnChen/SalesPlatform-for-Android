package com.ebaotech.salesplatform.ui.customer;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.ebaotech.salesplatform.R;
import com.ebaotech.salesplatform.commons.util.DensityUtil;
import com.ebaotech.salesplatform.mvp.presenter.CustomerListPresenter;
import com.ebaotech.salesplatform.mvp.view.CustomerListView;
import com.ebaotech.salesplatform.mvp.view.model.customer.CustomerListModelAdapter;
import com.ebaotech.salesplatform.mvp.view.model.customer.CustomerListViewModel;

import com.ebaotech.salesplatform.ui.AbstractActivity;
import com.ebaotech.salesplatform.ui.AbstractFragment;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;

import java.util.List;

/*
 *  Copyright (c) 2016.  ebaotech.com. All rights reserved.
 *  Author: Zhu Liliang; Date:3/3/16 12:03 AM
 */

/**
 * A fragment representing a list of Items.
 */
@EFragment(R.layout.fragment_customer_list)
public class CustomerItemListFragment extends AbstractFragment implements CustomerListView {

    // TODO: Customize parameter argument names
    private static final String ARG_COLUMN_COUNT = "column-count";
    // TODO: Customize parameters
    private int columnCount;

    @ViewById(R.id.customer_list) View view;

    @Bean
    CustomerListPresenter customerListPresenter;

    private CustomerListModelAdapter customerListModelAdapter;

    /**
     * return a new instance
     * @return
     */
    public static CustomerItemListFragment newInstance(AbstractActivity containerActivity) {
        CustomerItemListFragment fragment = new CustomerItemListFragment_();
        fragment.setContainerActivity(containerActivity);
        return fragment;
    }

    @AfterViews
    void onAfterViews() {
        //setup customer fragment

        setupCustomerCardView();
    }

    private void setupCustomerCardView() {
        int deviceWidthInpixes = DensityUtil.getDeviceWidthInPixes(this.getContext());
        //contact card width is around 800
        this.columnCount = deviceWidthInpixes / 800;
        // Set the adapter
        if (view instanceof RecyclerView) {
            Context context = view.getContext();
            RecyclerView recyclerView = (RecyclerView) view;
            if (columnCount <= 1) {
                recyclerView.setLayoutManager(new LinearLayoutManager(context));
            } else {
                recyclerView.setLayoutManager(new GridLayoutManager(context, columnCount));
            }
            customerListPresenter.setView(this);
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        //setup customer fragment
//        setupCustomerCardView(3);
    }

    @Override
    public void onStart() {
        super.onStart();
        customerListPresenter.start();
    }

    @Override
    public void onStop() {
        super.onStop();
        customerListPresenter.stop();
    }

    @Override
    @UiThread
    public void setListViewModels(List<CustomerListViewModel> customerListViewModels) {
        if (customerListModelAdapter == null) {
            customerListModelAdapter = new CustomerListModelAdapter();
        }
        RecyclerView recyclerView = (RecyclerView) view;
        recyclerView.setAdapter(customerListModelAdapter);
        customerListModelAdapter.addAll(customerListViewModels);
    }
}

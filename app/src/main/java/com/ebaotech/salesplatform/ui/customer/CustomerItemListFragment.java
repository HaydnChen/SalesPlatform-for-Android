package com.ebaotech.salesplatform.ui.customer;

import android.content.Context;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import com.ebaotech.salesplatform.R;
import com.ebaotech.salesplatform.commons.util.Constants;
import com.ebaotech.salesplatform.commons.util.DensityUtil;
import com.ebaotech.salesplatform.mvp.presenter.CustomerListPresenter;
import com.ebaotech.salesplatform.mvp.view.CustomerListView;
import com.ebaotech.salesplatform.mvp.view.model.customer.CustomerListModelAdapter;
import com.ebaotech.salesplatform.mvp.view.model.customer.CustomerListViewModel;

import com.ebaotech.salesplatform.mvp.view.model.customer.CustomerSearchModel;
import com.ebaotech.salesplatform.ui.AbstractActivity;
import com.ebaotech.salesplatform.ui.AbstractFragment;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;

import java.util.List;
import org.apache.commons.lang3.StringUtils;

/*
 *  Copyright (c) 2016.  ebaotech.com. All rights reserved.
 *  Author: Zhu Liliang; Date:3/3/16 12:03 AM
 */

/**
 * A fragment representing a list of Items.
 */
@EFragment(R.layout.fragment_customer_list)
public class CustomerItemListFragment extends AbstractFragment<List<CustomerListViewModel>> implements CustomerListView {

    // TODO: Customize parameter argument names
    private static final String ARG_COLUMN_COUNT = "column-count";
    // TODO: Customize parameters
    private int columnCount;
    @ViewById(R.id.customer_list) View view;

    @ViewById FloatingActionButton fab;

    @ViewById
    EditText searchName;

    @ViewById
    RadioGroup searchGender;

    @ViewById
    EditText searchAgeFrom;

    @ViewById
    EditText searchAgeTo;

    @ViewById
    EditText searchIdNumber;

    @Bean
    CustomerListPresenter customerListPresenter;

    private CustomerListModelAdapter customerListModelAdapter;

    boolean hasSearched = false;

    /**
     * return a new instance
     * @return CustomerItemListFragment
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
        int deviceWidthInPixes = DensityUtil.getDeviceWidthInPixes(this.getContext());
        float deviceDP = DensityUtil.convertPixelsToDp(deviceWidthInPixes, this.getContext());
        //contact card width is around 580
        int columnCount = (int) (deviceDP / Constants.Screen.CARD_WIDTH_IN_PIXES) + 1;
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
    }

    @Override
    public void onStart() {
        super.onStart();
        if (hasSearched) {
            onBtnSearchClick();
        }
    }

    @UiThread
    @Override public void onViewModelLoaded(List<CustomerListViewModel> customerListViewModels) {
        if (customerListModelAdapter == null) {
            customerListModelAdapter = new CustomerListModelAdapter();
        }
        RecyclerView recyclerView = (RecyclerView) view;
        recyclerView.setAdapter(customerListModelAdapter);
        customerListModelAdapter.clear();
        customerListModelAdapter.addAll(customerListViewModels);
    }

    @Click(R.id.btnSearch)
    void onBtnSearchClick() {
        CustomerSearchModel customerSearchModel = new CustomerSearchModel();
        customerSearchModel.setName(searchName.getText().toString());
        customerSearchModel.setGender(((RadioButton) searchGender.findViewById(
            searchGender.getCheckedRadioButtonId())).getText().toString());
        if (StringUtils.isNotBlank(searchAgeFrom.getText().toString())) {
            customerSearchModel.setAgeFrom(Integer.valueOf(searchAgeFrom.getText().toString()));
        }
        if (StringUtils.isNotBlank(searchAgeTo.getText().toString())) {
            customerSearchModel.setAgeTo(Integer.valueOf(searchAgeTo.getText().toString()));
        }
        customerSearchModel.setIdNumber(searchIdNumber.getText().toString());
        customerListPresenter.load(customerSearchModel);
        hasSearched = true;
    }

    @Click(R.id.btnReset)
    void onBtnResetClick(View view) {
        searchName.setText("");
        searchGender.check(searchGender.getChildAt(0).getId());
        searchAgeFrom.setText("");
        searchAgeTo.setText("");
        searchIdNumber.setText("");
    }

    @Click(R.id.fab)
    void onFabClick(View view) {
        CustomerEditActivity.launch(this.getContext(), null);
    }
}

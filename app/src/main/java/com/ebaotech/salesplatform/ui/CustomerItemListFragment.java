package com.ebaotech.salesplatform.ui;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.ebaotech.salesplatform.R;
import com.ebaotech.salesplatform.domain.Customer;
import com.ebaotech.salesplatform.mvp.presenter.CustomerListPresenter;
import com.ebaotech.salesplatform.mvp.view.CustomerListView;
import com.ebaotech.salesplatform.mvp.view.model.customer.CustomerListModelAdapter;
import com.ebaotech.salesplatform.mvp.view.model.customer.CustomerListViewModel;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.ViewById;

import java.util.List;

/*
 *  Copyright (c) 2016.  ebaotech.com. All rights reserved.
 *  Author: Zhu Liliang; Date:3/3/16 12:03 AM
 */

/**
 * A fragment representing a list of Items.
 * <p>
 * Activities containing this fragment MUST implement the {@link OnListFragmentInteractionListener}
 * interface.
 */
@EFragment(R.layout.fragment_customer_list)
public class CustomerItemListFragment extends Fragment implements CustomerListView {

    // TODO: Customize parameter argument names
    private static final String ARG_COLUMN_COUNT = "column-count";
    // TODO: Customize parameters
    private int columnCount;
    private OnListFragmentInteractionListener mListener;

    @ViewById(R.id.customer_list) View view;

    @Bean
    CustomerListPresenter customerListPresenter;

    private CustomerListModelAdapter customerListModelAdapter;

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public CustomerItemListFragment() {
    }

    /**
     * return a new instance
     * @param columnCount
     * @return
     */
    public static CustomerItemListFragment newInstance(int columnCount) {
        CustomerItemListFragment fragment = new CustomerItemListFragment_();
        Bundle args = new Bundle();
        args.putInt(ARG_COLUMN_COUNT, columnCount);
        fragment.setArguments(args);
        return fragment;
    }

    @AfterViews
    void onAfterViews() {
        //setup customer fragment
        setupCustomerCardView(3);
    }

    private void setupCustomerCardView(int columnCount) {
        this.columnCount = columnCount;
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
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnListFragmentInteractionListener) {
            mListener = (OnListFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnListFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
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
    public void setListViewModels(List<CustomerListViewModel> customerListViewModels) {
        if (customerListModelAdapter == null) {
            customerListModelAdapter = new CustomerListModelAdapter();
            RecyclerView recyclerView = (RecyclerView) view;
            recyclerView.setAdapter(customerListModelAdapter);
        }
        customerListModelAdapter.addAll(customerListViewModels);
    }


    @Override
    public void showLoading(String message) {
//        progress.showLoading(this, message);
    }

    @Override
    public void hideLoading(boolean sucess) {
//        progress.endLoading(sucess);
    }

    @Override
    public void showActionLabel(String message) {
//        cleanErrorHandler.showSnackBar(message);
    }

    @Override
    public void hideActionLabel() {

    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnListFragmentInteractionListener {
        // TODO: Update argument type and name
        void onListFragmentInteraction(Customer item);
    }
}

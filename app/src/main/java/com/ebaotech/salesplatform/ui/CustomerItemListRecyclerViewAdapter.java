package com.ebaotech.salesplatform.ui;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.ebaotech.salesplatform.domain.Customer;

import org.androidannotations.annotations.AfterInject;
import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.EBean;
import org.androidannotations.annotations.RootContext;

import java.util.List;

/**
 * {@link RecyclerView.Adapter} that can display a {@link Customer} and makes a call to the
 * specified {@link OnListFragmentInteractionListener}.
 * TODO: Replace the implementation with code for your data type.
 */
@EBean
public class CustomerItemListRecyclerViewAdapter extends BaseAdapter {

    private List<Customer> customers;

//    @Bean(CustomerFinderImpl.class)
//    CustomerFinder customerFinder;

    @RootContext
    Context context;

//    @AfterInject
//    void initAdapter() {
//        customers = customerFinder.findAll();
//    }

    @Override
    public int getCount() {
        return customers.size();
    }

    @Override
    public Object getItem(int position) {
        return customers.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        CustomerItemCardView customerItemCardView;
        if (convertView == null) {
            customerItemCardView = CustomerItemCardView_.build(context);
        } else {
            customerItemCardView = (CustomerItemCardView) convertView;
        }

        customerItemCardView.bind((Customer)getItem(position));

        return customerItemCardView;
    }


    /*
    private final OnListFragmentInteractionListener mListener;

    public CustomerItemListRecyclerViewAdapter(List<Customer> items, OnListFragmentInteractionListener listener) {
        customers = items;
        mListener = listener;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_customer_list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.mItem = customers.get(position);
        holder.mNameView.setText(customers.get(position).name);
        holder.mAgeView.setText(customers.get(position).age + " ");

        holder.mView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (null != mListener) {
                    // Notify the active callbacks interface (the activity, if the
                    // fragment is attached to one) that an item has been selected.
                    mListener.onListFragmentInteraction(holder.mItem);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return customers.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final View mView;
        public final TextView mNameView;
        public final TextView mAgeView;
        public Customer mItem;

        public ViewHolder(View view) {
            super(view);
            mView = view;
            mNameView = (TextView) view.findViewById(R.id.person_name);
            mAgeView = (TextView) view.findViewById(R.id.person_age);
            //mContentView = (TextView) view.findViewById(R.id.person_age);
        }

        @Override
        public String toString() {
            return super.toString() + " '" + mAgeView.getText() + "'";
        }
    }*/

}

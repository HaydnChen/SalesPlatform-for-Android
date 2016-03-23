package com.ebaotech.salesplatform.ui.quotation;

import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import com.ebaotech.salesplatform.R;
import com.ebaotech.salesplatform.mvp.view.model.quotation.QuotationViewModel;
import com.ebaotech.salesplatform.ui.AbstractActivity;
import com.ebaotech.salesplatform.ui.AbstractFragment;
import com.rey.material.app.DatePickerDialog;
import com.rey.material.app.Dialog;
import com.rey.material.app.DialogFragment;
import com.rey.material.app.ThemeManager;
import com.rey.material.widget.EditText;
import com.rey.material.widget.Spinner;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.ViewById;

import java.text.SimpleDateFormat;

/**
 * Copyright (C) 2016 ebaotech.com. All rights reserved.
 * Author: Zhu Liliang; Date:3/15/16.
 */

// TODO: 3/15/16 4:49 PM  detail fragment UI

@EFragment(R.layout.fragment_quotation_product)
public class QuotationEditProductFragment extends AbstractFragment implements View.OnClickListener {

    @ViewById(R.id.et_label__back_date)
    EditText etBackDate;

    @ViewById(R.id.sp__product)
    Spinner spProduct;

    @ViewById(R.id.sp__plan_option)
    Spinner spPlanOption;


    private QuotationEditActivity mActivity;

    private QuotationViewModel quotationViewModel;

    public static QuotationEditProductFragment newInstance(AbstractActivity abstractActivity) {
        QuotationEditProductFragment fragment = new QuotationEditProductFragment_();
        fragment.setContainerActivity(abstractActivity);
        return fragment;
    }

    @AfterViews
    void initPage() {
        mActivity = (QuotationEditActivity)getActivity();
        initProduct();
    }

    private void initProduct() {
        String[] products = new String[]{"Please select","FL60","ZURICH LINK","E CARE"};
        String[] planOptions = new String[]{"Please select"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(getActivity(), R.layout.row_spn, products);
        adapter.setDropDownViewResource(R.layout.row_spn_dropdown);
        spProduct.setAdapter(adapter);

        ArrayAdapter<String> planAdapter = new ArrayAdapter<>(getActivity(), R.layout.row_spn, planOptions);
        planAdapter.setDropDownViewResource(R.layout.row_spn_dropdown);
        spPlanOption.setEnabled(false);
        spPlanOption.setAdapter(planAdapter);

        etBackDate.setOnClickListener(this);
    }

    public void setQuotationViewModel(QuotationViewModel quotationViewModel) {
        this.quotationViewModel = quotationViewModel;
    }

    @Override
    public void onClick(View v) {
        Dialog.Builder builder = null;

        boolean isLightTheme = ThemeManager.getInstance().getCurrentTheme() == 0;

        switch (v.getId()){
            case R.id.et_label__back_date:
                builder = new DatePickerDialog.Builder(isLightTheme ? R.style.Material_App_Dialog_DatePicker_Light :  R.style.Material_App_Dialog_DatePicker){
                    @Override
                    public void onPositiveActionClicked(DialogFragment fragment) {
                        DatePickerDialog dialog = (DatePickerDialog)fragment.getDialog();
                        String date = dialog.getFormattedDate(SimpleDateFormat.getDateInstance());
                        Toast.makeText(mActivity, "Date is " + date, Toast.LENGTH_SHORT).show();
                        super.onPositiveActionClicked(fragment);
                    }

                    @Override
                    public void onNegativeActionClicked(DialogFragment fragment) {
                        Toast.makeText(mActivity, "Cancelled" , Toast.LENGTH_SHORT).show();
                        super.onNegativeActionClicked(fragment);
                    }
                };

                builder.positiveAction("OK")
                        .negativeAction("CANCEL");
                break;
        }

        DialogFragment fragment = DialogFragment.newInstance(builder);
        fragment.show(getFragmentManager(), null);
    }
}

package com.ebaotech.salesplatform.ui.customer;

import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import com.ebaotech.salesplatform.R;
import com.ebaotech.salesplatform.mvp.view.model.customer.AddressViewModel;
import com.ebaotech.salesplatform.mvp.view.model.customer.CustomerViewModel;
import com.ebaotech.salesplatform.ui.AbstractActivity;
import com.ebaotech.salesplatform.ui.AbstractFragment;
import java.util.ArrayList;
import java.util.List;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.ViewById;

/**
 * Created by haydn.chen on 3/10/2016.
 */
@EFragment(R.layout.fragment_customer_address)
public class CustomerAddressFragment extends AbstractFragment implements CustomerFragment {

  @ViewById(R.id.edit_type)
  Spinner type;

  @ViewById(R.id.edit_detail)
  EditText detail;

  @ViewById(R.id.edit_country)
  Spinner country;

  @ViewById(R.id.edit_city)
  EditText city;

  @ViewById(R.id.edit_postcode)
  EditText postcode;

  @ViewById
  FloatingActionButton fab;

  @ViewById(R.id.tableLayout)
  TableLayout table;

  private int rowNum;

  private CustomerViewModel customerViewModel;

  private List<AddressViewModel> addressViewModelList;

  @AfterViews
  void intPage() {
    addressViewModelList = new ArrayList<>();
    if (customerViewModel.getAddressViewModels()!=null) {
      for (AddressViewModel addressViewModel : customerViewModel.getAddressViewModels()) {
        addAddressRow(addressViewModel);
      }
    }
  }

  public static CustomerAddressFragment newInstance(AbstractActivity abstractActivity) {
    CustomerAddressFragment fragment = new CustomerAddressFragment_();
    fragment.setContainerActivity(abstractActivity);
    return fragment;
  }

  @Click(R.id.fab)
  void onFabClick(View view) {
    if (checkForm(view)) {
      addAddressRow(null);
      clearForm();
    }
  }

  private boolean checkForm(View view) {
    if ("".equals(detail.getText().toString()) || "".equals(city.getText().toString())) {
      Snackbar.make(view, "Please input address and city", Snackbar.LENGTH_LONG)
          .setAction("Action", null)
          .show();
      return  false;
    }
    return true;
  }

  private void clearForm() {
    type.setSelection(0);
    detail.setText("");
    country.setSelection(0);
    city.setText("");
    postcode.setText("");
  }

  private void addAddressRow(AddressViewModel addressViewModel) {
    TableRow tableRow = new TableRow(this.getContext());
    LinearLayout.LayoutParams param = new LinearLayout.LayoutParams(
        TableRow.LayoutParams.WRAP_CONTENT,
        TableRow.LayoutParams.WRAP_CONTENT, 1.0f);
    tableRow.setLayoutParams(param);

    TextView addressType = new TextView(this.getContext());
    TextView addressDetail = new TextView(this.getContext());
    TextView addressCity = new TextView(this.getContext());
    TextView addressCountry = new TextView(this.getContext());
    TextView addressPostcode = new TextView(this.getContext());
    AddressViewModel newAddressViewModel = addressViewModel;
    if (newAddressViewModel == null) {
      newAddressViewModel = new AddressViewModel();
      newAddressViewModel.setType(type.getSelectedItem().toString());
      newAddressViewModel.setAddress(detail.getText().toString());
      newAddressViewModel.setCity(city.getText().toString());
      newAddressViewModel.setCountry(country.getSelectedItem().toString());
      newAddressViewModel.setPostcode(postcode.getText().toString());
    }
    addressType.setText(newAddressViewModel.getType());
    addressDetail.setText(newAddressViewModel.getAddress());
    addressCity.setText(newAddressViewModel.getCity());
    addressCountry.setText(newAddressViewModel.getCountry());
    addressPostcode.setText(newAddressViewModel.getPostcode());

    ImageButton button = new ImageButton(this.getContext());
    button.setBackgroundResource(R.drawable.delete);

    button.setOnClickListener(new View.OnClickListener() {
      @Override public void onClick(View view) {
        TableRow tableRow = (TableRow) view.getParent();
        int index = table.indexOfChild(tableRow) - 1;
        table.removeView(tableRow);
        addressViewModelList.remove(index);
        rowNum--;
      }
    });

    if (rowNum % 2 == 0) {
      tableRow.setBackgroundColor(getResources().getColor(R.color.divider));
    } else {
      tableRow.setBackgroundColor(getResources().getColor(R.color.icons));
    }
    tableRow.addView(addressType);
    tableRow.addView(addressDetail);
    tableRow.addView(addressCity);
    tableRow.addView(addressCountry);
    tableRow.addView(addressPostcode);
    tableRow.addView(button);
    table.addView(tableRow);
    rowNum ++;
    addressViewModelList.add(newAddressViewModel);
  }

  @Override
  public void setCustomerViewModel(CustomerViewModel customerViewModel) {
    this.customerViewModel = customerViewModel;
  }

  @Override public boolean save() {
    if (addressViewModelList != null) {
      customerViewModel.setAddressViewModels(addressViewModelList);
    }
    return true;
  }
}

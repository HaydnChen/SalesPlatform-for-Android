package com.ebaotech.salesplatform.ui.customer;

import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import com.ebaotech.salesplatform.R;
import com.ebaotech.salesplatform.mvp.view.model.customer.CustomerViewModel;
import com.ebaotech.salesplatform.ui.AbstractActivity;
import com.ebaotech.salesplatform.ui.AbstractFragment;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.ViewById;

/**
 * Created by haydn.chen on 3/10/2016.
 */
@EFragment(R.layout.fragment_customer_basic)
public class CustomerBasicFragment extends AbstractFragment {

  @ViewById(R.id.edit_name)
  EditText name;

  @ViewById(R.id.edit_age)
  EditText age;

  @ViewById(R.id.radioSex)
  RadioGroup gender;

  @ViewById(R.id.edit_country)
  Spinner country;

  @ViewById(R.id.edit_comments)
  EditText comments;

  @ViewById(R.id.edit_id_number)
  EditText idNumber;

  @ViewById(R.id.edit_marital_status)
  Spinner maritalStatus;

  @ViewById(R.id.edit_mobile)
  EditText mobile;

  @ViewById(R.id.edit_email)
  EditText email;

  private CustomerViewModel customerViewModel;

  @AfterViews
  void initPage() {
    if (customerViewModel!=null) {
      name.setText(customerViewModel.getName());
      age.setText(customerViewModel.getAge()+"");
      country.setSelection(
          ((ArrayAdapter<String>) country.getAdapter()).getPosition(customerViewModel.getCountry()));
      ((RadioButton) gender.getChildAt("female".equalsIgnoreCase(customerViewModel.getGender())?1:0)).setChecked(
          true);
      comments.setText(customerViewModel.getDetails());
      idNumber.setText(customerViewModel.getIdNumber());
      maritalStatus.setSelection(((ArrayAdapter<String>) maritalStatus.getAdapter()).getPosition(
          customerViewModel.getMaritalStatus()));
      mobile.setText(customerViewModel.getMobile());
      email.setText(customerViewModel.getEmail());
    }
  }


  public static CustomerBasicFragment newInstance(AbstractActivity abstractActivity) {
    CustomerBasicFragment fragment = new CustomerBasicFragment_();
    fragment.setContainerActivity(abstractActivity);
    return fragment;
  };

  public void setCustomerViewModel(CustomerViewModel customerViewModel) {
    this.customerViewModel = customerViewModel;
  }
}

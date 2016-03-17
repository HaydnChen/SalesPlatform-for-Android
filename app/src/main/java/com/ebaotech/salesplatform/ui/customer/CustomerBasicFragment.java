package com.ebaotech.salesplatform.ui.customer;

import android.support.design.widget.Snackbar;
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
import org.apache.commons.lang3.StringUtils;

/**
 * Created by haydn.chen on 3/10/2016.
 */
@EFragment(R.layout.fragment_customer_basic)
public class CustomerBasicFragment extends AbstractFragment implements CustomerFragment {

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
    name.setText(customerViewModel.getName());
    age.setText(customerViewModel.getAge()==null?"":customerViewModel.getAge().toString());
    country.setSelection(((ArrayAdapter<String>) country.getAdapter()).getPosition(customerViewModel.getCountry()));
    ((RadioButton) gender.getChildAt("female".equalsIgnoreCase(customerViewModel.getGender())?1:0)).setChecked(
        true);
    comments.setText(customerViewModel.getDetails());
    idNumber.setText(customerViewModel.getIdNumber());
    maritalStatus.setSelection(((ArrayAdapter<String>) maritalStatus.getAdapter()).getPosition(
        customerViewModel.getMaritalStatus()));
    mobile.setText(customerViewModel.getMobile());
    email.setText(customerViewModel.getEmail());
  }


  public static CustomerBasicFragment newInstance(AbstractActivity abstractActivity) {
    CustomerBasicFragment fragment = new CustomerBasicFragment_();
    fragment.setContainerActivity(abstractActivity);
    return fragment;
  };

  @Override
  public void setCustomerViewModel(CustomerViewModel customerViewModel) {
    this.customerViewModel = customerViewModel;
  }

  public boolean save() {
    if(StringUtils.isNotBlank(name.getText().toString()) && StringUtils.isNotBlank(age.getText().toString())) {
      customerViewModel.setName(name.getText().toString());
      customerViewModel.setAge(Integer.valueOf(age.getText().toString()));
      customerViewModel.setGender(
          ((RadioButton) gender.findViewById(gender.getCheckedRadioButtonId())).getText()
              .toString());
      customerViewModel.setCountry(country.getSelectedItem().toString());
      customerViewModel.setDetails(comments.getText().toString());
      customerViewModel.setIdNumber(idNumber.getText().toString());
      customerViewModel.setMaritalStatus(maritalStatus.getSelectedItem().toString());
      customerViewModel.setMobile(mobile.getText().toString());
      customerViewModel.setEmail(email.getText().toString());
      return  true;
    } else {
      Snackbar.make(this.getView(), "Please input name and gender", Snackbar.LENGTH_LONG)
          .setAction("Action", null)
          .show();
      return  false;
    }
  }
}

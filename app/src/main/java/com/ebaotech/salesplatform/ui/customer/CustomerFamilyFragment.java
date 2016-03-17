package com.ebaotech.salesplatform.ui.customer;

import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import com.ebaotech.salesplatform.R;
import com.ebaotech.salesplatform.mvp.view.model.customer.CustomerViewModel;
import com.ebaotech.salesplatform.mvp.view.model.customer.FamilyViewModel;
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
@EFragment(R.layout.fragment_customer_family)
public class CustomerFamilyFragment extends AbstractFragment implements CustomerFragment {

  @ViewById(R.id.edit_relation)
  Spinner relation;

  @ViewById(R.id.edit_name)
  EditText name;

  @ViewById(R.id.radioSex)
  RadioGroup gender;

  @ViewById(R.id.edit_age)
  EditText age;

  @ViewById(R.id.edit_mobile)
  EditText mobile;

  @ViewById(R.id.edit_email)
  EditText email;

  @ViewById FloatingActionButton fab;

  @ViewById(R.id.tableLayout) TableLayout table;

  private int rowNum;

  private CustomerViewModel customerViewModel;

  private List<FamilyViewModel> currentFamilyViewModelList;

  @AfterViews
  void intPage() {
    rowNum = 0;
    if (currentFamilyViewModelList != null) {
      // reload page
      for (FamilyViewModel familyViewModel : currentFamilyViewModelList) {
        addFamilyRow(familyViewModel, true);
      }
    } else if (customerViewModel.getFamilyViewModels()!=null) {
      currentFamilyViewModelList = new ArrayList<FamilyViewModel>();
      for (FamilyViewModel familyViewModel : customerViewModel.getFamilyViewModels()) {
        addFamilyRow(familyViewModel, false);
      }
    } else {
      currentFamilyViewModelList = new ArrayList<FamilyViewModel>();
    }
  }

  public static CustomerFamilyFragment newInstance(AbstractActivity abstractActivity) {
    CustomerFamilyFragment fragment = new CustomerFamilyFragment_();
    fragment.setContainerActivity(abstractActivity);
    return fragment;
  }

  @Click(R.id.fab)
  void onFabClick(View view) {
    if (checkForm(view)) {
      addFamilyRow(null, false);
      clearForm();
    }
  }

  private boolean checkForm(View view) {
    if ("".equals(name.getText().toString()) || "".equals(age.getText().toString())) {
      Snackbar.make(view, "Please input name and gender", Snackbar.LENGTH_LONG)
          .setAction("Action", null)
          .show();
      return  false;
    }
    return true;
  }

  private void clearForm() {
    relation.setSelection(0);
    name.setText("");
    age.setText("");
    gender.check(gender.getChildAt(0).getId());
    mobile.setText("");
    email.setText("");
  }

  private void addFamilyRow(FamilyViewModel familyViewModel, boolean isReloadPage) {
    TableRow tableRow = new TableRow(this.getContext());
    LinearLayout.LayoutParams param = new LinearLayout.LayoutParams(
        TableRow.LayoutParams.WRAP_CONTENT,
        TableRow.LayoutParams.WRAP_CONTENT, 1.0f);
    tableRow.setLayoutParams(param);

    TextView familyRelation = new TextView(this.getContext());
    TextView familyName = new TextView(this.getContext());
    TextView familyAge = new TextView(this.getContext());
    TextView familyGender = new TextView(this.getContext());
    TextView familyMobile = new TextView(this.getContext());
    TextView familyEmail = new TextView(this.getContext());
    FamilyViewModel newFamilyViewModel = familyViewModel;
    if (familyViewModel == null) {
      newFamilyViewModel = new FamilyViewModel();
      newFamilyViewModel.setRelationToPh(relation.getSelectedItem().toString());
      newFamilyViewModel.setName(name.getText().toString());
      newFamilyViewModel.setAge(Integer.valueOf(age.getText().toString()));
      newFamilyViewModel.setGender(
          ((RadioButton) gender.findViewById(gender.getCheckedRadioButtonId())).getText()
              .toString());
      newFamilyViewModel.setMobile(mobile.getText().toString());
      newFamilyViewModel.setEmail(email.getText().toString());
    }
    familyRelation.setText(newFamilyViewModel.getRelationToPh());
    familyName.setText(newFamilyViewModel.getName());
    familyAge.setText(newFamilyViewModel.getAge()+"");
    familyGender.setText(newFamilyViewModel.getGender());
    familyMobile.setText(newFamilyViewModel.getMobile());
    familyEmail.setText(newFamilyViewModel.getEmail());

    ImageButton button = new ImageButton(this.getContext());
    button.setBackgroundResource(R.drawable.delete);

    button.setOnClickListener(new View.OnClickListener() {
      @Override public void onClick(View view) {
        TableRow tableRow = (TableRow) view.getParent();
        int index = table.indexOfChild(tableRow) - 1;
        table.removeView(tableRow);
        currentFamilyViewModelList.remove(index);
        rowNum--;
      }
    });

    if (rowNum % 2 == 0) {
      tableRow.setBackgroundColor(getResources().getColor(R.color.divider));
    } else {
      tableRow.setBackgroundColor(getResources().getColor(R.color.icons));
    }
    tableRow.addView(familyRelation);
    tableRow.addView(familyName);
    tableRow.addView(familyAge);
    tableRow.addView(familyGender);
    tableRow.addView(familyMobile);
    tableRow.addView(familyEmail);
    tableRow.addView(button);
    table.addView(tableRow);
    rowNum ++;
    if (!isReloadPage) {
      currentFamilyViewModelList.add(newFamilyViewModel);
    }
  }

  @Override
  public void setCustomerViewModel(CustomerViewModel customerViewModel) {
    this.customerViewModel = customerViewModel;
  }

  @Override public boolean save() {
    if (currentFamilyViewModelList != null) {
      customerViewModel.setFamilyViewModels(currentFamilyViewModelList);
    }
    return true;
  }
}

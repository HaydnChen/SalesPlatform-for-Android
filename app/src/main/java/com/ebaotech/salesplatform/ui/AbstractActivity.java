package com.ebaotech.salesplatform.ui;

import com.ebaotech.salesplatform.app.CleanActivity;
import com.ebaotech.salesplatform.core.mvp.View;
import org.androidannotations.annotations.EActivity;

/**
 * Created by haydn.chen on 3/8/2016.
 */
@EActivity
public class AbstractActivity extends CleanActivity implements View {
  @Override
  public void showLoading(String message) {
    progress.showLoading(this, message);
  }

  @Override
  public void hideLoading(boolean sucess) {
    progress.endLoading(sucess);
  }

  @Override
  public void showActionLabel(String message) {
    cleanErrorHandler.showSnackBar(message);
  }

  @Override
  public void hideActionLabel() {

  }
}

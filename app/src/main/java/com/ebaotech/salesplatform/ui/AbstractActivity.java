package com.ebaotech.salesplatform.ui;

import com.ebaotech.salesplatform.app.CleanActivity;
import com.ebaotech.salesplatform.core.mvp.View;
import org.androidannotations.annotations.EActivity;

/**
 * Created by haydn.chen on 3/8/2016.
 */
@EActivity
public abstract class AbstractActivity<T> extends CleanActivity implements View<T> {
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

  @Override public void onViewModelLoaded(T viewModel) {
    // please overwrite in sub class if required
  }

  @Override public void onViewModelSaved(T viewModel) {
    // please overwrite in sub class if required
  }

  @Override public void onViewModelDeleted() {
    // please overwrite in sub class if required
  }
}

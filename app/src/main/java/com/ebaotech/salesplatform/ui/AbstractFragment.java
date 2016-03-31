package com.ebaotech.salesplatform.ui;

import android.support.v4.app.Fragment;
import com.ebaotech.salesplatform.core.mvp.View;
import org.androidannotations.annotations.EFragment;

/**
 * Created by haydn.chen on 3/8/2016.
 */
@EFragment
public class AbstractFragment<T> extends Fragment implements View<T> {

  protected AbstractActivity containerActivity;

  public AbstractActivity getContainerActivity() {
    return containerActivity;
  }

  public void setContainerActivity(AbstractActivity containerActivity) {
    this.containerActivity = containerActivity;
  }

  @Override public void showLoading(String message) {
    if (containerActivity !=null) {
      this.containerActivity.showLoading(message);
    }
  }

  @Override public void hideLoading(boolean sucess) {
    if (containerActivity !=null) {
      this.containerActivity.hideLoading(sucess);
    }
  }

  @Override public void showActionLabel(String message) {
    if (containerActivity !=null) {
      this.containerActivity.showActionLabel(message);
    }
  }

  @Override public void hideActionLabel() {
    if (containerActivity !=null) {
      this.containerActivity.hideActionLabel();
    }
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

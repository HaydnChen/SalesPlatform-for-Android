package com.ebaotech.salesplatform.core.mvp;

public interface View<T> {
    void showLoading(String message);
    void hideLoading(boolean success);
    void showActionLabel(String message);
    void hideActionLabel();
    void onViewModelLoaded(T viewModel);
    void onViewModelSaved(T viewModel);
    void onViewModelDeleted();
}

package com.ebaotech.salesplatform.core.mvp;

public interface Presenter<V, S> {

    public void setView(View view);
    public void load(S searchModel);
    public void save(V viewModel);
    public void delete(S searchModel);
    public void onError(Exception exception);
}

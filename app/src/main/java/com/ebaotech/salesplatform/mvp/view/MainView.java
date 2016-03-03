package com.ebaotech.salesplatform.mvp.view;

import com.ebaotech.salesplatform.core.mvp.View;
import com.ebaotech.salesplatform.mvp.view.model.MainListViewModel;

import java.util.List;

/**
 * Created by radicsrichard on 15. 05. 13..
 */
public interface MainView extends View {

    void setListViewModels(List<MainListViewModel> mainListViewModelList);

}

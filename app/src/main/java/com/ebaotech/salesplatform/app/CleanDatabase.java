package com.ebaotech.salesplatform.app;

import com.ebaotech.salesplatform.core.database.SnappyDatabase;

import org.androidannotations.annotations.EBean;

/**
 * Created by radicsrichard on 15. 05. 13..
 */
@EBean(scope = EBean.Scope.Singleton)
public class CleanDatabase extends SnappyDatabase {

    public static final class Keys {
        private static final String MAIN_LIST_CACHE = "MAINLISTCACHE";
    }
//
//    public void cacheMainListViewModelList(List<MainListViewModel> mainListViewModels) {
//        setValue(Keys.MAIN_LIST_CACHE, mainListViewModels);
//    }
//
//    public List<MainListViewModel> getCachedMainListModelList() {
//        return getObjectList(Keys.MAIN_LIST_CACHE, MainListViewModel.class);
//    }

}

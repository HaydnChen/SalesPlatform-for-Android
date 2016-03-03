package com.ebaotech.salesplatform.interactor;

import com.ebaotech.salesplatform.domain.City;
import com.ebaotech.salesplatform.exception.GetCitiesException;

import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.EBean;
import org.androidannotations.annotations.UiThread;

import java.util.List;

import hugo.weaving.DebugLog;

/*
 *  Copyright (c) 2016.  ebaotech.com. All rights reserved.
 *  Author: Zhu Liliang; Date:3/2/16 10:28 PM
 */

@EBean
public class GetCitiesImpl extends BaseInteractor implements GetCities {

    private Callback callback;

    @Override
    @Background
    @DebugLog
    public void getCities(Double latitude, Double longitude, Integer count, Callback callback) {
        this.callback = callback;
        try {
            List<City> cityList = cleanRepository.getCities(latitude, longitude, count);
            onItemsLoaded(cityList);
        } catch (GetCitiesException getCitiesException) {
            onError(getCitiesException);
        }
    }

    @UiThread
    @DebugLog
    public void onItemsLoaded(List<City> cityList) {
        callback.onCitiesLoaded(cityList);
    }

    @UiThread
    public void onError(Exception e) {
        callback.onError(e);
    }

}

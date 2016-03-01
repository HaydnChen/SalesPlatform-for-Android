package com.ebaotech.salesplatform.interactor;

import com.ebaotech.salesplatform.domain.City;
import com.ebaotech.salesplatform.exception.GetCitiesException;

import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.EBean;
import org.androidannotations.annotations.UiThread;

import java.util.List;

import hugo.weaving.DebugLog;

/**
 * Created by radicsrichard on 15. 05. 13..
 */
@EBean
public class GetCitiesImp extends BaseInteractor implements GetCities {

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
        callback.onCitiesoaded(cityList);
    }

    @UiThread
    public void onError(Exception e) {
        callback.onError(e);
    }

}

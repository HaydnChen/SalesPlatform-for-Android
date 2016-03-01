package com.ebaotech.salesplatform.interactor;

import com.ebaotech.salesplatform.domain.City;

import java.util.List;

/**
 * Created by radicsrichard on 15. 05. 13..
 */
public interface GetCities {

    void getCities(Double latitude, Double longitude, Integer count, Callback callback);

    interface Callback {
        void onCitiesoaded(List<City> cityList);
        void onError(Exception e);
    }

}

package com.ebaotech.salesplatform.repository.api;

import com.ebaotech.salesplatform.app.CleanErrorHandler;
import com.ebaotech.salesplatform.repository.api.model.openweatherwrapper.OpenWeatherWrapper;
import com.ebaotech.salesplatform.domain.City;
import com.ebaotech.salesplatform.repository.api.mapper.WeatherResponseMapper;
import com.ebaotech.salesplatform.repository.api.model.openweatherwrapper.WeatherItem;

import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.EBean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by radicsrichard on 15. 05. 14..
 */
@EBean(scope = EBean.Scope.Singleton)
public class OpenWeatherResponseMapper implements WeatherResponseMapper<OpenWeatherWrapper> {

    @Bean
    CleanErrorHandler cleanErrorHandler;

    @Override
    public List<City> mapResponse(OpenWeatherWrapper response) {
        List<City> cityList = new ArrayList<>();

        for (WeatherItem weatherItem : response.getList()) {
            try {
                City w = new City();
                w.setId(weatherItem.getId());
                w.setName(weatherItem.getName());
                w.setCountry(weatherItem.getSys().getCountry());

                cityList.add(w);
            } catch (Exception e) {
                cleanErrorHandler.logExpception(e);
            }
        }

        return cityList;
    }

}

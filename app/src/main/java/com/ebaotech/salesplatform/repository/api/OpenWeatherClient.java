package com.ebaotech.salesplatform.repository.api;

import android.util.Log;

import com.ebaotech.salesplatform.repository.CleanRepository;
import com.ebaotech.salesplatform.repository.api.model.openweatherwrapper.OpenWeatherWrapper;
import com.ebaotech.salesplatform.domain.City;
import com.ebaotech.salesplatform.exception.GetCitiesException;
import com.ebaotech.salesplatform.core.retrofit.BaseRetrofitClient;

import org.androidannotations.annotations.AfterInject;
import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.EBean;

import java.util.List;

import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

/**
 * Created by radicsrichard on 15. 05. 13..
 */
@EBean(scope = EBean.Scope.Singleton)
public class OpenWeatherClient extends BaseRetrofitClient implements CleanRepository {

    private static final String TAG = "WeatherClient";
    public static String ENDPOINT = "http://api.openweathermap.org";

    @Bean
    OpenWeatherResponseMapper openWeatherResponseMapper;

    private static OpenWeatherAPI openWeatherAPI;

    @AfterInject
    void onAfterInjectFinished() {
        openWeatherAPI = initRestAdapter(ENDPOINT, OpenWeatherAPI.class);
    }


    public void getCitiesAsync(final Double latitude, final Double longitude, final Integer count) {
        openWeatherAPI.getWeatherItems(latitude, longitude, count, new Callback<OpenWeatherWrapper>() {
            @Override
            public void success(OpenWeatherWrapper openWeatherWrapper, Response response) {

            }

            @Override
            public void failure(RetrofitError error) {
                networkErrorHandler.handlerError(error);
            }
        });
    }

    public List<City> getCities(Double latitude, Double longitude, Integer count) {
        try {
            OpenWeatherWrapper openWeatherWrapper = openWeatherAPI.getWeatherItems(latitude, longitude, count);
            return openWeatherResponseMapper.mapResponse(openWeatherWrapper);
        } catch (Exception exception) {
            return throwGetCitiesException(exception);
        }
    }

    private List<City> throwGetCitiesException(Exception retrofitError) {
        Log.e(TAG, "Error during fetching cities");
        GetCitiesException getCitiesException = new GetCitiesException();
        getCitiesException.setStackTrace(retrofitError.getStackTrace());
        throw getCitiesException;
    }

}

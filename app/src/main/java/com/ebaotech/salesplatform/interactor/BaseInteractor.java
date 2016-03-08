package com.ebaotech.salesplatform.interactor;

import com.ebaotech.salesplatform.app.CleanDatabase;
import com.ebaotech.salesplatform.repository.CleanRepository;

import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.EBean;

/**
 * Created by radicsrichard on 15. 05. 13..
 */
@EBean
public class BaseInteractor {

    @Bean
    protected CleanDatabase cleanDatabase;

    // @Bean(OpenWeatherClient.class)
    protected CleanRepository cleanRepository;
}

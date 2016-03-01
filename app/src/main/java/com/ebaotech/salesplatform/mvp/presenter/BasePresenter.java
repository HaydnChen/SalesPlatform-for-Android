package com.ebaotech.salesplatform.mvp.presenter;

import com.ebaotech.salesplatform.app.CleanErrorHandler;

import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.EBean;

/**
 * Created by radicsrichard on 15. 05. 13..
 */
@EBean
public class BasePresenter {
    @Bean
    protected CleanErrorHandler cleanErrorHandler;
}

package com.ebaotech.salesplatform.core.app;

import android.app.Application;

import com.ebaotech.salesplatform.core.error.NetworkErrorHandler;
import com.ebaotech.salesplatform.core.error.SnappyErrorHandler;

import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.EApplication;

/**
 * Created by radicsrichard on 15. 04. 28..
 */
@EApplication
public class BaseApplication extends Application {

    @Bean
    protected NetworkErrorHandler networkErrorHandler;

    @Bean
    protected SnappyErrorHandler snappyErrorHandler;

}

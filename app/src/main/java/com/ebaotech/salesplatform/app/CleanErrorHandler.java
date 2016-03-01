package com.ebaotech.salesplatform.app;

import com.ebaotech.salesplatform.BuildConfig;
import com.ebaotech.salesplatform.core.error.ErrorHandler;

import org.androidannotations.annotations.EBean;

/**
 * Created by radicsrichard on 15. 05. 13..
 */
@EBean(scope = EBean.Scope.Singleton)
public class CleanErrorHandler extends ErrorHandler {

    public void logExpception(Exception e) {
        if (BuildConfig.DEBUG) {
            logError(e);
        }
    }

    public void showSnackBar(String message) {
        showError(message);
    }

}

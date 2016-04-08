package com.ebaotech.salesplatform.rest.exception;

import org.androidannotations.annotations.EBean;
import org.androidannotations.rest.spring.api.RestErrorHandler;
import org.springframework.core.NestedRuntimeException;

/**
 * Created by haydn.chen on 4/7/2016.
 */
@EBean
public class SyncErrorHandler implements RestErrorHandler {

  @Override
  public void onRestClientExceptionThrown(NestedRuntimeException e) {
    // To do handel sync client runtime exception
  }
}

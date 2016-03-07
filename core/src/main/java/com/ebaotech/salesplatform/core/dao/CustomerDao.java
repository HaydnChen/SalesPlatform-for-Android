package com.ebaotech.salesplatform.core.dao;

import android.content.Context;
import com.ebaotech.salesplatform.core.bo.CustomerBo;
import com.ebaotech.salesplatform.core.error.ErrorHandler;
import com.ebaotech.salesplatform.core.error.SQLErrorHandler;
import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.EBean;
import org.androidannotations.annotations.RootContext;

/**
 * Created by haydn.chen on 3/3/2016.
 */
@EBean
public class CustomerDao extends AbstractDao<CustomerBo,Integer> {

}

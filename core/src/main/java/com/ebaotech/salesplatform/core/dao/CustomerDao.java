package com.ebaotech.salesplatform.core.dao;

import android.content.Context;
import com.ebaotech.salesplatform.core.bo.AddressBo;
import com.ebaotech.salesplatform.core.bo.CustomerBo;
import com.ebaotech.salesplatform.core.error.ErrorHandler;
import com.ebaotech.salesplatform.core.error.SQLErrorHandler;
import com.j256.ormlite.stmt.QueryBuilder;
import com.j256.ormlite.stmt.Where;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.EBean;
import org.androidannotations.annotations.RootContext;
import org.apache.commons.lang3.StringUtils;

/**
 * Created by haydn.chen on 3/3/2016.
 */
@EBean
public class CustomerDao extends AbstractDao<CustomerBo,Integer> {

  public List<CustomerBo> queryByCriteria(String name, String gender, Integer ageFrom, Integer ageTo, String idNumber) {
    List<CustomerBo> customerBoList = new ArrayList<CustomerBo>();
    try {
      QueryBuilder<CustomerBo, Integer> queryBuilder = queryBuilder();
      Where<CustomerBo, Integer> where = queryBuilder.where();
      where.isNotNull("name");
      if (StringUtils.isNotBlank(name)) {
        where.and().like("name","%"+name+"%");
      }
      if (StringUtils.isNotBlank(gender)) {
        where.and().eq("gender",gender);
      }
      if (ageFrom != null) {
        where.and().ge("age",ageFrom);
      }
      if (ageTo != null) {
        where.and().le("age",ageTo);
      }
      if (StringUtils.isNotBlank(idNumber)) {
        where.and().like("idNumber","%"+idNumber+"%");
      }
      customerBoList = queryBuilder.query();
    } catch (SQLException e) {
      errorHandler.handlerError(e);
    }
    return customerBoList;
  }
}

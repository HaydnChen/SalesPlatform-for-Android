package com.ebaotech.salesplatform.core.error;
import java.sql.SQLException;
import org.androidannotations.annotations.EBean;

/**
 * Created by haydn.chen on 3/4/2016.
 */
@EBean(scope = EBean.Scope.Singleton)
public class SQLErrorHandler extends ErrorHandler {

  @Override
  public void handlerError(Exception e) {
    super.handlerError(e);
    if (e instanceof SQLException) {
      String s = "Database error!";
      showError(s);
    }
  }
}

package com.ebaotech.salesplatform.core.database;

import android.content.Context;
import com.ebaotech.salesplatform.core.bo.AddressBo;
import com.ebaotech.salesplatform.core.bo.CustomerBo;
import com.ebaotech.salesplatform.core.bo.FamilyMemberBo;
import com.ebaotech.salesplatform.core.error.SQLErrorHandler;
import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import net.sqlcipher.database.SQLiteDatabase;
import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.EBean;
import org.androidannotations.annotations.RootContext;

/**
 * Created by haydn.chen on 3/3/2016.
 */
@EBean(scope = EBean.Scope.Singleton)
public class SQLiteOrmWithCipherHelper extends OrmLiteSqliteOpenHelper {
  private static final String DATABASE_NAME = "sp.db";
  public static final String DATABASE_PASSWORD = "changeIT";
  private static final int DATABASE_VERSION = 4;

  private Map<String, Dao> daos = new HashMap<String, Dao>();

  @RootContext
  protected Context context;

  @Bean
  protected SQLErrorHandler errorHandler;

  public SQLiteOrmWithCipherHelper(Context context) {
    // todo you need to obtain password in better way
    super(context.getApplicationContext(), DATABASE_NAME, null, DATABASE_VERSION, DATABASE_PASSWORD);
    SQLiteDatabase.loadLibs(context.getApplicationContext());
    this.getWritableDatabase(DATABASE_PASSWORD);
  }

  @Override
  public void onCreate(SQLiteDatabase database,
      ConnectionSource connectionSource)
  {
    try
    {
      TableUtils.createTable(connectionSource, CustomerBo.class);
      TableUtils.createTable(connectionSource, AddressBo.class);
      TableUtils.createTable(connectionSource, FamilyMemberBo.class);
    } catch (SQLException e)
    {
      errorHandler.handlerError(e);
    }
  }

  @Override
  public void onUpgrade(SQLiteDatabase database,
      ConnectionSource connectionSource, int oldVersion, int newVersion)
  {
    try
    {
      TableUtils.dropTable(connectionSource, CustomerBo.class, true);
      TableUtils.dropTable(connectionSource, AddressBo.class, true);
      TableUtils.dropTable(connectionSource, FamilyMemberBo.class, true);
      onCreate(database, connectionSource);
    } catch (SQLException e)
    {
      errorHandler.handlerError(e);
    }
  }

  public synchronized Dao getDao(Class clazz)
  {
    Dao dao = null;
    String className = clazz.getSimpleName();

    if (daos.containsKey(className))
    {
      dao = daos.get(className);
    }
    if (dao == null)
    {
      try {
        dao = super.getDao(clazz);
        daos.put(className, dao);
      } catch (SQLException e) {
        errorHandler.handlerError(e);
      }
    }
    return dao;
  }

  @Override
  public void close()
  {
    super.close();

    for (String key : daos.keySet())
    {
      Dao dao = daos.get(key);
      dao = null;
    }
  }

}

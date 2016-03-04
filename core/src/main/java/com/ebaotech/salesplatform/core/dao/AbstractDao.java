package com.ebaotech.salesplatform.core.dao;

import android.content.Context;
import com.ebaotech.salesplatform.core.database.SQLiteOrmWithCipherHelper;
import com.ebaotech.salesplatform.core.error.ErrorHandler;
import com.ebaotech.salesplatform.core.error.SQLErrorHandler;
import com.j256.ormlite.dao.CloseableIterator;
import com.j256.ormlite.dao.CloseableWrappedIterable;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.ForeignCollection;
import com.j256.ormlite.dao.GenericRawResults;
import com.j256.ormlite.dao.ObjectCache;
import com.j256.ormlite.dao.RawRowMapper;
import com.j256.ormlite.field.DataType;
import com.j256.ormlite.field.FieldType;
import com.j256.ormlite.stmt.DeleteBuilder;
import com.j256.ormlite.stmt.GenericRowMapper;
import com.j256.ormlite.stmt.PreparedDelete;
import com.j256.ormlite.stmt.PreparedQuery;
import com.j256.ormlite.stmt.PreparedUpdate;
import com.j256.ormlite.stmt.QueryBuilder;
import com.j256.ormlite.stmt.UpdateBuilder;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.support.DatabaseConnection;
import com.j256.ormlite.support.DatabaseResults;
import com.j256.ormlite.table.ObjectFactory;
import java.lang.reflect.ParameterizedType;
import java.sql.SQLException;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import org.androidannotations.annotations.AfterInject;
import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.EBean;
import org.androidannotations.annotations.RootContext;

/**
 * Created by haydn.chen on 3/3/2016.
 */
@EBean
public abstract class AbstractDao<T,ID> implements Dao<T,ID> {
  private Dao<T,ID> daoOpe;
  @Bean
  protected SQLiteOrmWithCipherHelper helper;

  @RootContext
  protected Context context;

  @Bean
  protected SQLErrorHandler errorHandler;

  @AfterInject
  protected void init() {
    //remove .getSuperclass() if dao is not @EBean
    Class<T> tClass = (Class<T>)(((ParameterizedType)getClass().getSuperclass().getGenericSuperclass()).getActualTypeArguments()[0]);
    daoOpe = helper.getDao(tClass);
  }

  @Override public T queryForId(ID id){
    try {
      return daoOpe.queryForId(id);
    } catch (SQLException e) {
      errorHandler.handlerError(e);
    }
    return null;
  }

  @Override public T queryForFirst(PreparedQuery<T> preparedQuery) {
    try {
      return daoOpe.queryForFirst(preparedQuery);
    } catch (SQLException e) {
      errorHandler.handlerError(e);
    }
    return null;
  }

  @Override public List<T> queryForAll() {
    try {
      return daoOpe.queryForAll();
    } catch (SQLException e) {
      errorHandler.handlerError(e);
    }
    return null;
  }

  @Override public List<T> queryForEq(String s, Object o) {
    try {
      return daoOpe.queryForEq(s,o);
    } catch (SQLException e) {
      errorHandler.handlerError(e);
    }
    return null;
  }

  @Override public List<T> queryForMatching(T t) {
    try {
      return daoOpe.queryForMatching(t);
    } catch (SQLException e) {
      errorHandler.handlerError(e);
    }
    return null;
  }

  @Override public List<T> queryForMatchingArgs(T t) {
    try {
      return daoOpe.queryForMatchingArgs(t);
    } catch (SQLException e) {
      errorHandler.handlerError(e);
    }
    return null;
  }

  @Override public List<T> queryForFieldValues(Map<String, Object> map) {
    try {
      return daoOpe.queryForFieldValues(map);
    } catch (SQLException e) {
      errorHandler.handlerError(e);
    }
    return null;
  }

  @Override public List<T> queryForFieldValuesArgs(Map<String, Object> map) {
    try {
      return daoOpe.queryForFieldValuesArgs(map);
    } catch (SQLException e) {
      errorHandler.handlerError(e);
    }
    return null;
  }

  @Override public T queryForSameId(T t) {
    try {
      return daoOpe.queryForSameId(t);
    } catch (SQLException e) {
      errorHandler.handlerError(e);
    }
    return null;
  }

  @Override public QueryBuilder<T, ID> queryBuilder() {
    return daoOpe.queryBuilder();
  }

  @Override public UpdateBuilder<T, ID> updateBuilder() {
    return daoOpe.updateBuilder();
  }

  @Override public DeleteBuilder<T, ID> deleteBuilder() {
    return daoOpe.deleteBuilder();
  }

  @Override public List<T> query(PreparedQuery<T> preparedQuery) {
    try {
      return daoOpe.query(preparedQuery);
    } catch (SQLException e) {
      errorHandler.handlerError(e);
    }
    return null;
  }

  @Override public int create(T t) {
    try {
      return daoOpe.create(t);
    } catch (SQLException e) {
      errorHandler.handlerError(e);
    }
    return -1;
  }

  @Override public T createIfNotExists(T t) {
    try {
      return daoOpe.createIfNotExists(t);
    } catch (SQLException e) {
      errorHandler.handlerError(e);
    }
    return null;
  }

  @Override public CreateOrUpdateStatus createOrUpdate(T t) {
    try {
      return daoOpe.createOrUpdate(t);
    } catch (SQLException e) {
      errorHandler.handlerError(e);
    }
    return null;
  }

  @Override public int update(T t) {
    try {
      return daoOpe.update(t);
    } catch (SQLException e) {
      errorHandler.handlerError(e);
    }
    return -1;
  }

  @Override public int updateId(T t, ID id) {
    try {
      return daoOpe.updateId(t,id);
    } catch (SQLException e) {
      errorHandler.handlerError(e);
    }
    return -1;
  }

  @Override public int update(PreparedUpdate<T> preparedUpdate) {
    try {
      return daoOpe.update(preparedUpdate);
    } catch (SQLException e) {
      errorHandler.handlerError(e);
    }
    return -1;
  }

  @Override public int refresh(T t) {
    try {
      return daoOpe.refresh(t);
    } catch (SQLException e) {
      errorHandler.handlerError(e);
    }
    return -1;
  }

  @Override public int delete(T t) {
    try {
      return daoOpe.delete(t);
    } catch (SQLException e) {
      errorHandler.handlerError(e);
    }
    return  -1;
  }

  @Override public int deleteById(ID id) {
    try {
      return daoOpe.deleteById(id);
    } catch (SQLException e) {
      errorHandler.handlerError(e);
    }
    return -1;
  }

  @Override public int delete(Collection<T> collection) {
    try {
      return daoOpe.delete(collection);
    } catch (SQLException e) {
      errorHandler.handlerError(e);
    }
    return -1;
  }

  @Override public int deleteIds(Collection<ID> collection) {
    try {
      return daoOpe.deleteIds(collection);
    } catch (SQLException e) {
      errorHandler.handlerError(e);
    }
    return -1;
  }

  @Override public int delete(PreparedDelete<T> preparedDelete) {
    try {
      return daoOpe.delete(preparedDelete);
    } catch (SQLException e) {
      errorHandler.handlerError(e);
    }
    return -1;
  }

  @Override public CloseableIterator<T> iterator() {
    return daoOpe.iterator();
  }

  @Override public CloseableIterator<T> iterator(int i) {
    return daoOpe.iterator(i);
  }

  @Override public CloseableIterator<T> iterator(PreparedQuery<T> preparedQuery) {
    try {
      return daoOpe.iterator(preparedQuery);
    } catch (SQLException e) {
      errorHandler.handlerError(e);
    }
    return  null;
  }

  @Override public CloseableIterator<T> iterator(PreparedQuery<T> preparedQuery, int i) {
    try {
      return daoOpe.iterator(preparedQuery,i);
    } catch (SQLException e) {
      errorHandler.handlerError(e);
    }
    return null;
  }

  @Override public CloseableWrappedIterable<T> getWrappedIterable() {
    return daoOpe.getWrappedIterable();
  }

  @Override public CloseableWrappedIterable<T> getWrappedIterable(PreparedQuery<T> preparedQuery) {
    return daoOpe.getWrappedIterable(preparedQuery);
  }

  @Override public void closeLastIterator() {
    try {
      daoOpe.closeLastIterator();
    } catch (SQLException e) {
      errorHandler.handlerError(e);
    }
  }

  @Override public GenericRawResults<String[]> queryRaw(String s, String... strings) {
    try {
      return daoOpe.queryRaw(s,strings);
    } catch (SQLException e) {
      errorHandler.handlerError(e);
    }
    return null;
  }

  @Override public <UO> GenericRawResults<UO> queryRaw(String s, RawRowMapper<UO> rawRowMapper,
      String... strings) {
    try {
      return daoOpe.queryRaw(s,rawRowMapper,strings);
    } catch (SQLException e) {
      errorHandler.handlerError(e);
    }
    return null;
  }

  @Override
  public GenericRawResults<Object[]> queryRaw(String s, DataType[] dataTypes, String... strings) {
    try {
      return daoOpe.queryRaw(s,dataTypes,strings);
    } catch (SQLException e) {
      errorHandler.handlerError(e);
    }
    return null;
  }

  @Override public long queryRawValue(String s, String... strings) {
    try {
      return daoOpe.queryRawValue(s,strings);
    } catch (SQLException e) {
      errorHandler.handlerError(e);
    }
    return -1l;
  }

  @Override public int executeRaw(String s, String... strings) {
    try {
      return daoOpe.executeRaw(s,strings);
    } catch (SQLException e) {
      errorHandler.handlerError(e);
    }
    return -1;
  }

  @Override public int executeRawNoArgs(String s) {
    try {
      return daoOpe.executeRawNoArgs(s);
    } catch (SQLException e) {
      errorHandler.handlerError(e);
    }
    return -1;
  }

  @Override public int updateRaw(String s, String... strings) {
    try {
      return daoOpe.updateRaw(s,strings);
    } catch (SQLException e) {
      errorHandler.handlerError(e);
    }
    return -1;
  }

  @Override public <CT> CT callBatchTasks(Callable<CT> callable) {
    try {
      return daoOpe.callBatchTasks(callable);
    } catch (Exception e) {
      errorHandler.handlerError(e);
    }
    return null;
  }

  @Override public String objectToString(T t) {
    return daoOpe.objectToString(t);
  }

  @Override public boolean objectsEqual(T t, T t1) {
    try {
      return daoOpe.objectsEqual(t,t1);
    } catch (SQLException e) {
      errorHandler.handlerError(e);
    }
    return false;
  }

  @Override public ID extractId(T t) {
    try {
      return daoOpe.extractId(t);
    } catch (SQLException e) {
      errorHandler.handlerError(e);
    }
    return null;
  }

  @Override public Class<T> getDataClass() {
    return daoOpe.getDataClass();
  }

  @Override public FieldType findForeignFieldType(Class<?> aClass) {
    return daoOpe.findForeignFieldType(aClass);
  }

  @Override public boolean isUpdatable() {
    return daoOpe.isUpdatable();
  }

  @Override public boolean isTableExists() {
    try {
      return daoOpe.isTableExists();
    } catch (SQLException e) {
      errorHandler.handlerError(e);
    }
    return false;
  }

  @Override public long countOf() {
    try {
      return daoOpe.countOf();
    } catch (SQLException e) {
      errorHandler.handlerError(e);
    }
    return -1l;
  }

  @Override public long countOf(PreparedQuery<T> preparedQuery) {
    try {
      return daoOpe.countOf(preparedQuery);
    } catch (SQLException e) {
      errorHandler.handlerError(e);
    }
    return -1l;
  }

  @Override public void assignEmptyForeignCollection(T t, String s) {
    try {
      daoOpe.assignEmptyForeignCollection(t,s);
    } catch (SQLException e) {
      errorHandler.handlerError(e);
    }
  }

  @Override public <FT> ForeignCollection<FT> getEmptyForeignCollection(String s) {
    try {
      return daoOpe.getEmptyForeignCollection(s);
    } catch (SQLException e) {
      errorHandler.handlerError(e);
    }
    return null;
  }

  @Override public void setObjectCache(boolean b) {
    try {
      daoOpe.setObjectCache(b);
    } catch (SQLException e) {
      errorHandler.handlerError(e);
    }
  }

  @Override public void setObjectCache(ObjectCache objectCache) {
    try {
      daoOpe.setObjectCache(objectCache);
    } catch (SQLException e) {
      errorHandler.handlerError(e);
    }
  }

  @Override public ObjectCache getObjectCache() {
    return daoOpe.getObjectCache();
  }

  @Override public void clearObjectCache() {
    daoOpe.clearObjectCache();
  }

  @Override public T mapSelectStarRow(DatabaseResults databaseResults) {
    try {
      return daoOpe.mapSelectStarRow(databaseResults);
    } catch (SQLException e) {
      errorHandler.handlerError(e);
    }
    return null;
  }

  @Override public GenericRowMapper<T> getSelectStarRowMapper() {
    try {
      return daoOpe.getSelectStarRowMapper();
    } catch (SQLException e) {
      errorHandler.handlerError(e);
    }
    return null;
  }

  @Override public RawRowMapper<T> getRawRowMapper() {
    return daoOpe.getRawRowMapper();
  }

  @Override public boolean idExists(ID id) {
    try {
      return daoOpe.idExists(id);
    } catch (SQLException e) {
      errorHandler.handlerError(e);
    }
    return false;
  }

  @Override public DatabaseConnection startThreadConnection() {
    try {
      return daoOpe.startThreadConnection();
    } catch (SQLException e) {
      errorHandler.handlerError(e);
    }
    return null;
  }

  @Override public void endThreadConnection(DatabaseConnection databaseConnection) {
    try {
      daoOpe.endThreadConnection(databaseConnection);
    } catch (SQLException e) {
      errorHandler.handlerError(e);
    }
  }

  @Override public void setAutoCommit(boolean b) {
    try {
      daoOpe.setAutoCommit(b);
    } catch (SQLException e) {
      errorHandler.handlerError(e);
    }
  }

  @Override public void setAutoCommit(DatabaseConnection databaseConnection, boolean b) {
    try {
      daoOpe.setAutoCommit(databaseConnection,b);
    } catch (SQLException e) {
      errorHandler.handlerError(e);
    }
  }

  @Override public boolean isAutoCommit() {
    try {
      return daoOpe.isAutoCommit();
    } catch (SQLException e) {
      errorHandler.handlerError(e);
    }
    return false;
  }

  @Override public boolean isAutoCommit(DatabaseConnection databaseConnection) {
    try {
      return daoOpe.isAutoCommit(databaseConnection);
    } catch (SQLException e) {
      errorHandler.handlerError(e);
    }
    return false;
  }

  @Override public void commit(DatabaseConnection databaseConnection) {
    try {
      daoOpe.commit(databaseConnection);
    } catch (SQLException e) {
      errorHandler.handlerError(e);
    }
  }

  @Override public void rollBack(DatabaseConnection databaseConnection) {
    try {
      daoOpe.rollBack(databaseConnection);
    } catch (SQLException e) {
      errorHandler.handlerError(e);
    }
  }

  @Override public ConnectionSource getConnectionSource() {
    return daoOpe.getConnectionSource();
  }

  @Override public void setObjectFactory(ObjectFactory<T> objectFactory) {
    daoOpe.setObjectFactory(objectFactory);
  }

  @Override public CloseableIterator<T> closeableIterator() {
    return daoOpe.closeableIterator();
  }
}

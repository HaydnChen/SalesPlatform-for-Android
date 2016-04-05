package com.ebaotech.salesplatform.core.bo;

import com.j256.ormlite.field.DatabaseField;
import java.util.Date;
import java.util.UUID;

/**
 * Created by haydn.chen on 4/5/2016.
 */
public abstract class AbstractSyncableBo {
  @DatabaseField(generatedId = true, columnName = "OFFLINE_ID", allowGeneratedIdInsert = true)
  protected UUID offlineId;
  @DatabaseField(defaultValue = "0", canBeNull = false)
  protected String deleteFlag = "0";
  @DatabaseField(canBeNull = false)
  protected Date lastUpdatedDate = new Date();
  @DatabaseField(canBeNull = false)
  protected Date offlineCreatedDate = new Date();
  @DatabaseField(canBeNull = false)
  protected String agentId;
  @DatabaseField
  protected Date lastVisitedDate = new Date();

  public UUID getOfflineId() {
    return offlineId;
  }

  public void setOfflineId(UUID offlineId) {
    this.offlineId = offlineId;
  }

  public String getDeleteFlag() {
    return deleteFlag;
  }

  public void setDeleteFlag(String deleteFlag) {
    this.deleteFlag = deleteFlag;
  }

  public Date getLastUpdatedDate() {
    return lastUpdatedDate;
  }

  public void setLastUpdatedDate(Date lastUpdatedDate) {
    this.lastUpdatedDate = lastUpdatedDate;
  }

  public Date getOfflineCreatedDate() {
    return offlineCreatedDate;
  }

  public void setOfflineCreatedDate(Date offlineCreatedDate) {
    this.offlineCreatedDate = offlineCreatedDate;
  }

  public String getAgentId() {
    return agentId;
  }

  public void setAgentId(String agentId) {
    this.agentId = agentId;
  }

  public Date getLastVisitedDate() {
    return lastVisitedDate;
  }

  public void setLastVisitedDate(Date lastVisitedDate) {
    this.lastVisitedDate = lastVisitedDate;
  }
}

package com.ebaotech.salesplatform.core.bo.prospect;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import java.util.UUID;

/**
 * Created by haydn.chen on 4/1/2016.
 */
@DatabaseTable(tableName = "T_SP_PROSPECT_RELA")
public class ProspectRelaBo {
  @DatabaseField(generatedId = true, columnName = "OFFLINE_ID", allowGeneratedIdInsert = true)
  private UUID offlineId;
  @DatabaseField
  private Long relationId;
  @DatabaseField(foreign = true, foreignAutoRefresh = true, columnName = "PROSPECT_OFFLINE_ID")
  private ProspectBo prospect;
  @DatabaseField(foreign = true, foreignAutoRefresh = true, columnName = "RELA_PROSPECT_OFFLINE_ID")
  private ProspectBo relaProspect;

  public UUID getOfflineId() {
    return offlineId;
  }

  public void setOfflineId(UUID offlineId) {
    this.offlineId = offlineId;
  }

  public Long getRelationId() {
    return relationId;
  }

  public void setRelationId(Long relationId) {
    this.relationId = relationId;
  }

  public ProspectBo getProspect() {
    return prospect;
  }

  public void setProspect(ProspectBo prospect) {
    this.prospect = prospect;
  }

  public ProspectBo getRelaProspect() {
    return relaProspect;
  }

  public void setRelaProspect(ProspectBo relaProspect) {
    this.relaProspect = relaProspect;
  }
}

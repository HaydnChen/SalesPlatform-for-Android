package com.ebaotech.salesplatform.core.bo.quotation;

import com.ebaotech.salesplatform.core.bo.prospect.ProspectBo;
import com.j256.ormlite.field.DatabaseField;
import java.util.UUID;

/**
 * Created by haydn.chen on 4/5/2016.
 */
public abstract class QuotationRoleBo {
  @DatabaseField(generatedId = true, columnName = "OFFLINE_ID", allowGeneratedIdInsert = true)
  protected UUID offlineId;
  @DatabaseField(foreign = true, foreignAutoRefresh = true, columnName = "QUOTATION_OFFLINE_ID")
  protected QuotationBo quotation;
  @DatabaseField(foreign = true, foreignAutoRefresh = true, columnName = "PROSPECT_OFFLINE_ID")
  protected ProspectBo prospect;

  public UUID getOfflineId() {
    return offlineId;
  }

  public void setOfflineId(UUID offlineId) {
    this.offlineId = offlineId;
  }

  public QuotationBo getQuotation() {
    return quotation;
  }

  public void setQuotation(QuotationBo quotation) {
    this.quotation = quotation;
  }

  public ProspectBo getProspect() {
    return prospect;
  }

  public void setProspect(ProspectBo prospect) {
    this.prospect = prospect;
  }
}

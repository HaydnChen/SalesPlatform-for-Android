package com.ebaotech.salesplatform.core.bo.quotation;

import com.ebaotech.salesplatform.core.bo.AbstractSyncableBo;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.field.ForeignCollectionField;
import com.j256.ormlite.table.DatabaseTable;
import java.util.Collection;
import java.util.UUID;

/**
 * Created by haydn.chen on 4/1/2016.
 */
@DatabaseTable(tableName = "T_SP_QUOTATION_REQUEST")
public class QuotationRequestBo extends AbstractSyncableBo {
  @DatabaseField
  private Long status;
  @DatabaseField
  private String quotationCode;
  @DatabaseField
  private Long distributorId;
  @DatabaseField
  private String packageIndi;
  @ForeignCollectionField(eager = true)
  private Collection<QuotationBo> quotationS;

  public Long getStatus() {
    return status;
  }

  public void setStatus(Long status) {
    this.status = status;
  }

  public String getQuotationCode() {
    return quotationCode;
  }

  public void setQuotationCode(String quotationCode) {
    this.quotationCode = quotationCode;
  }

  public Long getDistributorId() {
    return distributorId;
  }

  public void setDistributorId(Long distributorId) {
    this.distributorId = distributorId;
  }

  public String getPackageIndi() {
    return packageIndi;
  }

  public void setPackageIndi(String packageIndi) {
    this.packageIndi = packageIndi;
  }

  public Collection<QuotationBo> getQuotationS() {
    return quotationS;
  }

  public void setQuotationS(Collection<QuotationBo> quotationS) {
    this.quotationS = quotationS;
  }
}

package com.ebaotech.salesplatform.core.bo.prospect;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import java.util.UUID;

/**
 * Created by haydn.chen on 4/1/2016.
 */
@DatabaseTable(tableName = "T_SP_BANK_ACCOUNT")
public class ProspectAddressBo {
  @DatabaseField(generatedId = true, columnName = "OFFLINE_ID", allowGeneratedIdInsert = true)
  private UUID offlineId;
  @DatabaseField(foreign = true, foreignAutoRefresh = true, columnName = "PROSPECT_OFFLINE_ID")
  private ProspectBo prospect;
  @DatabaseField
  private String addressType;
  @DatabaseField(foreign = true, foreignAutoRefresh = true, columnName = "ADDRESS_OFFLINE_ID")
  private AddressBo address;

  public UUID getOfflineId() {
    return offlineId;
  }

  public void setOfflineId(UUID offlineId) {
    this.offlineId = offlineId;
  }

  public ProspectBo getProspect() {
    return prospect;
  }

  public void setProspect(ProspectBo prospect) {
    this.prospect = prospect;
  }

  public String getAddressType() {
    return addressType;
  }

  public void setAddressType(String addressType) {
    this.addressType = addressType;
  }

  public AddressBo getAddress() {
    return address;
  }

  public void setAddress(AddressBo address) {
    this.address = address;
  }
}

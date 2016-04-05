package com.ebaotech.salesplatform.core.bo.quotation;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import java.math.BigDecimal;
import java.util.UUID;

/**
 * Created by haydn.chen on 4/5/2016.
 */
@DatabaseTable(tableName = "T_SP_EXTRA_MORTALITY")
public class ExtraMortalityBo {
  @DatabaseField(generatedId = true, columnName = "OFFLINE_ID", allowGeneratedIdInsert = true)
  private UUID offlineId;
  @DatabaseField(foreign = true, foreignAutoRefresh = true, columnName = "QUOTATION_OFFLINE_ID")
  private QuotationBo quotation;
  @DatabaseField(foreign = true, foreignAutoRefresh = true, columnName = "QUOTATION_PRODUCT_OFFLINE_ID")
  private QuotationProductBo quotationProduct;
  @DatabaseField
  private String emType;
  @DatabaseField
  private BigDecimal emValue;
  @DatabaseField
  private String loadFrom;
  @DatabaseField
  private String loadTo;
  @DatabaseField
  private Long productId;

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

  public QuotationProductBo getQuotationProduct() {
    return quotationProduct;
  }

  public void setQuotationProduct(QuotationProductBo quotationProduct) {
    this.quotationProduct = quotationProduct;
  }

  public String getEmType() {
    return emType;
  }

  public void setEmType(String emType) {
    this.emType = emType;
  }

  public BigDecimal getEmValue() {
    return emValue;
  }

  public void setEmValue(BigDecimal emValue) {
    this.emValue = emValue;
  }

  public String getLoadFrom() {
    return loadFrom;
  }

  public void setLoadFrom(String loadFrom) {
    this.loadFrom = loadFrom;
  }

  public String getLoadTo() {
    return loadTo;
  }

  public void setLoadTo(String loadTo) {
    this.loadTo = loadTo;
  }

  public Long getProductId() {
    return productId;
  }

  public void setProductId(Long productId) {
    this.productId = productId;
  }
}

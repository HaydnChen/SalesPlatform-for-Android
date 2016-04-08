package com.ebaotech.salesplatform.rest.model.quotation;

import com.ebaotech.salesplatform.rest.model.AbstractSyncableModel;
import java.util.ArrayList;
import java.util.List;

public class QuotationRequest extends AbstractSyncableModel {
	private static final long serialVersionUID = -5950448138541010585L;

	private Long status;

	private Long producerId;

	private String quotationCode;

	private Long distributorId;

	private String packageIndi;

	private List<Quotation> quotationS = new ArrayList<Quotation>();

	public Long getStatus() {
		return status;
	}

	public void setStatus(Long status) {
		this.status = status;
	}

	public Long getProducerId() {
		return producerId;
	}

	public void setProducerId(Long producerId) {
		this.producerId = producerId;
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

	public List<Quotation> getQuotationS() {
		return quotationS;
	}

	public void setQuotationS(List<Quotation> quotationS) {
		this.quotationS = quotationS;
	}
}

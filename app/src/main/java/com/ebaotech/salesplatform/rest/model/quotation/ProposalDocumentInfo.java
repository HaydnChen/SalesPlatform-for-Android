package com.ebaotech.salesplatform.rest.model.quotation;

import java.io.Serializable;

public class ProposalDocumentInfo implements Serializable {
	private static final long serialVersionUID = 953680924191446806L;

	private String documentType;

	private String documentPath;

	private String fileName;

	private Long status;

	public String getDocumentType() {
		return documentType;
	}

	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}

	public String getDocumentPath() {
		return documentPath;
	}

	public void setDocumentPath(String documentPath) {
		this.documentPath = documentPath;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public Long getStatus() {
		return status;
	}

	public void setStatus(Long status) {
		this.status = status;
	}
}

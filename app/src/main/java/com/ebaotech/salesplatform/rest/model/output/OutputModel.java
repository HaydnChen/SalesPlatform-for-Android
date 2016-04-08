package com.ebaotech.salesplatform.rest.model.output;

import com.ebaotech.salesplatform.rest.model.Syncable;

public class OutputModel<T extends Syncable> implements Outputable {
	private static final long serialVersionUID = -4353979620714853029L;
	private String status = Outputable.STATUS_SUCCESS;
	private String messageId;
	private T model;

	public T getModel() {
		return model;
	}

	public void setModel(T model) {
		this.model = model;
	}

	@Override
	public String getStatus() {
		return status;
	}

	@Override
	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String getMessageId() {
		return messageId;
	}

	@Override
	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}

}

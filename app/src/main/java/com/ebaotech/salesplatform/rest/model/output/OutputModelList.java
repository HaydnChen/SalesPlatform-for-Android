package com.ebaotech.salesplatform.rest.model.output;

import com.ebaotech.salesplatform.rest.model.Syncable;
import java.util.List;

public class OutputModelList<T extends Syncable> implements Outputable {
	private static final long serialVersionUID = -2832009059008933710L;
	private String status = Outputable.STATUS_SUCCESS;
	private String messageId;
	private List<T> model;

	public List<T> getModel() {
		return model;
	}

	public void setModel(List<T> model) {
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

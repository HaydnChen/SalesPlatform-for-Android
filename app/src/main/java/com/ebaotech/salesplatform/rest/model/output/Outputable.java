package com.ebaotech.salesplatform.rest.model.output;

import java.io.Serializable;

public interface Outputable extends Serializable {
	static final String STATUS_SUCCESS = "0";
	static final String STATUS_FAILURE = "1";

	String getStatus();

	void setStatus(String status);

	String getMessageId();

	void setMessageId(String messageId);
}

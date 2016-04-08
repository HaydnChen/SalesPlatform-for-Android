package com.ebaotech.salesplatform.rest.model.input;

import com.ebaotech.salesplatform.rest.model.Syncable;

public class InputModel<T extends Syncable> extends DeviceCheck {
	private static final long serialVersionUID = -3842357373525414707L;
	private T model;

	public T getModel() {
		return model;
	}

	public void setModel(T model) {
		this.model = model;
	}
}

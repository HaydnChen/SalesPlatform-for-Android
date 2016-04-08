package com.ebaotech.salesplatform.rest.model.prospect;

import java.io.Serializable;

public class ProspectAddress implements Serializable {
	private static final long serialVersionUID = 3527593888244754854L;

	private String addressType;

	private Address address;

	public String getAddressType() {
		return addressType;
	}

	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}

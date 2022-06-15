package com.zensar.beans;

public class Address {
	
	private String State;
	
	private String city;
	
	private String pincode;

	public Address() {
		super();
	}

	public Address(String state, String city, String pincode) {
		super();
		State = state;
		this.city = city;
		this.pincode = pincode;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [State=" + State + ", city=" + city + ", pincode=" + pincode + "]";
	}
	
	

}

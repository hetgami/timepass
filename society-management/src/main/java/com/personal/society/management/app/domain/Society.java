package com.personal.society.management.app.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Society {

	@JsonProperty("societykey")
	private String societyKey;

	@JsonProperty("societyname")
	private String societyName;

	@JsonProperty("addresstext")
	private String addressText;

	private String landmark;

	private Integer pincode;

	private String area;

	private String city;

	public String getSocietyKey() {
		return societyKey;
	}

	public void setSocietyKey(String societyKey) {
		this.societyKey = societyKey;
	}

	public String getSocietyName() {
		return societyName;
	}

	public void setSocietyName(String societyName) {
		this.societyName = societyName;
	}

	public String getAddressText() {
		return addressText;
	}

	public void setAddressText(String addressText) {
		this.addressText = addressText;
	}

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	public Integer getPincode() {
		return pincode;
	}

	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}

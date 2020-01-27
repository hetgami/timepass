package com.personal.society.management.app.domain;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Apartment {
	@JsonProperty("societykey")
	private String societyKey;

	private String block;

	@JsonProperty("apartmentno")
	private String apartmentNo;

	public String getSocietyKey() {
		return societyKey;
	}

	public void setSocietyKey(String societyKey) {
		this.societyKey = societyKey;
	}

	public String getBlock() {
		return block;
	}

	public void setBlock(String block) {
		this.block = block;
	}

	public String getApartmentNo() {
		return apartmentNo;
	}

	public void setApartmentNo(String apartmentNo) {
		this.apartmentNo = apartmentNo;
	}

	@Override
	public int hashCode() {
		return societyKey.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Apartment) {
			Apartment apartment = (Apartment) obj;
			if (StringUtils.equalsIgnoreCase(this.apartmentNo, apartment.apartmentNo)
					&& StringUtils.equalsIgnoreCase(this.block, apartment.block)
					&& StringUtils.equalsIgnoreCase(this.societyKey, apartment.societyKey)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}

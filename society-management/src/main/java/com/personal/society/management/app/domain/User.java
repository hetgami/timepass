package com.personal.society.management.app.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.personal.society.management.app.enums.Gender;
import com.personal.society.management.app.enums.ResidentType;

public class User {
	@JsonProperty("societykey")
	private String societyKey;

	private String block;

	@JsonProperty("apartmentno")
	private String apartmentNo;

	@JsonProperty("username")
	private String userName;

	@JsonProperty("resident_type")
	private ResidentType residentType;

	@JsonProperty("mobile_no")
	private Long mobileNo;

	@JsonProperty("email_id")
	private String emailId;

	@JsonProperty("first_name")
	private String firstName;

	@JsonProperty("last_name")
	private String lastName;

	private Gender gender;

	private String description;

	@JsonProperty("is_master")
	private Boolean isMaster;

	@JsonProperty("parent_user")
	private String parentUserName;

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

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public ResidentType getResidentType() {
		return residentType;
	}

	public void setResidentType(ResidentType residentType) {
		this.residentType = residentType;
	}

	public Long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(Long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Boolean getIsMaster() {
		return isMaster;
	}

	public void setIsMaster(Boolean isMaster) {
		this.isMaster = isMaster;
	}

	public String getParentUserName() {
		return parentUserName;
	}

	public void setParentUserName(String parentUserName) {
		this.parentUserName = parentUserName;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}

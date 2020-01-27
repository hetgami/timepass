package com.personal.society.management.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.personal.society.management.app.enums.Gender;
import com.personal.society.management.app.enums.ResidentType;

@Entity
@Table(name = "user", uniqueConstraints = { @UniqueConstraint(columnNames = { "user_name"}) })
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "user_id")
	private Integer userId;

	@Column(name = "user_name")
	private String userName;

	@Enumerated(EnumType.STRING)
	@Column(name = "resident_type")
	private ResidentType residentType;

	@Column(name = "mobile_no")
	private Long mobileNo;

	@Column(name = "email_id")
	private String emailId;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Enumerated(EnumType.STRING)
	@Column(name = "gender")
	private Gender gender;

	@Column(name = "description")
	private String description;

	@Column(name = "is_master")
	private Boolean isMaster;

	@Column(name = "parent_user")
	private Integer parentUser;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "apartment_id")
	private Apartment apartment;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
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

	public Integer getParentUser() {
		return parentUser;
	}

	public void setParentUser(Integer parentUser) {
		this.parentUser = parentUser;
	}

	public Apartment getApartment() {
		return apartment;
	}

	public void setApartment(Apartment apartment) {
		this.apartment = apartment;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}

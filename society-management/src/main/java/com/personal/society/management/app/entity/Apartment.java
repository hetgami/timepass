package com.personal.society.management.app.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.apache.commons.lang3.builder.ToStringBuilder;

@Entity
@Table(name = "apartment", uniqueConstraints = {
		@UniqueConstraint(columnNames = { "apartment_block", "apartment_no", "society_id" }) })
public class Apartment {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "apartment_id")
	private Integer apartmentId;

	@Column(name = "apartment_block", nullable = false)
	private String apartmentBlock;

	@Column(name = "apartment_no", nullable = false)
	private String apartmentNo;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "society_id", nullable = false)
	private Society society;

	@OneToMany(mappedBy = "apartment", fetch = FetchType.LAZY)
	private Set<User> users;

	public Apartment() {
		
	}
	
	public Apartment(String apartmentBlock, String apartmentNo, Society society) {
		super();
		this.apartmentBlock = apartmentBlock;
		this.apartmentNo = apartmentNo;
		this.society = society;
	}

	public Integer getApartmentId() {
		return apartmentId;
	}

	public void setApartmentId(Integer apartmentId) {
		this.apartmentId = apartmentId;
	}

	public String getApartmentBlock() {
		return apartmentBlock;
	}

	public void setApartmentBlock(String apartmentBlock) {
		this.apartmentBlock = apartmentBlock;
	}

	public String getApartmentNo() {
		return apartmentNo;
	}

	public void setApartmentNo(String apartmentNo) {
		this.apartmentNo = apartmentNo;
	}

	public Society getSociety() {
		return society;
	}

	public void setSociety(Society society) {
		this.society = society;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

}

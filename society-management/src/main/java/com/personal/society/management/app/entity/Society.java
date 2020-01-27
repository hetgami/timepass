package com.personal.society.management.app.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.apache.commons.lang3.builder.ToStringBuilder;

@Entity
@Table(name = "society", uniqueConstraints = { @UniqueConstraint(columnNames = { "society_key"}) })
public class Society {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "society_id")
	private Integer societyId;
	
	@Column(name = "society_key", nullable = false)
	private String societyKey;

	@Column(name = "society_name", nullable = false)
	private String societyName;

	@Column(name = "address_text", nullable = false)
	private String addressText;

	@Column(name = "landmark", nullable = false)
	private String landmark;

	@Column(name = "pincode", nullable = false)
	private Integer pincode;

	@Column(name = "area", nullable = false)
	private String area;

	@Column(name = "city", nullable = false)
	private String city;

	@OneToMany(mappedBy = "society", fetch = FetchType.LAZY)
	private Set<Apartment> apartments;

	public Integer getSocietyId() {
		return societyId;
	}

	public void setSocietyId(Integer societyId) {
		this.societyId = societyId;
	}
	
	

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

	public Set<Apartment> getApartments() {
		return apartments;
	}

	public void setApartments(Set<Apartment> apartments) {
		this.apartments = apartments;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}

package com.xworkz.app.island.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "island",schema="hibernate")
public class IsLandDTO {
	@Id
	@Column(name = "id")
	private int isLandId;
	@Column(name = "name")
	private String isLandName;
	@Column(name = "location")
	private String isLanflocation;
	@Column(name = "country")
	private String country;

	public IsLandDTO(int isLandId, String isLandName, String isLanflocation, String country) {
		super();
		this.isLandId = isLandId;
		this.isLandName = isLandName;
		this.isLanflocation = isLanflocation;
		this.country = country;
	}

	public int getIsLandId() {
		return isLandId;
	}

	public void setIsLandId(int isLandId) {
		this.isLandId = isLandId;
	}

	public String getIsLandName() {
		return isLandName;
	}

	public void setIsLandName(String isLandName) {
		this.isLandName = isLandName;
	}

	public String getIsLanflocation() {
		return isLanflocation;
	}

	public void setIsLanflocation(String isLanflocation) {
		this.isLanflocation = isLanflocation;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
}

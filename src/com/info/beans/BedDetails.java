package com.info.beans;

public class BedDetails {
	
	private String hospitalName;
	
	private String bedStatus;
	
	private String bedTypes;
	
	public BedDetails() {
		
	}

	public BedDetails(String hospitalName, String bedStatus, String bedTypes) {
		super();
		this.hospitalName = hospitalName;
		this.bedStatus = bedStatus;
		this.bedTypes = bedTypes;
	}

	public String getHospitalName() {
		return hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public String getBedStatus() {
		return bedStatus;
	}

	public void setBedStatus(String bedStatus) {
		this.bedStatus = bedStatus;
	}

	public String getBedTypes() {
		return bedTypes;
	}

	public void setBedTypes(String bedTypes) {
		this.bedTypes = bedTypes;
	}

	@Override
	public String toString() {
		return "BedDetails [hospitalName=" + hospitalName + ", bedStatus=" + bedStatus + ", bedTypes=" + bedTypes + "]";
	}
	
	

}

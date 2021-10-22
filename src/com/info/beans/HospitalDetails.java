package com.info.beans;

public class HospitalDetails {
	
	
	private String hospitalName;
	
	private String city;

	
	public HospitalDetails(String hospitalName, String city) {
		super();
		this.hospitalName = hospitalName;
		this.city = city;
	}

	//Getters and Setters 
	public String getHospitalName() {
		return hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "HospitalDetails [hospitalName=" + hospitalName + ", city=" + city + "]";
	}
	


}

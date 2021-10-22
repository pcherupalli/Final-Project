package com.info.beans;

public class PatientDetails {
	
	private String name;
	
	private Integer Age;
	
	private String Address;
	
	private String city;
	
	private String purpose;
	
	private String requiredBedType;
	

	public PatientDetails(String name, Integer age, String address, String city, String purpose,
			String requiredBedType) {
		super();
		this.name = name;
		Age = age;
		Address = address;
		this.city = city;
		this.purpose = purpose;
		this.requiredBedType = requiredBedType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return Age;
	}

	public void setAge(Integer age) {
		Age = age;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public String getRequiredBedType() {
		return requiredBedType;
	}

	public void setRequiredBedType(String requiredBedType) {
		this.requiredBedType = requiredBedType;
	}
	
	
	

}

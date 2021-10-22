package com.info.builder;

import com.info.beans.PatientDetails;

public class PatientBuilder {
	
    private String name;
	
	private Integer Age;
	
	private String Address;
	
	private String city;
	
	private String purpose;
	
	private String requiredBedType;

	public PatientBuilder setName(String name) {
		this.name = name;
		return this;
	}

	public PatientBuilder setAge(Integer age) {
		Age = age;
		return this;

	}

	public PatientBuilder setAddress(String address) {
		Address = address;
		return this;

	}

	public PatientBuilder setCity(String city) {
		this.city = city;
		return this;

	}

	public PatientBuilder setPurpose(String purpose) {
		this.purpose = purpose;
		return this;

	}

	public PatientBuilder setRequiredBedType(String requiredBedType) {
		this.requiredBedType = requiredBedType;
		return this;

	}
	
	public PatientDetails getPatient() {
		return new PatientDetails(name, Age, Address, city, purpose, requiredBedType);
	}
	
	

}

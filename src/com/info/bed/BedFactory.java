package com.info.bed;

public class BedFactory {
	
	
	public Hospital getInstance(String patient) {
		//Logic to be implemented 
		if(patient.equals("patient")) {
			return new Patient();
		}
		
		
		return null;
		
	}

}

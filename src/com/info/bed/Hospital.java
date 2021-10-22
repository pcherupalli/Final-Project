package com.info.bed;

import java.util.List;

import com.info.beans.BedDetails;
import com.info.beans.HospitalDetails;
import com.info.beans.PatientDetails;

public interface Hospital {
	
	void patientRegister(PatientDetails details);
	
	List<HospitalDetails>  checkAvailableHospital(String location);
	
	List<BedDetails> checkbedStatus(PatientDetails details, List<HospitalDetails> hospitals);
		
	String reserveBed(PatientDetails patient, BedDetails bedDetails);
	
	Integer processBill(PatientDetails patient, BedDetails bedDetails);
	

	

}

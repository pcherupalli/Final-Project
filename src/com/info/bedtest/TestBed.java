package com.info.bedtest;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.info.beans.BedDetails;
import com.info.beans.HospitalDetails;
import com.info.beans.PatientDetails;
import com.info.bed.Patient;
import com.info.builder.PatientBuilder;

class TestBed {

	Patient patient = new Patient();
	
	
	@Test
	void testAvailabilityOfHospital() {
		
		List<HospitalDetails> hospitalList = patient.checkAvailableHospital("chennai");
		assertNotNull(hospitalList);
	}
	
	@Test
	void testBedstatus() {
		PatientDetails patient2 = new PatientBuilder().setName("Antony").setAddress("Royapettah").setCity("chennai").setAge(50).setPurpose("Covid ")
	             .setRequiredBedType("ICU bed").getPatient();
		List<HospitalDetails> hospitalList = patient.checkAvailableHospital("chennai");
		 List<BedDetails> bedList = patient.checkbedStatus(patient2,hospitalList);
		assertNotNull(bedList);
	}

}

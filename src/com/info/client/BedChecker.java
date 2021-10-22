package com.info.client;

import java.util.List;

import com.info.beans.BedDetails;
import com.info.beans.HospitalDetails;
import com.info.beans.PatientDetails;
import com.info.bed.BedFactory;
import com.info.bed.Hospital;
import com.info.bed.Patient;
import com.info.builder.PatientBuilder;
import com.info.observer.NotifyBill;

public class BedChecker {
	
	public static void main(String[] args) {
		
		//Set the patient inputs using builder pattern
		PatientDetails patient1 = new PatientBuilder().setName("Thomas").setAddress("Royapettah").setCity("chennai").setAge(50).setPurpose("Covid ")
				             .setRequiredBedType("ICU bed").getPatient();
		
		//Factory pattern to create an object
		BedFactory bedFactory = new BedFactory();
		
		Hospital patient = bedFactory.getInstance("patient");
		
		String hospitalName = null;
		patient.patientRegister(patient1);
		List<HospitalDetails> hospitalList =  patient.checkAvailableHospital(patient1.getCity());
		List<BedDetails> availableBed =   patient.checkbedStatus(patient1, hospitalList);
		for(BedDetails available : availableBed) {
		   System.out.println(patient.reserveBed(patient1, available));
		   hospitalName= available.getHospitalName();
		   Integer bill =patient.processBill(patient1, available);
		   //Observer pattern to send the bill payment
			NotifyBill notifyBill = new NotifyBill();
			notifyBill.notifyBillToPatient(hospitalName, bill, patient1.getName());
			
			break;
		}
		
		
	
		
		
		
		
		
	}

}

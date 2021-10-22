package com.info.bed;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.info.beans.BedDetails;
import com.info.beans.HospitalDetails;
import com.info.beans.PatientDetails;

public class Patient implements Hospital{

	@Override
	public void patientRegister(PatientDetails details) {
		// TODO Auto-generated method stub
		System.out.println("Hi "+details.getName() +", you have registered successfully ");
	}

	@Override
	public List<HospitalDetails> checkAvailableHospital(String location) {
		// TODO Auto-generated method stub
		List<HospitalDetails> availableHospitals = new ArrayList<>();
		
		if(location.equalsIgnoreCase("chennai")) {
			HospitalDetails h1 = new HospitalDetails("Appollo", "Greams Road, chennai");
			HospitalDetails h2 = new HospitalDetails("Fortis Malar", "Adyar , chennai");
			HospitalDetails h3 = new HospitalDetails("SRMC",  "porur, chennai");
			availableHospitals = Arrays.asList(h1,h2,h3);

		}
		System.out.println("**********Available Hospitals************");
		availableHospitals.stream().forEach(i->System.out.println(i));		
		return availableHospitals;
	}

	@Override
	public List<BedDetails> checkbedStatus(PatientDetails details, List<HospitalDetails> hospitals) {
		// TODO Auto-generated method stub
		List<BedDetails> bedDetailsList = new ArrayList<>();
				
		for(HospitalDetails hospital :hospitals) {
			BedDetails bedDetails = new BedDetails();
			bedDetails.setHospitalName(hospital.getHospitalName());
			bedDetails.setBedStatus("Available");
			bedDetails.setBedTypes(details.getRequiredBedType());
			bedDetailsList.add(bedDetails);
		}
        System.out.println("*********Available Beds **********");
        bedDetailsList.stream().forEach(i->System.out.println(i));
		return bedDetailsList;
	}

	@Override
	public String reserveBed(PatientDetails patient, BedDetails bedDetails) {
		// TODO Auto-generated method stub
		return "*********Congrats,  Hi "+patient.getName()+" ,Bed Booked --->Type ("+bedDetails.getBedTypes()+" in the hospital )"+bedDetails.getHospitalName()+" *********";
	}

	@Override
	public Integer processBill(PatientDetails patient, BedDetails bedDetails) {
		// TODO Auto-generated method stub
		Integer totalCharges=0;
		System.out.println(patient.getPurpose() +"  "+ bedDetails.getHospitalName());
		if(patient.getPurpose().equalsIgnoreCase("Covid") || bedDetails.getHospitalName().equalsIgnoreCase("Appollo")) {
			totalCharges= 200000;
		}
		else if(patient.getPurpose().equalsIgnoreCase("Covid") && bedDetails.getHospitalName().equalsIgnoreCase("SRMC")) {
			totalCharges= 250000;
		}
		else if(patient.getPurpose().equalsIgnoreCase("Covid") && bedDetails.getHospitalName().equalsIgnoreCase("Fortis Malar")) {
			totalCharges= 250000;
		}
		
		return totalCharges;
	}



}

package com.info.observer;

public class NotifyBill {
	
	
	User user = new User();
	
	public void notifyBillToPatient(String hospital ,Integer bill,String patientName) {
		user.notifyBillPayment(hospital, bill,patientName);
	}

}

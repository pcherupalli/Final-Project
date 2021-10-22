package com.info.observer;

public class User implements Observer {

	@Override
	public void notifyBillPayment(String hospital ,Integer bill,String patientName) {
		// TODO Auto-generated method stub
		System.out.println("********Greeting from "+hospital+"*************");
		System.out.println();
		System.out.println("Hello "+patientName+" , you have to pay the followed bill  "+bill);
	}
	

}

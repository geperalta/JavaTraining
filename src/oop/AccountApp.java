package oop;

public class AccountApp {

	public static void main(String[] args) {
		LoanAccount la = new LoanAccount();
		la.increaseRate();
		la.setRate();
		la.setArmmortsSchedule();
		la.setTerm(20);
		
		//we can also create an object using the INTERFACER pointing to the LoanAccount
		//we create an account1 based on IRate properties pointing to the LoanAccount
		//so the properties of IRate are the ones show in the .dot, but the body is actually executed from LoanAccount
			//POLYMORPHISM - changes where we are pointing
		IRate account1 = new LoanAccount();
		account1.increaseRate();
		account1.setRate();
		
		
	}

}

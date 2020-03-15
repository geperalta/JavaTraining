package oop;

public class LoanAccount implements IRate {
	
		//this was auto implemented from IRate Interface. 
	//CDAccount is a bank account, and LoanAcount HAS a Rate, this is the difference.
	@Override
	public void setRate() {
		System.out.println("Rate");
		
	}

	@Override
	public void increaseRate() {
		System.out.println("Inrease Rate");
		
	}
	
	public void setTerm(int term) {
		System.out.println("Setting the therm to: "+term+" years.");
	}
	
	public void setArmmortsSchedule() {
		System.out.println("Amortization schedule");
	}

	
	
}

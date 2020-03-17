package exceptionsfiles;

public class NegativePaymentException extends Exception {

	
	double payment;
	
	public NegativePaymentException(double payment) {
		// System.out.println("Error: Payment is negative");
		this.payment = payment;
	}

	
	//to get more information of the exception we are going to override the toString method
	@Override
	public String toString() {
		return "Cannot take negative payment " + payment;
	}
	
	
}

//We have to extends Exception to the class to apply this in the throwable? in the main class
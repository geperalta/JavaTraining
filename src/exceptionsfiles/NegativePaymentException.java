package exceptionsfiles;

public class NegativePaymentException extends Exception {

	// Define class variable
	double payment;
	
	// 1. Constructor that takes the value that would throw he exception
	// 2. Assign value of local variable class variable
	public NegativePaymentException(double payment) {
		// System.out.println("Error: Payment is negative");
		this.payment = payment;
	}

	// 3. Override the toString() method to include the specific exception message
	//to get more information of the exception we are going to override the toString method
	@Override
	public String toString() {
		return "Cannot take negative payment " + payment;
	}
	
	
}

//We have to extends Exception to the class to apply this in the throwable? in the main class
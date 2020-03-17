package exceptionsfiles;

import java.util.Scanner;

public class PaymentsApp {

	public static void main(String[] args) {
		
		double payment = 0;
		boolean positivePymt = true;
		
			
				//3.1 If we want to the client to IN a new amount if they use a negative, we need to make a LOOP. in this case a DO-While loop	
		do {
			
			// 1. Ask the user for input
			System.out.print("Enter the payment amount: ");
			
			
			// 2. Get the amount and test the value
			Scanner in = new Scanner(System.in);
			
			// 3. Handle exceptions appropriately
			try {
				payment = in.nextDouble();
				
				if ( payment < 0 ) {
					throw new NegativePaymentException(payment);
				} else { positivePymt = true; }
				
			} catch (NegativePaymentException e) {
				System.out.println(e.toString());
				positivePymt = false;
				System.out.println("Please try again...");
			}
			
			
		} while (!positivePymt);
	
		
		// 4. Print confirmation
		System.out.println("Thank you for your payment of: $" + payment );
		
		 
	
		

		

	}

}

package oop;

public class BankAccountApp {

	public static void main(String[] args) {
		//Creating a new bank account >> think instantiate an object
		
		BankAccount acc1 = new BankAccount(); // These area objects
		
			//this is the old way of define variables
		//acc1.name = "Roger Hue";
			//***this is the new way. ENCAPSULATION. Setter and Getter
		acc1.setName("Roger Hue");
		System.out.println(acc1.getName());
		acc1.setSsn("123654");
		System.out.println(acc1.getSsn());
		
		//these are getting from the interface
		acc1.setRate(); 
		acc1.increaseRate();
		
		acc1.accountNumber = "012345674"; //different account no. for each account
		//System.out.println("Routing Number: "+ BankAccount.routingNumber); // its the same for all different accounts for the STATIC in her CLASS
		acc1.balance = 1000;
		
		acc1.deposit(333.33);
		acc1.withdraw(-20);
		
			//POLYMORPHISM through Overriding on the toString
		System.out.println(acc1.toString());
		
		
			//POLYMORPHISM through Overloading
		BankAccount acc2 = new BankAccount("Checking Account");
		acc2.accountNumber = "012233548";
		//System.out.println("Routing Number: "+ acc2.routingNumber);
		
		BankAccount acc3 = new BankAccount("Savings Account", 5000);
		acc3.accountNumber = "012235958"; 
		//System.out.println("Routing Number: "+ BankAccount.routingNumber);
		acc3.checkBalance();
		
		/* Commented to not be lost in the printed
		
			//Demo for INHERITANCE from the BankAccount to CDAccount
		CDAccount cd1 = new CDAccount();
		cd1.balance = 3000;
		cd1.interestRate = "4.5"; //variable only for CDAccount
		cd1.name = "Juan";
		cd1.accountType = "CD Account";
		System.out.println(cd1.toString());
		cd1.compound(); //this method can only be access to CDAccount
		
		*/
	}

}

package oop;

public class BankAccount implements IRate {
	//Define variables
	String accountNumber;
	
		//STATIC >> belongs to the CLASS not to the OBJECT instance << CLASS VARIABLE
			// final >> constant
	private static final String routingNumber = "00246";
	
	//Instance Variables -AND Properties
	private String name;
	private String ssn;
	String bankAccount;
	double balance = 0;
	String accountType = "";
	
	//****Constructors
		//1.They are used to define / setup / initialize properties of and object
		//2.Constructors are IMPLICITLY called upon INSTANTIATION 
		//3.The same name as the class itself
		//4.Constructors have NO return type
	BankAccount(){
		System.out.println("NEW ACCOUNT CREATED!");
	}
	
	//Overloading call same method name with different arguments
	BankAccount(String accountType){
		System.out.println("NEW ACCOUNT: "+ accountType);
	}
	
	BankAccount(String accountType, double initDeposit){
		//initDeposit, accountType, Msg are all local variables. They are in only one block
		System.out.println("NEW ACCOUNT: "+ accountType);
		System.out.println("INITIAL DEPOSIT OF $: "+ initDeposit);
		String Msg = null;
		if (initDeposit < 1000) {
			Msg = "ERROR: Minimum deposit must be at least $1,000.00";
		} else {
			Msg = "Thanks for you initial deposit of: $" + initDeposit;
		}
		System.out.println(Msg);
		balance = initDeposit;
	}
	
	
	//*****Getters / Setters
	
		//Allow the user to define the name (setter)
	public void setName(String name) {
		this.name = "Mr." + name;
	} 
			//setter
			//this.name it refers to the name variable of this class (line12)
			//name alone is refers to the parameter of this method for the user to use
	public String getName () {
		return name;
	}
			//getter
			//the getter get back the variable name from the class (ln12) that was set with setter
	
	//this was generated with source/generate 
	public String getSsn() {
		return "The SSN is:  "+ ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	//*****Interface Methods 
	
	public void setRate () {
		System.out.println("SETTING RATE");
	}
	public void increaseRate () {
		System.out.println("INCREASING RATE");
	}
	
	
	//****Define Methods / actions of object
	public void deposit(double amount) {
		balance=balance+amount;
		showActivity("DEPOSIT");
	} //scope to all the project 
	

	void withdraw(double amount) {
		balance=balance+amount;
		showActivity("WITHDRAW");
	} //default/protected to only its package
	
	//this method can only be called from within the class
	private void showActivity(String activity) {
		System.out.println("YOUR RECENT TRANSACTION: "+ activity);
		System.out.println("YOU NEWBALANCE IS: $"+ balance);
	}
	
	void checkBalance() {
		System.out.println("Balance: "+balance);
	}
	
	void getStatus() {
		
	}
	
	@Override //notation to know we override(we change the method with another body) this method
	public String toString() {
		return "[ NAME:" + name + ". ACCOUNT#:" + accountNumber + ". ROUTING#:"+ routingNumber +" The Balance is "+ balance + "]"; 
	}
	
	
}

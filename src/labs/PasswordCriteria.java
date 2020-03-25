package labs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PasswordCriteria {

	public static void main(String[] args) {
		String filename = "/Users/geperalta/Documents/eclipse-workspace/JavaTraining/Files/Passwords.txt";
		String[] passwords = new String[13];
		
		File file = new File(filename);
		
		//to read file
		
			try {
				BufferedReader br = new BufferedReader(new FileReader (file));
				
				for (int i=0; i<passwords.length; i++) {
					passwords[i] = br.readLine();
				}
				
			} catch (FileNotFoundException e) {
				System.out.println(e.toString());
				System.out.println("ERROR: File cannot found");
			} catch (IOException e) {
				System.out.println(e.toString());
				System.out.println("ERROR: File cannot be readed");
			}
			
		//Test against our criteria
		for (String pswd : passwords ) {
			System.out.print("***** \n " + pswd + " \n");
			boolean hasNumber = false;
			boolean hasLetter = false;
			boolean hasSpecialChar = false;
			//boolean hasInvalidChar = false;
			
			for (int n = 0; n<pswd.length(); n++) {
				
				// Condition 1: Contains a number
				if ("1234567890".contains(pswd.substring(n, n+1))) {
					hasNumber=true;
					//System.out.println("Position "+n+" contains a number.");
				}
				
				// Condition 2: Contains a letter
				else if ("abcdeefghijklmnopqrstuvwxyz".contains(pswd.substring(n, n+1).toLowerCase())) {
					hasLetter=true;
					//System.out.println("Position "+n+" contains a letter.");
				}
				
				// Condition 3: Contains a special character
				else if ("!·$%&/()*+-?'_{},.-;:=".contains(pswd.substring(n, n+1))) {
					hasSpecialChar=true;
					//System.out.println("Position "+n+" contains a special character.");
				}
				else {
					//hasInvalidChar=true;
					//System.out.println("Position "+n+" contains a invalid character.");
					try {
					throw new InvalidCharacterException(pswd.substring(n, n+1));
					} catch (InvalidCharacterException e){
						e.toString();
					}
				}
			}
			
			//Test & Exception Handling 
			
			// I commented the -if- that was only for know the logic and then create the correct exception in condition numbers
			/* if (hasInvalidChar) {
				System.out.println("Invalid character");
			} else  if ( !hasNumber || !hasLetter || !hasSpecialChar ) {
				System.out.println("Missing criteria");
			} else {
				System.out.println("Valid Password");
			} */
			
			
			try {
				if ( !hasNumber ) { throw new NumberCriteriaException(pswd); } 
				else if ( !hasLetter ) { throw new LetterCriteriaException(pswd); }
				else if ( !hasSpecialChar ) { throw new SpecialCharCriteriaException(pswd); }
				else { System.out.println("Valid Password"); }
			} catch (NumberCriteriaException | LetterCriteriaException | SpecialCharCriteriaException e){
				System.out.println("Invalid Password");
				System.out.println(e.toString());
			}
		
		
		}
	}
}


	
	//My exceptions (outside of Main and its class)
	class InvalidCharacterException extends Exception {
		String ch;
		public InvalidCharacterException(String ch) {
			this.ch=ch;
		}
		public String toString() {
			return "InvalidCharacterException: " + ch;
		}
	}
	
	class NumberCriteriaException extends Exception {
		String password;
		public NumberCriteriaException(String password) {
			this.password=password;
		}
		public String toString() {
			return "NumberCriteriaException: " + password;
		}
	}
	
	class LetterCriteriaException extends Exception {
		String password;
		public LetterCriteriaException(String password) {
			this.password=password;
		}
		public String toString() {
			return "LetterCriteriaException: " + password;
		}
	}
	
	class SpecialCharCriteriaException extends Exception {
		String password;
		public SpecialCharCriteriaException(String password) {
			this.password=password;
		}
		public String toString() {
			return "SpecialCharCriteriaException: " + password;
		}
	}
	
	
	

	



//Read a file that checks the criteria for a password
//
//1. Read a file that contains multiple sets of passwords (use http://www.theonegenerator.com/ 
//to generate a set of test data)
//
//2. Verify that the password contains all of the following criteria:
	//1. A number
	//2. A letter
	//3. Special character (! @ #)
//
//3. Create three User Defined Exceptions for the corresponding criteria.
//
//4. If the password does not meet the criteria, create and throw the appropriate exception
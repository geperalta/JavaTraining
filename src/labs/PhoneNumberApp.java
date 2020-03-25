package labs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PhoneNumberApp {

	public static void main(String[] args) {
		// This will read a text file and will retrieve a phone number 
		
		String filename = "/Users/geperalta/Documents/eclipse-workspace/JavaTraining/Files/PhoneNumber.txt";
		File file = new File(filename);
		String phoneNum = null;
		
		
		
			try {
				
				BufferedReader br = new BufferedReader(new FileReader (file));
				phoneNum = br.readLine();
				br.close();
				
			} catch (FileNotFoundException e) {
				System.out.println("ERROR: File cannot found");
			} catch (IOException e) {
				System.out.println("ERROR: File cannot be readed");
			}

		
		
		// Valid phone number:
					// 10 digits long
					// Area code cannot be 0 or 9
					// There can be 911 in the phone
		
		try {
			if(phoneNum.length() != 10) {
				throw new TenDigitsException(phoneNum);
			}
			
			if (phoneNum.substring(0, 1).equals("0")|| phoneNum.substring(0, 1).equals("9")) {
				throw new AreaCodeException(phoneNum);
			}
			
			//the 911
			for( int n=0; n<(phoneNum.length()-2); n++ ) {
				if( phoneNum.subSequence(n, n+1).equals("9") ){
					if( phoneNum.subSequence(n+2, n+3).equals("1") ) {
						throw new EmergencyException(phoneNum);
					}
				}
			}
			
			
			System.out.println(phoneNum);
		} catch (TenDigitsException e) {
			System.out.println("ERROR: Phone number is not 10 digits!");
			System.out.println(e.toString());
		} catch (AreaCodeException e) {
			System.out.println("ERROR: Phone number has invalid area code");
			System.out.println(e.toString());
		} catch (EmergencyException e) {
			System.out.println("ERROR: Invalid 911 sequence found");
			System.out.println(e.toString());
		}
		
	}

}



class TenDigitsException extends Exception {
	String phoneNum;
	//make a constructor for the exception class
	TenDigitsException(String phoneNum){
		this.phoneNum = phoneNum;
	}
	public String toString() {
		return ("TenDigitException: " + phoneNum);
	}
}

class AreaCodeException extends Exception {
	String phoneNum;
	AreaCodeException(String phoneNum){
		this.phoneNum = phoneNum;
	}
	public String toString() {
		return ("AreaCodeException: " + phoneNum);
	}
}

class EmergencyException extends Exception {
	String phoneNum;
	EmergencyException(String phoneNum){
		this.phoneNum = phoneNum;
	}
	public String toString() {
		return ("EmergencyException: " + phoneNum);
	}
}

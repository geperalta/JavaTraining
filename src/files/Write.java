package files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Write {

	public static void main(String[] args) {
		// 1. Define the path that we want to write
		String filename = "/Users/geperalta/Documents/eclipse-workspace/JavaTraining/Files/FileToWrite.txt";
		String message = "I'm writing this data from java to a file";
		
		// 2. Create the file java & bring the library
		File file = new File(filename);
		
		
		try {
			
			// 3. Open the file & bring the library & surround it with a try/catch on FileWriter
			FileWriter fw = new FileWriter(file);
			
			// 4. Write the file
			fw.write(message);
			
			// 5. Close the resources 
			fw.close();
			
		} catch (IOException e) {
			System.out.println("ERROR: Could not read the file: " + filename);
			e.printStackTrace();
		} finally {
			System.out.println("Closing FileWriter successfully"); 
		}
		

	}	

}
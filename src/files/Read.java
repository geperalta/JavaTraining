package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Read {

	public static void main(String[] args) {
		// 1.Define the file (path) that we want to read.
		String filename = "/Users/geperalta/Documents/eclipse-workspace/JavaTraining/Files/FileToRead.txt";
		String text=null;
		
		// 2.Create the file java and import the java.io.File
		File file = new File(filename);
		
		
		
		try {
			// 3.Open the file and import the buffered and file library 
						// 4.1.We add a try-catch for the FileReader in case is not found
			BufferedReader br = new BufferedReader ( new FileReader(file) );
			
			// 4.Read the file
						// 4.2.WE add catch of the readLine to the for the surrounding try-catch BufferedReader  in case the type is not readable 
					 text = br.readLine();
			
			// 5.Close the resources
					 br.close();
					 
		} catch (FileNotFoundException e) {
			System.out.println("ERROR: File not found: " + filename);
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("ERROR: Could not read the data: " + filename);
			e.printStackTrace();
		} finally {
			System.out.println("Finished reading the file");
		}
		
						//4.3. To use the variable text we need to define the variable outside the try block
		System.out.println(text);
	
	}

}
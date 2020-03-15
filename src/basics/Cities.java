package basics;

public class Cities {

	public static void main(String[] args) {
		// Declare and define an array
		String[] cities = {"San Francisco","Chetumal","Tokio","Pujiltic"};
		System.out.println(cities[3]);
		
		// Declare & define the array (only the size)
		String[] states1 = new String[5];
		states1[0] = "California";
		states1[1] = "Chiapas";
		states1[2] = "Jalisco";
		states1[3] = "Texas";
		states1[4] = "Baja Sur";
		System.out.println(states1[4]);
		
		//Declare array //countries va a ser un array
		String[] countries;
		
		//Define the array // countries va a ser el nuevo array con elementos de String
		countries = new String[3];
		countries[0] = "USA";
		countries[1] = "MEX";
		countries[2] = "Puelto Rico";
		System.out.println(countries[2]);
		
		System.out.println("***************************");
		
			// Declare & define the array (only the size)
		String[] states = new String[5];
		states[0] = "California";
		states[1] = "Chiapas";
		states[2] = "Jalisco";
		states[3] = "Texas";
		states[4] = "Baja Sur";
		
		//DO loop: enters the loop then test the condition
		int i=0;
		do {
		System.out.println("STATES: "+ states[i]);
		i=i+1;
		} while (i<5);
		
		//WHILE loop: test the condition first then makes the look
	    int n=0;
	    boolean foundState=false;
		while (!foundState){
		    String state=states[n];
		    if(state=="Texas"){
		      System.out.println("\nSTATE FOUND!");  
		      foundState=true;
		    }
		    n++;
		}
		
		//FOR loop: best structure for iterating through an array
		System.out.println("\nFOR loop"); 
		for (int x=0;x<5;x++){
	        System.out.println(states[x]); 	    
		}
 	}
}
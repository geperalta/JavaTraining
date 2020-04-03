package datastructures;

public class Arrays {

	public static void main(String[] args) {
		
		//****************
		// SINGLE ARRAYS
		String[] alphabet = {"a", "b", "c", "d", "e", "f", "g"};

		//The old Fashioned way
		System.out.println("The old fashioned way");
		for ( int i=0; i<5; i++ ) {
			System.out.print(alphabet[i] + " ");
		}
		
		//Using the property .length
		System.out.println("\n\nUsing the property .length");
		int size = alphabet.length;
		for ( int i=0; i<size; i++ ) {
			System.out.print(alphabet[i] + " ");
		}
		
		//Using the For-Each Method
		System.out.println("\n\nUsing the For-Each Method");
		for ( String letter : alphabet ) {
			System.out.print(letter + " ");
		}
		
		//***************
		// DOUBLE ARRAYS
		System.out.println("\n\nDouble Arrays");
		String[][] users = {
				{"Mich", "Phelps", "mp@mail.com", "1234"},
				{"Lui", "Hdz", "lh@mail.com", "5678"},
				{"Gerry", "Ruiz", "gr@mail.com", "0987"}
		};
		
		//Get the size of array
		int numOfUsers = users.length;
		int numOfFields = users[0].length;
		System.out.println("Number of users: " + numOfUsers);
		System.out.println("Number of fields: " + numOfFields);
		
		// Traverse the array
		//Old fashioned way
		System.out.println("\n\nUsing old fashioned double way");
		for (int i=0; i<numOfUsers; i++) {
			String name = users[i][0];
			String lastname = users[i][1];
			String mail = users[i][2];
			String phone = users[i][3];
			System.out.println(name+" "+lastname+" "+mail+" "+phone);
		}
		
		//Old fashioned way 2.0
		System.out.println("\n\nUsing old fashioned double way 2.0");
		for (int i=0; i<numOfUsers; i++) {
			for (int j=0; j<numOfFields; j++) {
				System.out.print(users[i][j] + " ");
			}
			System.out.println("");
		}
		
		//Using FOR-EACH
		System.out.println("\n\nUsing For-Each");
		for (String[] user : users) {
			//System.out.print("[ ");
			for (String field : user) {
				System.out.print(field + " ");
			}
			System.out.println("");
		}
		
		
		
		
	}

}

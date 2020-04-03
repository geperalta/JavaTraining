package datastructures;

import java.util.ArrayList;

public class Lists {

	public static void main(String[] args) {
		
		// 1. Create a collection (note: arrayList is an object)
		ArrayList<String> cities = new ArrayList<String>();
		
		// 2. Add some element
		cities.add("Tuxtla");
		cities.add("Guadalajara");
		cities.add("Bogotá");
		cities.add("Pinola");
		cities.add("Guadalajara");
		
		System.out.println(cities);
		
		// 3. Iterate the collection
		for (String city : cities) {
			System.out.println(city);
		}
		
		// 4. Get the size
		int size = cities.size();
		System.out.println("There are "+size+" elements in cities");
		
		// 5. Retrieve specific element
		System.out.println(cities.get(0));
		
		// 6. Remove 
		cities.remove(0);
		size = cities.size();
		System.out.println("Now there are "+ size + " elements in cities");
		for (String city : cities) {
			System.out.println(city);
		}
		

	}

}

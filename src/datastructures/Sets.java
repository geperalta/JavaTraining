package datastructures;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {

	public static void main(String[] args) {
		
		// LinkedHashSet - in the order they were entered
		// HashSet - complete random order
		// TreeSet - rearrange to natural order
		
		// SET - only for unique elements
		
		// 1. Define the collection
		Set<String> animals = new TreeSet<String>();
		
		// 2. Adding elements
		animals.add("dog");
		animals.add("pig");
		animals.add("hog");
		animals.add("cat");
		animals.add("snake");
		
		//System.out.println(animals.size() + " " + animals);
		
		animals.add("cat");
		animals.add("snake");
		animals.add("goose");
		
		System.out.println("Animals are: " + animals.size() + " " + animals);
		
		// Create a new set that we use for comparison
		
		Set<String> farmAnimals = new HashSet<String>();
		farmAnimals.add("chicken");
		farmAnimals.add("cow");
		farmAnimals.add("pig");
		farmAnimals.add("horse");
		farmAnimals.add("dog");
		
		System.out.println("Farm Animals are: "+ farmAnimals);
		
		// What is the INTERSECTION between animals AND farmAnimals "AND"
		// 1. Copy the existing set in a new set
		Set<String> intersectionSet = new HashSet<String>(animals);
		System.out.println("This is tne intersectionSet: " +intersectionSet);
		// 2. RETAIN only the elements that are also in the other set -farmAnimals- 
		intersectionSet.retainAll(farmAnimals);
		System.out.println("The INTERSECION is: "+ intersectionSet);
		
		// What is the UNION 
		Set<String> unionSet = new HashSet<String>(farmAnimals);
		unionSet.addAll(animals);
		System.out.println("The UNION is: "+ unionSet);
		
		// What is the DIFFERENCE (in animals BUT not in farmAnimals)
		Set<String> differenceSet = new HashSet<String>(animals);
		differenceSet.removeAll(farmAnimals);
		System.out.println("The difference is: "+differenceSet);
		

	}

}

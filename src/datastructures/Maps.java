package datastructures;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Maps {

	// Map
	// HashMap - random order
	// LinkedHashMap - in the input order
	// TreeMap - natural order
	
	
	public static void main(String[] args) {
		Map<Integer, String> hMap = new TreeMap<Integer, String>();
		
		mapUtil(hMap);

	}

	
	public static void mapUtil(Map<Integer,String> map){
		// 1. Add key-value pairs
		map.put(101, "Mike");
		map.put(201, "Luigi");
		map.put(53, "Eds");
		map.put(232, "Silvia");
		map.put(10, "Gerry");
		map.put(203, "Esteban Quito");
		
		// 2. Expose / access elements
		System.out.println("See all keys: " +map.keySet());
		System.out.println("See all key-values "+ map);
		
		// 3. Iterate through map of key-value pairs?
		for (int key : map.keySet()) {
			System.out.println("The key is: "+key+" and the Value is: "+ map.get(key));
		}
		
	}
	
	
}

package algorithms;

public class Search {

	//********* USE OF LINEAR SEARCH
	public static int linearsearch (int[] dataSet, int target) {
		for (int i=0; i<dataSet.length; i++) {
			if ( dataSet[i] == target ) {
				return i;
			}
		}
		return 404;
	}
	
	//********* USE OF BINARY SEARCH
	public static int binarySearch (int[] dataSet, int target, int start, int end) {
		//binary search ASSUMES a sorted array and can therefore continually split our search domain in half
		int midpoint = (int) Math.floor((start+end)/2);
		int value = dataSet[midpoint];
		System.out.println("Searching in between " + dataSet[start] + " and " + dataSet[end]);
		System.out.println("midpoint position is: "+midpoint);
		System.out.println("value: " + value);
		
		if ( target > value ) {
			System.out.println(target + " > " + value);
			return binarySearch(dataSet, target, midpoint, end);
			
		}
		else if ( target < value ) {
			System.out.println(target + " < " + value);
			return binarySearch(dataSet, target, start, midpoint);
			
		}
		System.out.println(target + " = " + value);
		return midpoint;
	}
	
	
	
}

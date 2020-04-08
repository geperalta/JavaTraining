package algorithms;


public class Demo {

	public static void main(String[] args) {
		int[] numbers = { 12, 45, 33, 232, 73, 43, 2 };
		int target = 73;
		
		int[] unsortedNumbers = { 3, 4, 6, 7, 12, 21, 44, 46, 51, 53, 58, 60, 67, 72, 73, 82, 89, 92, 94, 99 };
		//Arrays.sort(unsortedNumbers);
		
		
		// Call the linear function/method that searches for a specific number
		int pos = ( algorithms.Search.linearsearch(numbers, target) );
		System.out.println("The target is in position: "+ pos);
		
		System.out.println("");
		
		// Call the binary search
		int index = (algorithms.Search.binarySearch(unsortedNumbers, target, 0, unsortedNumbers.length-1) );
		System.out.println("The target " +target+ " is in position: " + index);
		
		// Call the sort
		algorithms.Sort.bubbleSort(numbers);
		
	}

}

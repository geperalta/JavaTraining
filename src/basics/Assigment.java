package basics;

public class Assigment {

	public static void main(String[] args) {
		 //Fibonnaci
		//System.out.println(fib(10));
	        for (int c=0; c<=5; c++) {
	        	System.out.print("The fibonnaci number for "+ c + " is: ");
	            System.out.println(fib(c));
        }

        //Write a function that takes a value N and returns the sum of 1 to N
        System.out.println(sum(5));
        
        // Factorial 
        //System.out.println(fact(5));
      		for(int c=1; c<=5; c++) {
      			System.out.print("The factorial for "+c+" is ");
      			System.out.println(fact(c));
      		}
      		
      	//Write 3 methods that return min, max and avg of an array
      		int[] numbers= {12, -45, 41, 1, 555};
      		//MIN
      		System.out.println("The Min in the array is: " + findMin(numbers) );
      		//MAX
      		System.out.println("The MAX in the array is: " + findMax(numbers) );
      		//AVERAGE
      		System.out.println("The AVG in the array is: " + findAvg(numbers) );
   }
	
	//METHODS
	//***************************
	//Minimum
	public static int findMin(int[] arr) {
		//suponemos que el primer elemt es el menor
		int min = arr[0];
			//un ciclo for para tener como comparar el index i con cada elemento del array
		for (int i=0; i<arr.length; i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		return min;
	}
	
	//Maximum
		public static int findMax(int[] arr) {
			int max = arr[0];
			for (int i=0; i<arr.length; i++) {
				if(arr[i]>max) {
					max=arr[i];
				}
			}
			return max;
		}
		
	//Average
				public static double findAvg(int[] arr) {
			
					int sum = 0;
		
					for (int i=0; i<arr.length; i++) {
						sum=sum + arr[i];
					}
					
					double avg=sum/(arr.length);
					return avg;
				}
	
	
	//***************************
   //fibonnaci
	// fib(0) = 0
	// fib(1) = 1
	// fib(2) = fib(0) + fib(1) = 0 + 1 = 1
	// fib(3) = fib(1) + fib(2) = 1 + 1 = 2
	// fib(4) = fib(2) + fib(3) = 1 + 2 = 3
	// fib(5) = fib(3) + fib(4) = 2 + 3 = 5
   public static int fib(int n){
	   if(n==0){
           return 0;
	   } else if(n==1){
           return 1;
       }
       return ( (fib(n-1))+(fib(n-2)) );
   }
   
   //***************************
   //Write a function that takes a value N and returns the sum of 1 to N
   // 0 + 1 = 1
   // 1 + 2 = 3
   // 3 + 3 = 6
   // 6 + 4 = 10
   // 10 + 5 = 15
   public static int sum(int c){
     int sum = 0;
     for (int i=0;i<=c;i++) {
    	System.out.print("The sum for "+i + " + " +sum + " is: ");
    	 sum = sum + i;
    	System.out.println(sum);
     }
     
     return (sum);  
	}
   
   //****************************
   // Factorial is the number multiplied for the previous
		// 1! = 1 * 1 = 1 
		// 2! = 2 * 1 = 2
		// 3! = 3 * 2 * 1 = 6
		// 4! = 4 * 3 * 2 * 1 = 24
		// 5! = 5 * 4 * 3 * 2 * 1 = 120 
   public static int fact(int n) {
		if ( n == 0 ){
			return 1;
			} 
	return ( fact(n-1)*n );
	}
   

}

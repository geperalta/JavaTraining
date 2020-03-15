package basics;

public class FactorialApp {

	public static void main(String[] args) {
		// Factorial is the number multiplied for the 
		// 1! = 1 * 1 = 1 
		// 2! = 2 * 1 = 2
		// 3! = 3 * 2 * 1 = 6
		// 4! = 4 * 3 * 2 * 1 = 24
		// 5! = 5 * 4 * 3 * 2 * 1 = 120 
		
		//System.out.println(fact(5));
		
		for(int c=1; c<=15; c++) {
			System.out.print("The factorial for "+c+" is ");
			System.out.println(fact(c));
		}

	}
	
	public static int fact(int n) {
		if ( n == 1 ){
			return 1;
			} else if ( n == 2 ){
				return 2;
			}
	return ( fact(n-1)*n );
	}

}

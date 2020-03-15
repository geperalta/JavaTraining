package basics;

public class numbersCalc {

	public static void main(String[] args) {
		System.out.println("The program is running");
		
		printName();
		
		int numA = 10;
		int numB = 20;
		addNumber(numA, numB);
		
		int product = multiplyNumber(numA, numB);
		// System.out.println("The product of numbers "+ numA + " and " + numB + " is " + multiplyNumber(numA, numB));
		System.out.println("The product of numbers "+ numA + " and " + numB + " is " + product);
		
	}
	
	static void printName() {
		System.out.println("My name is Gerry");
	}
	
	static void addNumber(int numberA, int numberB) {
		//This function will add two numbers
		int sum = numberA + numberB;
		System.out.println("The add of "+ numberA + " and " + numberB + " is " + sum);
	}
	
	static int multiplyNumber(int valueA, int valueB) {
		int product = valueA * valueB;
		return product;
	}
	
}


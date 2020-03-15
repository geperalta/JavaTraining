package basics;

public class Weather {
	public static void main(String[] args) {
		//This program will give suggestions of what to wear based on the weather (temperature and sun condition)
	
		int temperature = 45;
		String sunCondition = "Overcast";
		
		if (temperature > 80) {
			System.out.println("Its pleasant. Wear shots and t-shirt");
		}
		else if ((temperature > 60) & (sunCondition == "Sunny")) {
			System.out.println("Its a little cooler. Wear a long sleeve tshirt and jeans");
			System.out.println("Wear a hat to keep the sun out of your eyes");
		}
		else if((temperature > 50)||(sunCondition =="overcast")) {
			System.out.println("This is a cool day. Be sure to wear warmer clothes");
		}
		
		else {
			System.out.println("Its a cold day. Wear a sweater");
		}
		System.out.println("The program is ending");
	}

}

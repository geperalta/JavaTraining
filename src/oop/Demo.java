package oop;

//What about binding attributes and properties together? 
 class Person {
	 String name;
	 String email;
	 String phone;
	 
	 void walk() {
		 System.out.println(name +" is waling.");
	 }
	 
	 void eat() {
		 System.out.println(name + " ask food ");
	 }
	 
	 void sleep() {
		 System.out.println(name + " is sleeping.");
	 }
	 
 }

public class Demo {

	public static void main(String[] args) {
		//instantiating an object
		Person person1 = new Person();
		//define some properties
		person1.name = "Mau";
		person1.email = "mau@gmail.com";
		person1.phone = "9612546283";
		//abstraction
		person1.walk();
		person1.eat();
		person1.sleep();
		
		Person person2 = new Person();
		person2.name="Sarah";
		person2.walk();
		
		/*
		 * 
		 //The long way
		//Person
		//Attributes, variables, adjectives, descriptors
		String name = "Mau";
		String email = "mau@mail.com";
		String phone = "9612546583";
		
		//Action, activity, behavior
			//System.out.println(name + " is walking.");
		walking(name);
		System.out.println(name + " is eating.");
		
		//What if we have another person?
		String name2 = "Lui";
		String email2 = "lui@mail.com";
		String phone2 = "885513548";
		
		//Action, activity, behavior
			//System.out.println(name2 + " is walking.");
		walking(name2);
		System.out.println(name2 + " is eating.");

		//What about binding attributes and properties together? 
	}

	//enhancing by adding methods to minimize code
	static void walking(String name) {
		System.out.println(name + " is walking.");
		*
		*/
	}
	
}

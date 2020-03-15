package assigmentOop;

public class StudentDB {

	public static void main(String[] args) {
		
		//Create a new object Student pointing to Student
		Students stu1 = new Students("Luis","11115555");
		Students stu2 = new Students("Ana","22228888");
		
		stu1.setCity("Tuxtla");
		stu1.setState("Chiapas");
		stu1.setPhone("9612546283");
		
		System.out.println(stu1.toString());
		System.out.println(stu2.toString());
		
		
		stu1.enroll("Math");
		stu1.enroll("Spanish");
		stu1.enroll("History");
	
		stu1.showCourses();
		stu1.checkBalance();
		stu1.payTuition(600);
		stu1.checkBalance();
		
		
	}
}
	

/*
Create a Student Database with the following attributes:
- New Student constructor that takes name and SSN in the arguments
- Automatically create an email ID based on the name
- Set a private static ID
- Generate a user ID that is combination of Static ID, random 4-digit number between 1000 and 9000, and last 4 of SSN
- Methods: enroll(), pay(), checkBalance(), toString(), showCourses()
- Use encapsulation to set variables (phone, city, state)
*/
package assigmentOop;

public class Students {

	private String name;
	private String SSN;
	private String email;
	private static int iD = 10;
	private String userID;
	private String phone;
	private String city;
	private String state;
	
	private String courses = "";
	private int balance = 0;
	private static final int costOfCourse = 800;
	
	
	
	public Students (String name, String SSN) {
		this.name = name;
		this.SSN = SSN;
		setEmail();
		userID();
	}
	
	
//	public String getName () {
//		return name;
//	}
//	public String getSSN () {
//		return SSN;
//	}
//	public String getEmail () {
//		return email;
//	}
//	public String getUserID () {
//		return userID;
//	}
	

	//auto setter getter
	public String getPhone() {
		return phone;
	}

	
	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}
	
	
	
	
	public void setEmail() {
		String mail = name.toLowerCase() + iD +"@gmail.com";
		iD++;
		this.email = mail;
	}

	public void userID() {
		int random = (int) (Math.random()*1000+9000);
		String userno = iD +""+ random + SSN.substring(4, 8) ;
		this.userID = userno;
		System.out.println("The userID is:" + userno );
	}
	
	public void enroll(String courses) {
		this.courses = this.courses + "\n" +courses; 	//in this way we create a course every time we enroll and add it in a new line
		balance = balance + costOfCourse;				//with this every enroll we add we also add the cost to the balance
	}
	public void payTuition(int amount) {
		balance = balance - amount;
		System.out.println("Payment of: $" + amount);
	}
	public void showCourses() {
		System.out.println("Your courses, "+name+" are: "+ courses);
	}
	public void checkBalance() {
		System.out.println("Your balance, "+name+" is: $"+balance);
	}
	



	@Override
	public String toString() {
		return "Students [name=" + name + ", SSN=" + SSN + ", email=" + email + ", userID=" + userID + ", phone="
				+ phone + ", city=" + city + ", state=" + state + "]";
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
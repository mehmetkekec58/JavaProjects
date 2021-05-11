package homework3day;

public class Student extends User {
	 private String firstName;
	 private String lastName;
     private String number;
     private String age;
 
 public Student() {
	 
 }

public Student(String firstName, String lastName, String number, String age) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
	this.number = number;
	this.age = age;
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public String getNumber() {
	return number;
}

public void setNumber(String number) {
	this.number = number;
}

public String getAge() {
	return age;
}

public void setAge(String age) {
	this.age = age;
}


 
 

}

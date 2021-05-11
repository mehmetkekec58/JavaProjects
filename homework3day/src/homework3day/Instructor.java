package homework3day;

public class Instructor extends User{
	private int id;
	private String branch;
	private String firstName;
	private String lastName;

public Instructor() {
	
}

public Instructor(int id, String branch, String firstName, String lastName) {
	super();
	this.id = id;
	this.branch = branch;
	this.firstName = firstName;
	this.lastName = lastName;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getBranch() {
	return branch;
}
public void setBranch(String branch) {
	this.branch = branch;
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

 

}

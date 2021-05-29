package homework4_3.entities;

import java.time.LocalDate;

public class Gamer {
private int id;
private String firstName;
private String lastName;
private LocalDate date;
private String nationalityId;

public Gamer() {}

public Gamer(int id, String firstName, String lastName, LocalDate date, String nationalityId) {
	super();
	this.id = id;
	this.firstName = firstName;
	this.lastName = lastName;
	this.date = date;
	this.nationalityId = nationalityId;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
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

public LocalDate getDate() {
	return date;
}

public void setDate(LocalDate date) {
	this.date = date;
}

public String getNationalityId() {
	return nationalityId;
}

public void setNationalityId(String nationalityId) {
	this.nationalityId = nationalityId;
}




}

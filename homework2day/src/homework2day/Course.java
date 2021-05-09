package homework2day;

public class Course {
 private int id;
 private String name;
 private String teacher;
 
 public void Course() {
	 
 }
 
public Course(int id, String name, String teacher) {
	super();
	this.id = id;
	this.name = name;
	this.teacher = teacher;
}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getTeacher() {
	return teacher;
}
public void setTeacher(String teacher) {
	this.teacher = teacher;
}
 
}

package homework3day;

public class UserManager{
	
	public void register(Instructor instructor) {
		System.out.println(instructor.getFirstName()+" "+instructor.getLastName()+" adlý eðitmen kaydoldu.");
	}
	public void register(Student student) {
		System.out.println(student.getFirstName()+ " "+ student.getLastName()+" adlý öðrenci kaydoldu.");
	}
}

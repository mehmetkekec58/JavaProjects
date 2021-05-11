package homework3day;

public class Main {

	public static void main(String[] args) {
		
Student student1= new Student();
student1.setId(1);
student1.setFirstName("Mehmet");
student1.setLastName("Kekeç");
student1.setEmail("deneme@deneme.com");
student1.setNumber("12434");
student1.setPassword("111111111111");
student1.setAge("18");

Student student2= new Student();
student2.setId(2);
student2.setFirstName("Ahmet");
student2.setLastName("Gündüz");
student2.setEmail("hey@hey.com");
student2.setNumber("9999");
student2.setPassword("5455545");
student2.setAge("14");

Instructor instructor1 = new Instructor();
instructor1.setId(1);
instructor1.setEmail("de@de.com");
instructor1.setFirstName("Eren");
instructor1.setLastName("Taşçı");
instructor1.setPassword("22222222222");
instructor1.setBranch("Kimya");
	
Instructor instructor2 = new Instructor();
instructor2.setId(2);
instructor2.setEmail("ha@ha.com");
instructor2.setFirstName("Duygu");
instructor2.setLastName("Öz");
instructor2.setPassword("488888");
instructor2.setBranch("Biyoloji");


UserManager userManager = new UserManager();
userManager.register(instructor1);
userManager.register(student1);


InstructorManager instructorManager = new InstructorManager();
instructorManager.update(instructor2);

StudentManager studentManager = new StudentManager();
studentManager.update(student2);


	}

}

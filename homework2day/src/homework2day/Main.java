package homework2day;



public class Main {

	public static void main(String[] args) {
	
		Course course = new Course(1, "java kamp�", "Engin Demiro�");
		Course course2 = new Course(2, "C# kamp�", "Ay�e Y�lmaz");
		Course course3 = new Course(3, "PHP kamp�", "Veli Ku�");
		Course course4 = new Course(4, "Nodojs kamp�", "Sude Sui�mez");
		Member member = new Member(1,"Mehmet", "Keke�");
		Member member2 = new Member(2, "Ahmet", "G�nd�z");
		Member member3 = new Member(3,"Muhammet", "Aslan");
	    Member member4 = new Member(4,"Atilla", "Han");
		
Course[] courses = {course,course2,course3,course4};
Member[] members = {member,member2,member3,member4};

for(Course course1 : courses) {
	System.out.println("Kurs ad�: "+course1.getName()+", Hocas�: "+ course1.getTeacher());
	
}

for(Member member1 : members) {
	System.out.println("�ye ad� soyad�: "+ member1.getFirstname()+" "+member1.getLastname());
}



    CourseManager courseManager = new CourseManager();
  
    courseManager.add(course3);
    courseManager.delete(course4);
    
    
    MemberManager memberManager = new MemberManager();
    memberManager.add(member3);
    memberManager.delete(member4);

	}

}

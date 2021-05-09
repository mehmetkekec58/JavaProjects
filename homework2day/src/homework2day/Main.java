package homework2day;



public class Main {

	public static void main(String[] args) {
	
		Course course = new Course(1, "java kampı", "Engin Demiroğ");
		Course course2 = new Course(2, "C# kampı", "Ayşe Yılmaz");
		Course course3 = new Course(3, "PHP kampı", "Veli Kuş");
		Course course4 = new Course(4, "Nodojs kampı", "Sude Suiçmez");
		Member member = new Member(1,"Mehmet", "Kekeç");
		Member member2 = new Member(2, "Ahmet", "Gündüz");
		Member member3 = new Member(3,"Muhammet", "Aslan");
	    Member member4 = new Member(4,"Atilla", "Han");
		
Course[] courses = {course,course2,course3,course4};
Member[] members = {member,member2,member3,member4};

for(Course course1 : courses) {
	System.out.println("Kurs adı: "+course1.getName()+", Hocası: "+ course1.getTeacher());
	
}

for(Member member1 : members) {
	System.out.println("Üye adı soyadı: "+ member1.getFirstname()+" "+member1.getLastname());
}



    CourseManager courseManager = new CourseManager();
  
    courseManager.add(course3);
    courseManager.delete(course4);
    
    
    MemberManager memberManager = new MemberManager();
    memberManager.add(member3);
    memberManager.delete(member4);

	}

}

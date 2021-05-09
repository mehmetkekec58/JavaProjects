package homework2day;

public class MemberManager {
public void add(Member member) {
	System.out.println("Üye eklendi: "+ member.getFirstname()+" "+member.getLastname());
}
public void delete(Member member) {
	System.out.println("Üye silindi: "+ member.getFirstname()+" "+member.getLastname());
}
}

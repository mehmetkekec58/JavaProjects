package homework4_3.abstracts;

import homework4_3.entities.Gamer;

public class BaseGamerService implements GamerService {

	@Override
	public void add(Gamer gamer) {
		System.out.println("Veritabanına eklendi: "+ gamer.getFirstName()+" "+ gamer.getLastName());		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("Veritabanında güncellendi: "+ gamer.getFirstName()+" "+ gamer.getLastName());
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Veritabanından silindi: "+ gamer.getFirstName()+" "+ gamer.getLastName());
		
	}

}

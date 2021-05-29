package homework4_3.abstracts;

import homework4_3.entities.Gamer;

public class BaseGamerService implements GamerService {

	@Override
	public void add(Gamer gamer) {
		System.out.println("Veritaban�na eklendi: "+ gamer.getFirstName()+" "+ gamer.getLastName());		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("Veritaban�nda g�ncellendi: "+ gamer.getFirstName()+" "+ gamer.getLastName());
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Veritaban�ndan silindi: "+ gamer.getFirstName()+" "+ gamer.getLastName());
		
	}

}

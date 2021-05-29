package homework4_3.concrete;

import homework4_3.abstracts.GamerCheckService;
import homework4_3.entities.Gamer;

public class GamerCheckServiceManager implements GamerCheckService {

	@Override
	public boolean CheckIfRealPerson(Gamer gamer) {
		
		return true;
	}

}

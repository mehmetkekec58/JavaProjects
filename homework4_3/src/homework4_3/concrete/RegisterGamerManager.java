package homework4_3.concrete;

import homework4_3.abstracts.BaseGamerService;
import homework4_3.abstracts.GamerCheckService;
import homework4_3.entities.Gamer;

public class RegisterGamerManager extends BaseGamerService{
private GamerCheckService gamerCheckService;


	public RegisterGamerManager(GamerCheckService gamerCheckService) {
	super();
	this.gamerCheckService = gamerCheckService;
}


	@Override
	public void add(Gamer gamer) {
		if(this.gamerCheckService.CheckIfRealPerson(gamer)) {
			super.add(gamer);
		}else {
			System.out.println("Böyle bir kiþi yok");
		}
		
	}


	public GamerCheckService getGamerCheckService() {
		return gamerCheckService;
	}


	public void setGamerCheckService(GamerCheckService gamerCheckService) {
		this.gamerCheckService = gamerCheckService;
	}
	
	

}

package homework4_3.concrete;

import homework4_3.abstracts.GameSaleService;
import homework4_3.entities.Campaign;
import homework4_3.entities.Game;
import homework4_3.entities.Gamer;

public class GameSaleManager implements GameSaleService {



	@Override
	public void sale(Game[] games, Gamer[] gamers) {	
	for(Gamer gamer: gamers) {
		System.out.println(gamer.getFirstName()+" adlý oyuncuya satýlan oyunlar: ");
	for(Game game: games) 
	System.out.println(game.getGameName());
	
	}}




	@Override
	public void sale(Game[] games, Gamer[] gamers, Campaign[] campaigns) {
		System.out.println("Þu kampanyalar Uygulandý: ");
		for(Campaign campaign: campaigns)
			System.out.println(campaign.getName()+" ");
		 
		for(Gamer gamer: gamers) {
			System.out.println(gamer.getFirstName()+" "+gamer.getLastName()+ " adlý oyuncuya kampanyalý þu oyunlar satýldý: ");
		for(Game game: games) 
		    System.out.println(game.getGameName());
		}
		
	}

}

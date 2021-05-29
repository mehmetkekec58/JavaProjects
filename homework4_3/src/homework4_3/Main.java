package homework4_3;


import java.time.LocalDate;

import homework4_3.abstracts.BaseGamerService;
import homework4_3.adapters.MernisServiceAdapter;
import homework4_3.concrete.CampaignManager;
import homework4_3.concrete.GameManager;
import homework4_3.concrete.GameSaleManager;
import homework4_3.concrete.GamerCheckServiceManager;
import homework4_3.concrete.RegisterGamerManager;
import homework4_3.entities.Campaign;
import homework4_3.entities.Game;
import homework4_3.entities.Gamer;

public class Main {

	public static void main(String[] args) {
		
	Game game1 = new Game(1,"Valorant","�ava�","Online 5 VS 5 sava�",50);
	Game game2 = new Game(2,"Subway Surfers","Macera","Trenlerin aras�nda ko�u oyunu",20);
	Game game3 = new Game(3,"battlefield 5","�ava�","Y�ksek grafikli �evrimi�i sava� oyunu",120);

	
	Gamer gamer1 = new Gamer(1,"Mehmet","Keke�",LocalDate.of(2001,1,1),"12345356454");
	Gamer gamer2 = new Gamer(2,"Selim","Karaca",LocalDate.of(1999,5,3),"88888888888");
	Gamer gamer3 = new Gamer(2,"Erhan","Ta�",LocalDate.of(1990,12,1),"77777663235");
	
	
	Campaign campaign1 = new Campaign(1,"Yaz tatili kampanyas�","Yaz mevsiminin oyunun keyfini ��kar",20, LocalDate.of(2021,8,30));
	Campaign campaign2 = new Campaign(2,"Bahar kampanyas�","Bu bahar oyunlarla zaman�n� ge�irmenin tam s�ras�",10, LocalDate.of(2021,5,6));
	Campaign campaign3 = new Campaign(3,"�ndirim sezonu kampanyas�","bu kampanyalar ka�maz",30, LocalDate.of(2022,7,1));
	
	Game[] games = {game1,game3};
	Gamer[] gamers = {gamer1,gamer2};
	Campaign[] campaigns = {campaign1,campaign3,campaign2};
	
    BaseGamerService registerGamerManager= new RegisterGamerManager(new MernisServiceAdapter());
	registerGamerManager.add(gamer1);
	
	BaseGamerService baseGamerService = new BaseGamerService();
	baseGamerService.update(gamer2);
	baseGamerService.delete(gamer3);
	
	
	GameManager gameManager = new GameManager();
	gameManager.add(game3);
	gameManager.update(game2);
	gameManager.delete(game3);
	
	CampaignManager campaignManager = new CampaignManager();
	campaignManager.add(campaign3);
	campaignManager.update(campaign3);
	campaignManager.delete(campaign3);
	
	
	
	GameSaleManager gameSaleManager = new GameSaleManager();
	gameSaleManager.sale(games, gamers);
	gameSaleManager.sale(games,gamers, campaigns);
	
	
	
	
	
	
	}

}

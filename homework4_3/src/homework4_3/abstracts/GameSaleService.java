package homework4_3.abstracts;

import homework4_3.entities.Campaign;
import homework4_3.entities.Game;
import homework4_3.entities.Gamer;

public interface GameSaleService {
void sale(Game[] games, Gamer[] gamers);
void sale(Game[] games, Gamer[] gamers,Campaign[] campaigns);
}

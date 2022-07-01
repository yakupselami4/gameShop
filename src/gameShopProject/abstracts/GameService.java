package gameShopProject.abstracts;

import gameShopProject.entities.Customer;
import gameShopProject.entities.Game;

public interface GameService {
	
	void save(Game game);
	
	void sellGame(Customer customer, Game game);
}

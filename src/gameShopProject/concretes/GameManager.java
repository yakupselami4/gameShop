package gameShopProject.concretes;

import gameShopProject.abstracts.GameService;
import gameShopProject.entities.Customer;
import gameShopProject.entities.Game;

public class GameManager implements GameService{

	
	public void save(Game game) {
		System.out.println("Oyun sisteme kayit edildi: "+game.getGameName());
	}

	@Override
	public void sellGame(Customer customer, Game game) {
		System.out.println(game.getGameName()+" isimli oyunu satin aldiniz: "+customer.getFirstName());
	}

}

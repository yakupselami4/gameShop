package gameShopProject;


import gameShopProject.adapters.MerniceServiceAdapter;
import gameShopProject.concretes.CampaignManager;
import gameShopProject.concretes.CustomerManager;
import gameShopProject.concretes.GameManager;
import gameShopProject.entities.Campaign;
import gameShopProject.entities.Customer;
import gameShopProject.entities.Game;

public class Main {

	public static void main(String[] args) throws Exception {
		Customer customer1 = new Customer(1,"yakup selami","öztürk",2000,"61051346028");
		Game game1 = new Game(1,"Hades",45);
		Campaign campaign1= new Campaign("Yaz Indirimi",20,"30.06.2022","30.09.2022");
		
		MerniceServiceAdapter adapter = new MerniceServiceAdapter();
		//CustomerCheckService adapter1 = new CustomerCheckService();
		
		CustomerManager customerManager = new CustomerManager(adapter);
		customerManager.save(customer1);
		
		GameManager gameManager = new GameManager();
		gameManager.save(game1);
		gameManager.sellGame(customer1,game1);
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.addCampaign(campaign1);
		campaignManager.deleteCampaign(campaign1);
		campaignManager.updateCampaign(campaign1);

	}

}

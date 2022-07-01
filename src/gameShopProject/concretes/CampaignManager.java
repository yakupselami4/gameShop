package gameShopProject.concretes;

import gameShopProject.abstracts.CampaignService;
import gameShopProject.entities.Campaign;

public class CampaignManager implements CampaignService{

	@Override
	public void addCampaign(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+" isimle kampanyanız sisteme tanımlanmıştır!");		
	}

	@Override
	public void deleteCampaign(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+" isimle kampanyanız sistemden silinmiştir!");
		
	}

	@Override
	public void updateCampaign(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+" isimle kampanyanız sistemde güncellenmiştir!");
		
	}

}

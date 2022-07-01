package gameShopProject.entities;

public class Campaign {
	private String campaignName;
	private int discountRate;
	private String startingDate;
	private String finishingDate;
	
	public Campaign() {
		
	}

	public Campaign(String campaignName, int discountRate, String startingDate, String finishingDate) {
		super();
		this.campaignName = campaignName;
		this.discountRate = discountRate;
		this.startingDate = startingDate;
		this.finishingDate = finishingDate;
	}

	
	
	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public int getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(int discountRate) {
		this.discountRate = discountRate;
	}

	public String getStartingDate() {
		return startingDate;
	}

	public void setStartingDate(String startingDate) {
		this.startingDate = startingDate;
	}

	public String getFinishingDate() {
		return finishingDate;
	}

	public void setFinishingDate(String finishingDate) {
		this.finishingDate = finishingDate;
	}
}

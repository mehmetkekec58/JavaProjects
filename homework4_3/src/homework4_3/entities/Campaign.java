package homework4_3.entities;

import java.time.LocalDate;

public class Campaign {
private int id;
private String name;
private String campaignDescription;
private int discountRate;
private LocalDate endDate;

public Campaign() {}

public Campaign(int id, String name, String campaignDescription, int discountRate,LocalDate endDate) {
	super();
	this.id = id;
	this.name = name;
	this.campaignDescription = campaignDescription;
	this.discountRate = discountRate;
	this.endDate = endDate;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getCampaignDescription() {
	return campaignDescription;
}

public void setCampaignDescription(String campaignDescription) {
	this.campaignDescription = campaignDescription;
}

public int getDiscountRate() {
	return discountRate;
}

public void setDiscountRate(int discountRate) {
	this.discountRate = discountRate;
}

public LocalDate getEndDate() {
	return endDate;
}

public void setEndDate(LocalDate endDate) {
	this.endDate = endDate;
}



}

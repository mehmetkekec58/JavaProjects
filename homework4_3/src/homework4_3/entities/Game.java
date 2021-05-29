package homework4_3.entities;

public class Game {
private int id;
private String gameName;
private String category;
private String gameDescription;
private double price;

public Game() {}

public Game(int id, String gameName, String category, String gameDescription, double price) {
	super();
	this.id = id;
	this.gameName = gameName;
	this.category = category;
	this.gameDescription = gameDescription;
	this.price = price;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getGameName() {
	return gameName;
}

public void setGameName(String gameName) {
	this.gameName = gameName;
}

public String getCategory() {
	return category;
}

public void setCategory(String category) {
	this.category = category;
}

public String getGameDescription() {
	return gameDescription;
}

public void setGameDescription(String gameDescription) {
	this.gameDescription = gameDescription;
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}


}

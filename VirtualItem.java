package online_shopping_game;

public class VirtualItem {
	
	private int itemID;
	private String name;
	private double price;
	private int points;
	
	
	public VirtualItem(int itemID, String name, double price, int points) {
		super();
		this.itemID = itemID;
		this.name = name;
		this.price = price;
		this.points = points;
	}


	public int getItemID() {
		return itemID;
	}


	public void setItemID(int itemID) {
		this.itemID = itemID;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public int getPoints() {
		return points;
	}


	public void setPoints(int points) {
		this.points = points;
	}


	@Override
	public String toString() {
		return "Item: \nID: " + itemID + "\tName: " + name + "\tPrice: " + price + "\tPoints: " + points;
	} 
	
	
	
	

}

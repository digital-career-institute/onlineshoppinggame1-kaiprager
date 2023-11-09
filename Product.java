package online_shopping_game;

public class Product extends VirtualItem {
	
	private String description;
	
	public Product(int itemID, String name, double price, int points, String description) {
		super(itemID, name, price, points);
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return super.toString() + "\tDescription: " + description;
	}

	
	
	

}

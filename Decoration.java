package online_shopping_game;

public class Decoration extends VirtualItem {
	
	private String theme;

	public Decoration(int itemID, String name, double price, int points, String theme) {
		super(itemID, name, price, points);
		this.theme = theme;
	}

	public String getTheme() {
		return theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

	@Override
	public String toString() {
		return super.toString() + "\tDecoration Theme: " + theme;
	}
	
	
	public void displayDecoration() {
		System.out.println("Decoration theme: " + theme);
		System.out.println("Now you have decorated everything to look pleasently!");
	}
	

	

}

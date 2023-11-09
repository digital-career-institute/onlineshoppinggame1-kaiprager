package online_shopping_game;

import java.util.ArrayList;

public class StoreItems {
	
	private ArrayList<VirtualItem> availablePowerUps;
    private ArrayList<VirtualItem> availableDecorations;
    private ArrayList<Product> availableProducts;
	
	public StoreItems() {
		availablePowerUps = new ArrayList<>();
        availableDecorations = new ArrayList<>();
        availableProducts = new ArrayList<>();
		initializeItems();
	}
	
	private void initializeItems() {
	    availablePowerUps.add(new PowerUp(1, "Double Points PowerUp", 10.0, 0, "Double points for each purchase"));
	    availablePowerUps.add(new PowerUp(2, "Extra Life PowerUp", 15.0, 0, "Gain an extra life"));

	    availableDecorations.add(new Decoration(3, "Space Theme Decoration", 5.0, 5, "Space"));
	    availableDecorations.add(new Decoration(4, "Fantasy Theme Decoration", 7.0, 7, "Fantasy"));

	    availableProducts.add(new Product(5, "Walkman", 60.0, 10, "High-quality Walkman"));
	    availableProducts.add(new Product(6, "Cassette Recorder", 30.0, 8, "Affordable Cassette Recorder"));
	    availableProducts.add(new Product(7, "VCR", 80.0, 10, "High-quality VCR"));
	    availableProducts.add(new Product(8, "Record Player", 30.0, 8, "Affordable Record Player"));
	    availableProducts.add(new Product(9, "LP", 15.0, 8, "The new album by Kate Bush"));
	}
	
    public ArrayList<VirtualItem> getAvailablePowerUps() {
    	
        return new ArrayList<>(availablePowerUps);
    }

    public ArrayList<VirtualItem> getAvailableDecorations() {
    	
        return new ArrayList<>(availableDecorations);
    }

    public ArrayList<Product> getAvailableProducts() {
    	
        return new ArrayList<>(availableProducts);
    }

}

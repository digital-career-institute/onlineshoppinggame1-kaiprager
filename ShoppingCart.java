package online_shopping_game;

import java.util.ArrayList;

public class ShoppingCart {
	
	private ArrayList<VirtualItem> cart;
	
	public ShoppingCart() {
		cart = new ArrayList<>();
	}
	
	public void addToCart(VirtualItem item) {
		cart.add(item);
	}
	
	public void displayCart() {
		System.out.println("++++ Shopping Cart ++++");
		
		for(VirtualItem item : cart) {
			System.out.println(item);
			System.out.println("------------------------------");
		}
	}

	public double calculateTotalPrice() {
		double totalPrice = 0;
		
		for(VirtualItem item : cart) {
			totalPrice += item.getPrice();
		}
		
		return totalPrice;
	}
	
	public int calculateTotalPoints() {
		int totalPoints = 0;
		
		for(VirtualItem item : cart) {
			totalPoints += item.getPoints();
		}
		
		return totalPoints;
	}
}

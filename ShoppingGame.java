package online_shopping_game;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ShoppingGame {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		StoreItems itemStore = new StoreItems();
		ShoppingCart shoppingCart = new ShoppingCart();

		int playerPoints = 100;

		while (true) {
			try {
				displayMenu();

				int choice = getIntInput();

				switch (choice) {

				case 1:
					buyItems(itemStore.getAvailablePowerUps(), shoppingCart, playerPoints);
					break;

				case 2:
					buyItems(itemStore.getAvailableDecorations(), shoppingCart, playerPoints);
					break;

				case 3:
					buyItems(itemStore.getAvailableProducts(), shoppingCart, playerPoints);
					break;

				case 4:
					shoppingCart.displayCart();
					break;

				case 5:
					displayTotalPoints(playerPoints);
					break;

				case 6:
					System.out.println("Thanks for playing!");
					System.exit(0);
					break;

				default:
					System.err.println("Invalid choice. Please try again.");
				}

			} catch (InputMismatchException e) {
				System.err.println("Invalid input. Please enter a number.");
				scanner.nextLine();
			}

		}
	}

	private static void displayMenu() {

		System.out.println("++++ Shopping Game ++++");
		System.out.println("1. Buy PowerUps");
		System.out.println("2. Buy Decorations");
		System.out.println("3. Buy Products");
		System.out.println("4. Display Cart");
		System.out.println("5. Display Total Points");
		System.out.println("6. Quit");
	}

	private static int buyItems(ArrayList<? extends VirtualItem> availableItems, ShoppingCart shoppingCart,
			int playerPoints) {
		displayAvailableItems(availableItems);

		int itemID = getIntInput("Enter the item ID to buy (0 to finish): ");
		
		int updatedPoints = playerPoints;

		while (itemID != 0) {

			VirtualItem selectedItem = findItemById(availableItems, itemID);

			if (selectedItem != null && playerPoints >= selectedItem.getPrice()) {
				
				shoppingCart.addToCart(selectedItem);
				
				updatedPoints -= selectedItem.getPrice();
				System.out.println("Item added to the cart!");
				
			} else if (selectedItem == null) {
				
				System.err.println("Invalid item ID. Please try again.");
				
			} else {
				
				System.out
						.println("Not enough points to buy this item. Please choose another item or finish shopping.");
			}

			itemID = getIntInput("Enter the item ID to buy (0 to finish): ");
		}
		
		return updatedPoints;
	}

	private static void displayAvailableItems(ArrayList<? extends VirtualItem> availableItems) {

		System.out.println("++++ Available Items ++++");

		for (VirtualItem item : availableItems) {
			
			System.out.println(item);
			System.out.println("------------------------");
		}
	}

	private static int getIntInput(String prompt) {

		while (true) {
			try {
				System.out.print(prompt);
				return scanner.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Invalid input. Please enter a number.");
				scanner.nextLine(); 
			}
		}
	}

	private static int getIntInput() {
		return getIntInput("Enter your choice: ");
	}

	private static VirtualItem findItemById(ArrayList<? extends VirtualItem> items, int itemID) {

		for (VirtualItem item : items) {
			if (item.getItemID() == itemID) {
				return item;
			}
		}
		return null;
	}

	private static void displayTotalPoints(int updatedPoints) {
		System.out.println("Total Points: " + updatedPoints);
	}
}

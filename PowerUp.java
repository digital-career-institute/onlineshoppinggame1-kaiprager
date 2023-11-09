package online_shopping_game;

public class PowerUp extends VirtualItem {

	private String effect;
	
	public PowerUp(int itemID, String name, double price, int points, String effect) {
		super(itemID, name, price, points);
		this.effect = effect;
	}

	public String getEffect() {
		return effect;
	}

	public void setEffect(String effect) {
		this.effect = effect;
	}

	@Override
	public String toString() {
		return super.toString() + "\tPowerUp Effect: " + effect;
	}
	
	public void applyPowerUp() {
		
		int currentPoints = super.getPoints();
		super.setPoints(currentPoints * 2);
	}
	
	

}

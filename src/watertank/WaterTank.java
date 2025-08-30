package watertank;

import java.util.*;

public class WaterTank implements WaterInterface {
	private int currentLevel = 0;
	private ArrayList<String> history = new ArrayList<String>();
	

	@Override
	public int getLevel() {
		return currentLevel;
	}

	@Override
	public boolean isEmpty() {
		return currentLevel <= 0;
	}

	@Override
	public boolean isFull() {
		return currentLevel > MAX_CAP;
	}

	@Override
	public void fill(int amount) {
		// if amount exceeds maximum capacity, it will notify the user and only allow max_cap as current level
		if (amount + currentLevel > MAX_CAP ||isFull()) {
			history.add("Tried to fill " + amount + " gallons → Overflow! Tank set to full.");
			currentLevel = MAX_CAP;
			System.out.println("Tank overflow! Now full at " + MAX_CAP + " gallons.");
		} else {
			// else, amount is added to current level & records it in history
			currentLevel += amount;
			history.add("Filled " + amount + " gallons → Current Level: " + currentLevel + "/" + MAX_CAP);
			System.out.println("Filled " + amount + " gallons → Current Level: " + currentLevel + "/" + MAX_CAP);
		}
		
	}

	@Override
	public void drain(int amount) {
		// if amount drained is less than zero, it will notify the user and only allows zero (minimum capacity) as the current level
		if (currentLevel - amount <= 0 ||isEmpty()) {
			history.add("Tried to drain " + amount + " gallons → Tank Empty!");
			currentLevel = 0;
			System.out.println("Tank is EMPTY! Can't drain more.");
		} else {
			currentLevel -= amount;
			history.add("Drained " + amount + " gallons → Current Level: " + currentLevel + "/" + MAX_CAP);
			System.out.println("Drained " + amount + " gallons → Current Level: " + currentLevel + "/" + MAX_CAP);
		}
		
	}

	@Override
	public void showHistory() { 
		System.out.println("\n--- Water Tank History ---");
		for (String event:history) {
			System.out.println(event);
		}
	}

	

}
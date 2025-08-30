package watertank;

public interface WaterInterface {
	
	static int MAX_CAP = 100000; // in gallons
	
	int getLevel();
	boolean isEmpty();
	boolean isFull();
	void fill(int amount);
	void drain(int amount);
	void showHistory();

}
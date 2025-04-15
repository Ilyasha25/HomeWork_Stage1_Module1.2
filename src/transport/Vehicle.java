package transport;

public abstract class Vehicle {
	private int buildNumber;
	
	public abstract void move();
	public int getBuildNumber() { return buildNumber; }
}

package transport;

public class Helicopter extends Vehicle implements PropellerableVehicle, WheelableVehicle, CarrierCargo
{
	private int countCargo;
	private int countPropeller;
	private int countWheel;

	@Override
	public int getCargoCount() {
		return countCargo;
	}

	@Override
	public int getCountWheel() {
		return countWheel;
	}

	@Override
	public int getCountPropeller() {
		return countPropeller;
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void transportCargo() {
		// TODO Auto-generated method stub
		
	}
}

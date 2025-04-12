package transport;

public class Truck extends Vehicle implements WheelableVehicle, CarrierCargo
{
	private int countCargo;
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
	public void move() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void transportCargo() {
		// TODO Auto-generated method stub
		
	}
}

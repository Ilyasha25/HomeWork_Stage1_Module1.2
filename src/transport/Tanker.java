package transport;

public class Tanker extends Vehicle implements PropellerableVehicle, CarrierCargo
{
	private int countCargo;
	private int countPropeller;

	@Override
	public int getCargoCount() {
		return countCargo;
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

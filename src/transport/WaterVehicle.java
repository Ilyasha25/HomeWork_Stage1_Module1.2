package transport;

public abstract class WaterVehicle extends Vehicle implements PropellerableVehicle, CarrierCargo
{
	private int countCargo;
	private int countPropeller;
	
	public WaterVehicle(int countPropeller, int countCargo)
	{
		super();
		// инициализация полей
	}

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

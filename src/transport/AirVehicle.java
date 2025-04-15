package transport;

public abstract class AirVehicle extends Vehicle implements PropellerableVehicle, WheelableVehicle, WingableVehicle, CarrierCargo
{
	private int countCargo;
	private int countWing;
	private int countPropeller;
	private int countWheel;
	
	public AirVehicle(int countWing, int countWheel, int countPropeller, int countCargo)
	{
		super();
		// инициализация полей
	}

	@Override
	public int getCargoCount() {
		return countCargo;
	}

	@Override
	public int getCountWing() {
		return countWing;
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

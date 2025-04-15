package transport;

public abstract class LandVehicle extends Vehicle implements WheelableVehicle, CarrierCargo
{
	private int countCargo;
	private int countWheel;
	
	public LandVehicle(int countCargo, int countWheel)
	{
		super();
		// инициализация полей
	}

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

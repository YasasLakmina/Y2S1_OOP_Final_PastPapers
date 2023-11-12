package November2022_DesignPattrnQuestion_PaperA;

public class NissanCar implements Car {

	CarAirBag carAirBag;

	public NissanCar(CarAirBag carAirBag) {
		this.carAirBag = carAirBag;
	}

	@Override
	public void assembleLight() {
		System.out.println("Assembling for Nissan");
		carAirBag.airBagLghtIndecator();

	}

	@Override
	public void assembleMotionSensor() {
		System.out.println("Assembling for Nissan");
		carAirBag.aiaBagMotionDetection();

	}

}

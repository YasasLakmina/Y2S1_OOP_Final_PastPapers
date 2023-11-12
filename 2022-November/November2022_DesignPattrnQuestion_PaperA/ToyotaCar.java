package November2022_DesignPattrnQuestion_PaperA;

public class ToyotaCar implements Car {

	CarAirBag carAirBag;

	public ToyotaCar(CarAirBag carAirBag) {
		this.carAirBag = carAirBag;
	}

	@Override
	public void assembleLight() {
		System.out.println("Assembling for Toyota");
		carAirBag.airBagLghtIndecator();

	}

	@Override
	public void assembleMotionSensor() {
		System.out.println("Assembling for Toyota");
		carAirBag.aiaBagMotionDetection();

	}

}

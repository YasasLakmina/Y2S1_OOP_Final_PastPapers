package November2022_DesignPattrnQuestion_PaperA;

public class Demo {
 public static void main(String[] args) {
	CarAirBag fAirbag = new FrontAirBag();
	CarAirBag sAirbag = new SideAirBag();
	
	new NissanCar(fAirbag).assembleLight();
	new NissanCar(fAirbag).assembleMotionSensor();
	new NissanCar(sAirbag).assembleLight();
	
	
	new ToyotaCar(fAirbag).assembleLight();
	new ToyotaCar(fAirbag).assembleMotionSensor();
	new ToyotaCar(sAirbag).assembleLight();
	
}
}

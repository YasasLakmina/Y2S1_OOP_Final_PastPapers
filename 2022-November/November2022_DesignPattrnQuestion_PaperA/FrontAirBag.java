package November2022_DesignPattrnQuestion_PaperA;

public class FrontAirBag implements CarAirBag {

	@Override
	public void aiaBagMotionDetection() {
	System.out.println("Motion detection on for Front Air Bag");

	}

	@Override
	public void airBagLghtIndecator() {
		System.out.println("Light indicator on for Front Air Bag");

	}

}

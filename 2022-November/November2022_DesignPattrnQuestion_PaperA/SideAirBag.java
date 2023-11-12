package November2022_DesignPattrnQuestion_PaperA;

public class SideAirBag implements CarAirBag {

	@Override
	public void aiaBagMotionDetection() {
		System.out.println("Motion detection on for Side Air Bag");

	}

	@Override
	public void airBagLghtIndecator() {
		System.out.println("Light indicator on for Side Air Bag");

	}

}

package November2022DesignPattrnQuestion;

public class FishFlavour implements IPrepareDeliciously{

	@Override
	public void addFlavour() {
		System.out.println("Adding Fish for the meal..");
		
	}

	@Override
	public double getCost() {

		return 80.0;
	}

}

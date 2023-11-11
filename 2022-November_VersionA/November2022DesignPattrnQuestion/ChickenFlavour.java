package November2022DesignPattrnQuestion;

public class ChickenFlavour implements IPrepareDeliciously {

	@Override
	public void addFlavour() {
		System.out.println("Adding Chicken for the meal..");
		
	}

	@Override
	public double getCost() {
		
		return 100.0;
	}

}

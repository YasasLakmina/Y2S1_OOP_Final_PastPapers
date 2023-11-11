package November2022DesignPattrnQuestion;

public class EggFlavour implements IPrepareDeliciously{

	@Override
	public void addFlavour() {
		System.out.println("Adding Egg for the meal..");
		
	}

	@Override
	public double getCost() {
		return 60.0;
	}

}

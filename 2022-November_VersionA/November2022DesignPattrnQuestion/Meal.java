package November2022DesignPattrnQuestion;

public abstract class Meal {
	private IPrepareQuickly time;
	private IPrepareDeliciously flavour;
	
	abstract void displayMeal();

	public void setFlavour(IPrepareDeliciously flavour) {
		this.flavour = flavour;
	}
	public void setTime(IPrepareQuickly time) {
		this.time = time;
	}
	
	public void mealWithFlavour() {
		flavour.addFlavour();
	}
	
	public void mealWithDuration() {
		time.deliveryTime();
	}
	
	public IPrepareDeliciously getFlavour() {
		return flavour;
	}
		
}

class Breakfast extends Meal{
	public void displayMeal() {
		System.out.println("Preparing Breakfast........");
		mealWithFlavour();
		mealWithDuration();
		displayCost();
		
		
	}
	
	public void displayCost() {
		System.out.println("Cost of the meal is : " + getFlavour().getCost());
		System.out.println("");
	}
}

class Lunch extends Meal{
	public void displayMeal() {
		System.out.println("Preparing Lunch........");
		mealWithFlavour();
		mealWithDuration();
		displayCost();	
	}
	
	public void displayCost() {
		System.out.println("Cost of the meal is : " + getFlavour().getCost());
		System.out.println("");
	}
}

class Dinner extends Meal{
	public void displayMeal() {
		System.out.println("Preparing Dinner........");
		mealWithFlavour();
		mealWithDuration();
		displayCost();	
	}
	
	public void displayCost() {
		System.out.println("Cost of the meal is : " + getFlavour().getCost());
		System.out.println("");
	}
}

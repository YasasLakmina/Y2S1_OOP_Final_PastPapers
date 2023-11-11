package November2022DesignPattrnQuestion;

public class TestStratergy {
	public static void main(String[] args) {
		Meal meal = new Breakfast();
		meal.setFlavour(new ChickenFlavour());
		meal.setTime(new ThirtyMinutes());
		meal.displayMeal();
		
		Meal meal2 = new Lunch();
		meal2.setFlavour(new FishFlavour());
		meal2.setTime(new OneHour());
		meal2.displayMeal();
		
		Meal meal3 = new Dinner();
		meal3.setFlavour(new EggFlavour());
		meal3.setTime(new FourtyFiveMinutes());
		meal3.displayMeal();
	}
}

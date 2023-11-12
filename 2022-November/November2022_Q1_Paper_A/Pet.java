package November2022_Q1_Paper_A;

public class Pet implements PointAllocator{

	
	
	@Override
	public void getter() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setter() {
		// TODO Auto-generated method stub
		
	}
	
	public void feed() {
		System.out.print("Feeding");
	}
	
	public void clean() {
		System.out.print("Cleaning");
	}
	
	public void cuddle() {
		System.out.print("Cuddling");
	}
	
	public void GetTotalPoints() {
		
	}
	
	public class Cat extends Pet{
		
	}
	
	public class Squirrel extends Pet{
		int command;
		
	}
	
	public class Parrot extends Pet{
		int command;
	}

}

	
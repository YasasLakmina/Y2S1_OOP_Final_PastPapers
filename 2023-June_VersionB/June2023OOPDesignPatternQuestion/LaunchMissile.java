package WarSystemCommandPatternQuestion;

public class LaunchMissile implements MissileOperation{

	MissileSystem missile;
	
	public LaunchMissile(MissileSystem missile) {
		this.missile = missile;
	}



	@Override
	public void initiateoperation(String location) {
		missile.launch(location);
	}

}

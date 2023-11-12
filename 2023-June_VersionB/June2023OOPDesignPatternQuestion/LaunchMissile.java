package June2023OOPDesignPatternQuestion;

public class LaunchMissile implements MissileOperation{

	MissileSystem mSystem;
	
	@Override
	public void initiateOperation(String location) {
		mSystem.launch(location);
	}

}

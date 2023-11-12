package WarSystemCommandPatternQuestion;

public class Test {
	public static void main(String[] args) {
		HeatMissileSystem heatMissile = HeatMissileSystem.getInstance();
		RocketMissileSystem rocketMissile = RocketMissileSystem.getInstance();
		
		MissileController mControl = MissileController.getInst();
		
		mControl.setOperations(new LaunchMissile(heatMissile), new BlastMissile(heatMissile));
		mControl.performLaunching("Colombo");
		mControl.performBlsting("MH370");
		
		mControl.setOperations(new LaunchMissile(rocketMissile), new BlastMissile(rocketMissile));
		mControl.performLaunching("Kandy");
		mControl.performBlsting("MH420");
	}
}

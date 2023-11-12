package WarSystemCommandPatternQuestion;

public class RocketMissileSystem implements MissileSystem{

	private static RocketMissileSystem uniqueInst;
	
	private RocketMissileSystem(){
		System.out.println("Initialize Rocket Missile System....");
	}
	
	public static RocketMissileSystem getInstance() {
		if(uniqueInst == null) {
			synchronized(RocketMissileSystem.class) {
				if(uniqueInst == null) {
					uniqueInst = new RocketMissileSystem();
				}
			}
		}
		return uniqueInst;
	}
	
	
	
	@Override
	public void launch(String source) {
		System.out.print("Rocket Missile launch from " + source);
	}

	@Override
	public void blast(String destination) {
		System.out.println(" and Rocket Missile blast Flight " + destination);
	}

	
}

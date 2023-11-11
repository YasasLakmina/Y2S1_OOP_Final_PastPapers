package June2023OOPDesignPatternQuestion;

public class RocketMissileSystem implements MissileSystem{
	
	private static RocketMissileSystem uniqueinst;
	
	private RocketMissileSystem() {
		System.out.println("Initialize Rocket Missile System...");
	}
	
	public static RocketMissileSystem getInst() {
		if(uniqueinst == null) {
			synchronized(RocketMissileSystem.class) {
				if(uniqueinst == null) {
					uniqueinst = new RocketMissileSystem();
				}
			}
		}
		
		return uniqueinst;
	}
	
	@Override
	public void launch(String source) {
		
	}

	@Override
	public void blast(String destination) {
		
	}

}

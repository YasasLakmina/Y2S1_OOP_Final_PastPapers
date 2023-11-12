package WarSystemCommandPatternQuestion;

public class HeatMissileSystem implements MissileSystem{

	private static HeatMissileSystem uniqueInst;
	
	private HeatMissileSystem(){
		System.out.println("Inizialize Heat Missile System....");
	}
	
	public static HeatMissileSystem getInstance() {
		if(uniqueInst == null) {
			synchronized(HeatMissileSystem.class) {
				if(uniqueInst == null) {
					uniqueInst = new HeatMissileSystem();
				}
			}
		}
		return uniqueInst;
	}
	
	@Override
	public void launch(String source) {
		System.out.print("Heat Missile launch from " + source);
	}

	@Override
	public void blast(String destination) {
		System.out.println(" and Heat Missile blast Flight " + destination);
	}


}

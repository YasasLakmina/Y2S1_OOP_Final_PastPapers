package June2023OOPDesignPatternQuestion;

public class HeatMissileSystem implements MissileSystem{
	private static HeatMissileSystem uniqueInst;
	
	private HeatMissileSystem() {
		System.out.println("Inizialize Heat Missile System...");
	}
	
	private static HeatMissileSystem getInst() {
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
		uniqueInst.launch(source);
	}

	@Override
	public void blast(String destination) {
		uniqueInst.blast(destination);
	}

}

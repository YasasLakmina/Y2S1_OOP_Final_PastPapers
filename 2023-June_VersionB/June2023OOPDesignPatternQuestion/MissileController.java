package WarSystemCommandPatternQuestion;

public class MissileController {
	
	private MissileOperation launch;
	private MissileOperation blast;
	
	private static MissileController uniqueInst;
	
	private MissileController() {
		System.out.println("Initialize Missile Controler....");
	}
	
	public static MissileController getInst() {
		if(uniqueInst == null) {
			synchronized(MissileController.class) {
				uniqueInst = new MissileController();
			}
		}
		return uniqueInst;
	}
	
	public void setOperations(MissileOperation launch , MissileOperation blast) {
		this.launch = launch;
		this.blast = blast;
	}
	
	public void performLaunching(String start) {
		launch.initiateoperation(start);
	}
	
	public void performBlsting(String end) {
		blast.initiateoperation(end);
	}
}

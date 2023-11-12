package June2023OOPDesignPatternQuestion;

public class MissileController {
	MissileOperation launch;
	MissileOperation blast;
	
	void setOperation(MissileOperation launch, MissileOperation blast) {
		this.launch = launch;
		this.blast = blast;
	}
	
	private static MissileController uniqueInst;
	
	private MissileController() {
		
	}
	
	private static MissileController getInst() {
		if(uniqueInst == null) {
			synchronized(MissileController.class) {
				if(uniqueInst == null) {
					uniqueInst = new MissileController();
				}
			}
		}
		
		return uniqueInst;
	}
	
	void performLunching(String start) {
		this.launch.initiateOperation(start);
	}
	
	void performBlasting(String end) {
		this.blast.initiateOperation(end);
	}
}

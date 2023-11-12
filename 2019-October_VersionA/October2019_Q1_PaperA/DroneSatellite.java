package October2019_Q1_PaperA;

public class DroneSatellite implements ISatellite{

	private String name;

	public DroneSatellite(String name) {
		this.name = name;
	}

	@Override
	public void activate() {
		System.out.println(name + " drone satellite activate");
	}

	@Override
	public void deactivate() {
		System.out.println(name + " drone satellite deactivate");
		
	}

}

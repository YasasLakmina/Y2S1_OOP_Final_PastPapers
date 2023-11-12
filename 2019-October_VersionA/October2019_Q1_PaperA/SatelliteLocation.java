package October2019_Q1_PaperA;

public class SatelliteLocation implements IGeoLocation{

	private String location;
	
	public SatelliteLocation(String location) {
		super();
		this.location = location;
	}

	@Override
	public void displayLocation() {
		System.out.println("Satellite Location is = " + location);
		System.out.println();
	}
	
}

package October2019_Q1_PaperA;

public class NavigationSatellite implements ISatellite{

	private String name;

	public NavigationSatellite(String name) {
		this.name = name;
	}

	@Override
	public void activate() {
		System.out.println(name + " navigational satellite activate");
	}

	@Override
	public void deactivate() {
		System.out.println(name + " navigational satellite deactivate");
	}

}

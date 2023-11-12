package October2019_Q1_PaperA;

public class SatelliteCenter {
	private int option;
	ISatellite iSatellite[];
	IGeoLocation iGeoLocation[];
	
	public SatelliteCenter(int option, October2019_Q1_PaperA.ISatellite[] iSatellite,
			October2019_Q1_PaperA.IGeoLocation[] iGeoLocation) {
		this.option = option;
		this.iSatellite = iSatellite;
		this.iGeoLocation = iGeoLocation;
	}
	
	public void startService() {
		if(option == 0) {
			iSatellite[option].activate();
		}
		else if(option == 1) {
			iSatellite[option].activate();
		}
	}
	
	public void stopService() {
		if(option == 0) {
			iSatellite[option].deactivate();
		}
		else if(option == 1) {
			iSatellite[option].deactivate();
		}
	}
	
	public void locationService() {
		if(option == 0) {
			iGeoLocation[option].displayLocation();
		}
		else if(option == 1) {
			iGeoLocation[option].displayLocation();
		}
	}
}

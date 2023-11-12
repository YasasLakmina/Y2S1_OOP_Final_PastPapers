package October2019_Q1_PaperA;

public class SatelliteDemo {
	public static void main(String[] args) {
	
		ISatellite navigationalSatellite  = new NavigationSatellite("Ravana 01");
		IGeoLocation locationTracker1 = new SatelliteLocation("Sri Lanka");
		ISatellite droneSatellite  = new DroneSatellite("Ravana 02");
		IGeoLocation locationTracker2 = new SatelliteLocation("Russia");
		
		
		ISatellite[] satellitearray = new ISatellite[] {navigationalSatellite,droneSatellite};
		IGeoLocation[] trackerArray = new IGeoLocation[] {locationTracker1,locationTracker2};
		
		SatelliteCenter satelitecenter = new SatelliteCenter(0,satellitearray,trackerArray);
		satelitecenter.startService();
		satelitecenter.stopService();
		satelitecenter.locationService();
		
		SatelliteCenter remotecontraller2 = new SatelliteCenter(1,satellitearray,trackerArray);
		remotecontraller2.startService();
		remotecontraller2.stopService();
		remotecontraller2.locationService();
	}
}

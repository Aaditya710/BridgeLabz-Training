package com.ambulanceroute;

public class AmbulanceRouteMain {
	public static void main(String [] args) {
		RouteManage route = new RouteManage();
		
		route.addUnit("Emergency", false);
		route.addUnit("Radiology", false);
		route.addUnit("Surgery", false);
		route.addUnit("ICU", true);
		
		route.findAvailableUnit();
		
		route.removeUnit("Surgery");
		route.findAvailableUnit();
	}

}

package spring.mvc.analytics.socialengine;

import fi.foyt.foursquare.api.FoursquareApi;

public enum FoursquareSingleton {
	INSTANCE;
	
	public FoursquareApi foursquareSingleton(){	
		return new FoursquareApi("P21NAZBY145C0XHPX43Y2PA0DMFGEJOPMYY1XEFXATNF5A5C", "4W2BSDMJFVYHE34M1WME3WQE04WTD1K50WJYVQLNNFIXQYRB", "http://geekdetected.wordpress.com");		
	}

}

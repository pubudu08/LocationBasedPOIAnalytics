package spring.mvc.analytics.services;

import fi.foyt.foursquare.api.FoursquareApiException;
import fi.foyt.foursquare.api.Result;
import fi.foyt.foursquare.api.entities.CompleteTip;
import fi.foyt.foursquare.api.entities.CompleteVenue;
import fi.foyt.foursquare.api.entities.VenuesSearchResult;
import spring.mvc.analytics.socialengine.FoursquareAPIMethodCalls;

public class FoursquareAPIService {

	private FoursquareAPIMethodCalls foursquareMethodCalls = new FoursquareAPIMethodCalls();

	public Result<VenuesSearchResult> searchVenues(String ll)
			throws FoursquareApiException {
		return foursquareMethodCalls.searchVenues(ll);
	}

	public Result<CompleteTip[]> tipSearch(String ll)
			throws FoursquareApiException {
		return foursquareMethodCalls.tipSearch(ll);
	}
	
	public Result<CompleteVenue> venueById(String venueId)throws FoursquareApiException{
		return foursquareMethodCalls.venue(venueId);
	}

}

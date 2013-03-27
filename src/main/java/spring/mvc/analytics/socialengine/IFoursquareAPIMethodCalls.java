package spring.mvc.analytics.socialengine;

import fi.foyt.foursquare.api.FoursquareApiException;
import fi.foyt.foursquare.api.Result;
import fi.foyt.foursquare.api.entities.CompleteTip;
import fi.foyt.foursquare.api.entities.CompleteVenue;
import fi.foyt.foursquare.api.entities.VenuesSearchResult;


public interface IFoursquareAPIMethodCalls {
	 public Result<VenuesSearchResult> searchVenues(String ll) throws FoursquareApiException ;
	 public Result<CompleteTip[]> tipSearch(String ll)throws FoursquareApiException ;
	 public  Result <CompleteVenue> venue(String venueId)throws FoursquareApiException ;
}
	 

package spring.mvc.analytics.socialengine;

import fi.foyt.foursquare.api.FoursquareApiException;
import fi.foyt.foursquare.api.Result;
import fi.foyt.foursquare.api.entities.CompleteTip;
import fi.foyt.foursquare.api.entities.CompleteVenue;
import fi.foyt.foursquare.api.entities.VenuesSearchResult;

public class FoursquareAPIMethodCalls implements IFoursquareAPIMethodCalls{

	@Override
	public Result<VenuesSearchResult> searchVenues(String ll)
			throws FoursquareApiException {
		FoursquareSingleton fourSquare = FoursquareSingleton.INSTANCE;
		Result<VenuesSearchResult> result = fourSquare.foursquareSingleton()
				.venuesSearch(ll, null, null, null, null, null, null, null,
						null, null, null);
		return result;
	}

	@Override
	public Result<CompleteTip[]> tipSearch(String ll)
			throws FoursquareApiException {
		FoursquareSingleton fourSquare = FoursquareSingleton.INSTANCE;
		Result<CompleteTip[]> result = fourSquare.foursquareSingleton().tipsSearch("6.933208392659332,79.84366048810165", 100, 100, null, null);
		return result;
	}

	@Override
	public Result<CompleteVenue> venue(String venueId)
			throws FoursquareApiException {
		FoursquareSingleton fourSquare = FoursquareSingleton.INSTANCE;
		 Result <CompleteVenue> stat = fourSquare.foursquareSingleton().venue("4eda2570e5fa78b16dcf7550");
		return stat;
	}

}

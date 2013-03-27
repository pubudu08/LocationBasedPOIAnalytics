package spring.mvc.analytics.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import fi.foyt.foursquare.api.FoursquareApiException;
import fi.foyt.foursquare.api.Result;
import fi.foyt.foursquare.api.entities.CompactVenue;
import fi.foyt.foursquare.api.entities.CompleteTip;
import fi.foyt.foursquare.api.entities.CompleteVenue;
import fi.foyt.foursquare.api.entities.VenuesSearchResult;

import spring.mvc.analytics.services.FoursquareAPIService;

@Controller
public class FoursquareAPIController {

	private FoursquareAPIService foursquareService = new FoursquareAPIService();

	@RequestMapping(value = "/venueSearch", method = RequestMethod.GET)
	public String fetchNearestVenues(ModelMap model)
			throws FoursquareApiException {
		String ll = "6.933208392659332,79.84366048810165";
		Result<VenuesSearchResult> result = foursquareService.searchVenues(ll);

		if (result.getMeta().getCode() == 200) {
			for (CompactVenue venue : result.getResult().getVenues()) {
				System.out.println("Venue Name : " + venue.getName());
				System.out.println("      Total Checkin Count : "
						+ venue.getStats().getCheckinsCount());
				System.out.println("      Total Users Count : "
						+ venue.getStats().getUsersCount());
			}
		} else {
			System.out.println("Error occured: ");
			System.out.println("  code: " + result.getMeta().getCode());
			System.out.println("  type: " + result.getMeta().getErrorType());
			System.out
					.println("  detail: " + result.getMeta().getErrorDetail());
		}

		return "welcome";
	}
	@RequestMapping(value = "/venueById", method = RequestMethod.GET)
	public String fetchVenueById() throws FoursquareApiException {
		String venueId = "";
		Result<CompleteVenue> venueStats = foursquareService.venueById(venueId);

		if (venueStats.getMeta().getCode() == 200) {
			// for (CompactVenue venue : venueStats.getResult().getStats()) {
			//
			// }
		} else {
			System.out.println("Error occured: ");
			System.out.println("  code: " + venueStats.getMeta().getCode());
			System.out
					.println("  type: " + venueStats.getMeta().getErrorType());
			System.out.println("  detail: "
					+ venueStats.getMeta().getErrorDetail());
		}
		return "welcome";

	}
	@RequestMapping(value = "/tips", method = RequestMethod.GET)
	public String fetchTips() throws FoursquareApiException {
		String ll = "6.933208392659332,79.84366048810165";
		Result<CompleteTip[]> venueStats = foursquareService.tipSearch(ll);

		if (venueStats.getMeta().getCode() == 200) {
			// for (CompactVenue venue : venueStats.getResult().getStats()) {
			//
			// }
		} else {
			System.out.println("Error occured: ");
			System.out.println("  code: " + venueStats.getMeta().getCode());
			System.out
					.println("  type: " + venueStats.getMeta().getErrorType());
			System.out.println("  detail: "
					+ venueStats.getMeta().getErrorDetail());
		}
		return "welcome";

	}

}

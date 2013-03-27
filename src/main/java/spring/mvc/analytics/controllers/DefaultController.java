package spring.mvc.analytics.controllers;

import java.security.Principal;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;

import fi.foyt.foursquare.api.FoursquareApiException;
import fi.foyt.foursquare.api.Result;
import fi.foyt.foursquare.api.entities.CompactVenue;
import fi.foyt.foursquare.api.entities.VenuesSearchResult;

import spring.mvc.analytics.models.User;
import spring.mvc.analytics.models.UserRole;
import spring.mvc.analytics.services.FoursquareAPIService;
import spring.mvc.analytics.services.RoleService;
import spring.mvc.analytics.services.UserService;

@Controller
public class DefaultController {
	protected final Logger logger = Logger.getLogger(getClass());

	@Autowired(required = true)
	UserService userService;
	@Autowired(required = true)
	RoleService userRole;
	
	private FoursquareAPIService foursquareService = new FoursquareAPIService();

	@RequestMapping("/welcome")
	public String callWelcome(ModelMap model, Principal principal){

		int userId = Integer.parseInt(principal.getName()); // get logged in
		User user = userService.populateUsersByID(userId);
		// UserRole userRole = userRole.getUserRoleID()
		String name = user.getFirstName() + " " + user.getLastName();
		// String role = user.getUserRole().getUserRoleType();
		System.out.println("Full Name :" + name);
		model.addAttribute("username", name);
		return "welcome";

	}
	@RequestMapping("/maptest")
	public String callMapService(ModelMap model, Principal principal) {
		return "maptest";

	}
}
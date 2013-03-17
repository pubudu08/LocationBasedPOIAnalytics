/**
 * 
 */
package spring.mvc.analytics.controllers;

import java.security.Principal;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import spring.mvc.analytics.models.User;
import spring.mvc.analytics.services.UserService;

/**
 * @author Rapter
 *
 */
@Controller
public class UserController {
	protected final Logger logger = Logger.getLogger(getClass());

	
	@Autowired(required=true)
	private UserService userService;
	
	@RequestMapping(value="/allusers",method = RequestMethod.GET)
	 public String handleAllUsersRequest(ModelMap model, Principal principal ){
		
		List<User> user = userService.populateUsers();
		System.out.print(user.size());
		
//		model.addAttribute("username", name);
		return "allusers";
		
	}

}

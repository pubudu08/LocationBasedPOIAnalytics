/**
 * 
 */
package spring.mvc.analytics.controllers;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
	
	@RequestMapping(value="/userList",method = RequestMethod.GET)
	 public String handleAllUsersRequest(){
		
		return "Users";
		
	}

}

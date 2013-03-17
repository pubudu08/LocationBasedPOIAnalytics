package spring.mvc.analytics.controllers;


import java.security.Principal;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;

import spring.mvc.analytics.models.User;
import spring.mvc.analytics.models.UserRole;
import spring.mvc.analytics.services.RoleService;
import spring.mvc.analytics.services.UserService;


@Controller
public class DefaultController {
    protected final Logger logger = Logger.getLogger(getClass());
    
    @Autowired(required=true)
    UserService userService;
    @Autowired(required=true)
    RoleService userRole;

    
    @RequestMapping("/welcome")
    public String callWelcome(ModelMap model, Principal principal ) {
   	 
    	int userId = Integer.parseInt(principal.getName()); //get logged in username 
        User user = userService.populateUsersByID(userId);
//        UserRole userRole = userRole.getUserRoleID()
        String name = user.getFirstName()+" "+ user.getLastName();
//        String role = user.getUserRole().getUserRoleType();
        System.out.println("Full Name :" +name );
        model.addAttribute("username", name);
        return "welcome";
   
    }
}
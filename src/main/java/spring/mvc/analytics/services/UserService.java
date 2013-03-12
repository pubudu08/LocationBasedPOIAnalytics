/**
 * 
 */
package spring.mvc.analytics.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import spring.mvc.analytics.dao.impl.UserDAO;
import spring.mvc.analytics.models.User;


/**
 * @author Rapter
 *
 */
public class UserService {
	
	@Autowired
	private UserDAO userDAO;
	


	public List<User> populateUsersByID() {
		// TODO Auto-generated method stub
		return null;
	}


	public List<User> populateUsers() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}

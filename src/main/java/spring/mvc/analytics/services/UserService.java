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
	
	public User populateUsersByID(int id) {	
		return userDAO.getUserByID(id);
	}

	public List<User> populateUsers() {		
		return userDAO.getAllEmployees();
	}
	
	

}

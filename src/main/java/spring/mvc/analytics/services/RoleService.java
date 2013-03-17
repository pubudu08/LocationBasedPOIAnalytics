package spring.mvc.analytics.services;

import org.springframework.beans.factory.annotation.Autowired;

import spring.mvc.analytics.dao.impl.UserRoleDAO;
import spring.mvc.analytics.models.UserRole;

public class RoleService {

	@Autowired
	UserRoleDAO userRoleDAO;

	UserRole getRole(Long id) {
		return null;

	}

	UserRole getRoleById(int id) {
		return userRoleDAO.getUserRoleById(id);

	}

}

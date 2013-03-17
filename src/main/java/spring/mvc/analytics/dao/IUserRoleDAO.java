package spring.mvc.analytics.dao;

import java.util.List;
import spring.mvc.analytics.models.UserRole;

public interface IUserRoleDAO {
	
	List<UserRole> getUserRoles();
	UserRole getUserRoleById(int id);

}

package spring.mvc.analytics.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import spring.mvc.analytics.dao.AbstractDAO;
import spring.mvc.analytics.dao.IUserRoleDAO;
import spring.mvc.analytics.models.User;
import spring.mvc.analytics.models.UserRole;

public class UserRoleDAO extends AbstractDAO implements IUserRoleDAO {

	@Override
	public List<UserRole> getUserRoles() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserRole getUserRoleById(int id) {
//		Session session = getSessionFactory().getCurrentSession();
//		session.beginTransaction();
//		Criteria criteria = session.createCriteria(User.class);
//		criteria.add(Restrictions.eq(UserRole.PROPERTY_USERROLE_ID, id));
//		criteria.setMaxResults(1);
//		UserRole userRole = (UserRole) criteria.uniqueResult();
//		session.getTransaction().commit();
		return null;
	}

}

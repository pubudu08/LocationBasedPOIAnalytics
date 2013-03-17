package spring.mvc.analytics.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import spring.mvc.analytics.dao.AbstractDAO;
import spring.mvc.analytics.dao.IUserDAO;
import spring.mvc.analytics.models.User;

public class UserDAO extends AbstractDAO implements IUserDAO {

	@Override
	public List<User> getAllEmployees() {
		Session session = getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Criteria criteria = session.createCriteria(User.class);
		List<User> user = criteria.list();
		//session.getTransaction().commit();
		return user;
	}

	@Override
	public User getUserByID(int id) {
        Session session = getSessionFactory().getCurrentSession();
		session.beginTransaction();
        Criteria criteria = session.createCriteria(User.class);
        criteria.add(Restrictions.eq(User.PROPERTY_EMPLOYEE_ID, id));
        criteria.setMaxResults(1);
        User user = (User) criteria.uniqueResult();
//		session.getTransaction().commit();
        return user ;
	}

}

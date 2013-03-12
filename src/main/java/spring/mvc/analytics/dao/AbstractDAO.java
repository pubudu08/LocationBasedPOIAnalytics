package spring.mvc.analytics.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import spring.mvc.analytics.models.IPersistable;

public class AbstractDAO {

	private SessionFactory sessionFactory;

	public void save(IPersistable object) {
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		session.save(object);
		session.getTransaction().commit();
	}

	public void delete(IPersistable object) {
		Session session = sessionFactory.getCurrentSession();
		session.delete(object);
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		System.out.print("setting" + sessionFactory);
		this.sessionFactory = sessionFactory;
	}

	public void update(IPersistable object) {
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		session.update(object);
		session.getTransaction().commit();
	}

}

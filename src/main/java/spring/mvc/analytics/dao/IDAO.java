package spring.mvc.analytics.dao;

import spring.mvc.analytics.models.IPersistable;

public interface IDAO {
	public void save(IPersistable object);
	public void delete(IPersistable object);

}

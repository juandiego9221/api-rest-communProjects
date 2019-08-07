package pe.com.jdmm21.common;

import java.util.List;

public abstract class AbstractResource<T> {

	public  List<T> findAllResource(){
		return getService().findAll();
	}

	public  void saveResource(T entity) {
		getService().save(entity);
	}

	public  void updateResource(T entity, Long id) {
		getService().update(entity, id);
	}

	public  void deleteResource( Long id) {
		getService().delete(id);
	}

	public abstract AbstractService<T> getService();

}

package pe.com.jdmm21.common;

import java.util.List;

import pe.com.jdmm21.common.exception.condition.RestPreCondition;

public abstract class AbstractResource<T> {

	public  List<T> findAllResource(){
		return getService().findAll();
	}

	public  void saveResource(T entity) {
		getService().save(entity);
	}

	public  void updateResource(T entity, Long id) {
		RestPreCondition.checkIfPathRequestExist(id.toString());
		getService().update(entity, id);
	}

	public  void deleteResource( Long id) {
		RestPreCondition.checkIfPathRequestExist(id.toString());
		getService().delete(id);
	}

	public abstract AbstractService<T> getService();

}

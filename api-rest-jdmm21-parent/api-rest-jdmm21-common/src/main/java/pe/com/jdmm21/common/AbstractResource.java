package pe.com.jdmm21.common;

import java.util.List;
import pe.com.jdmm21.common.exception.condition.RestPreCondition;
import pe.com.jdmm21.common.utilitario.Constantes;

public abstract class AbstractResource<T extends IEntity> {

	public List<T> findAllResource() {
		return getService().findAll();
	}

	public void saveResource(T entity) {
		getService().save(entity);
	}

	public void updateResource(T entity, Long id) {
		RestPreCondition.checkIfBadRequest(!entity.getId().equals(id),Constantes.RESOURCE_MUST_MATCH_ID);
		RestPreCondition.checkIfResourceExists(!getService().findOne(id));
		getService().update(entity);
	}

	public void deleteResource(Long id) {
		RestPreCondition.checkIfResourceExists(!getService().findOne(id));
		getService().delete(id); 
	}

	public abstract AbstractService<T> getService();

}

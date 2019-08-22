package pe.com.jdmm21.common;

import java.util.List;

import pe.com.jdmm21.common.exception.condition.RestPreCondition;
import pe.com.jdmm21.common.utilitario.Utilitario;

public abstract class AbstractResource<T extends IEntity> {

	public List<T> findAllResource() {
		return getService().findAll();
	}

	public void saveResource(T entity) {
		getService().save(entity);
	}

	public void updateResource(T entity, Long id) {
		RestPreCondition.checkIfBadRequest(Utilitario.validarValorVacioONulo(entity.getId()), "Debe ingresa id en el resource");
		RestPreCondition.checkIfBadRequest(entity.getId() == id ? false : true,
				"El resoruce enviado debe coincidid con el id en la uri");
		RestPreCondition.checkIfResourceExists(!getService().findOne(id), "El recurso a actualizar no existe");
		getService().update(entity, id);

	}

	public void deleteResource(Long id) {
		RestPreCondition.checkIfResourceExists(!getService().findOne(id), "El recurso a eliminar no existe");
		getService().delete(id);
	}

	public abstract AbstractService<T> getService();

}

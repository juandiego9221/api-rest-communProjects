package pe.com.jdmm21.common;

import java.util.List;

public interface IOperation<T> {

	List<T> findAll();

	T save(T entity);

	T update(T entity, Long id);

	T delete(Long id);

	T findById(Long id);
}

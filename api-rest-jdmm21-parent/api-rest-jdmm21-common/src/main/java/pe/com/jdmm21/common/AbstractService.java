package pe.com.jdmm21.common;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

public class AbstractService<T> implements IOperation<T> {

	@Autowired
	IRepository<T> irepository;

	public List<T> findAll() {
		return irepository.findAll();
	}

	public T save(T entity) {
		return irepository.save(entity);
	}

	public T update(T entity) {
		irepository.save(entity);
		return entity;
	}

	public T delete(Long id) {
		T entityFound = findById(id);
		irepository.deleteById(id);
		return entityFound;
	}

	public T findById(Long id) {
		return irepository.findById(id).get();
	}

	public boolean findOne(Long id) {
		return irepository.findById(id).isPresent();
	}

}

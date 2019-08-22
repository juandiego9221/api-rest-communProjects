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
		return (T) irepository.save(entity);
	}

	public T update(T entity, Long id) {
		T entityFound = findById(id);
		if (entityFound == null) {
			return null;
		} else {
			irepository.save(entity);
			return (T) entity;
		}
	}

	public T delete(Long id) {
		T entityFound = findById(id);
		if (entityFound == null) {
			return null;
		} else {
			irepository.delete(entityFound);
			return (T) entityFound;
		}
	}

	public T findById(Long id) {
//		return irepository.findById(id).orElseThrow(() -> new RuntimeException());
		return irepository.findById(id).get();

	}
	
	public boolean  findOne(Long id) {
		return irepository.findById(id).isPresent();
	}

}

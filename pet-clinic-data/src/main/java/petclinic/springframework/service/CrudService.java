package petclinic.springframework.service;

import java.util.Set;

public interface CrudService <T , ID> {

	Set<T> findAll(T t);
	
	T findById(ID id);
	
	T save (T t);
	
	void delete (T t);
	
	void deleteById(ID id);
	
}

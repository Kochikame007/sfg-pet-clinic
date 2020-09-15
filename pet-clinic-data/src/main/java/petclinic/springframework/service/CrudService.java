package petclinic.springframework.service;

import java.util.Set;

import petclinic.springframework.model.BaseEntity;

public interface CrudService <T extends BaseEntity> {

	Set<T> findAll();
	
	T findById(Long id);
	
	T save (T t);
	
	void delete (T t);
	
	void deleteById(Long id);
	
}

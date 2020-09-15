package petclinic.springframework.service.springdatajpa;

import java.util.HashSet;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;

import petclinic.springframework.model.BaseEntity;
import petclinic.springframework.service.CrudService;

public abstract class AbstractJpaService<T extends BaseEntity, R extends JpaRepository<T, Long>> implements CrudService<T>{
	
	protected R repository;
	
	public AbstractJpaService (R repository) {
		this.repository = repository;
	}
	

	public Set<T> findAll() {
		return new HashSet<>(repository.findAll());
	}

	public T findById(Long id) {
		return repository.findById(id).orElse(null);
	}

	public T save( T object) {
		return repository.save(object);
		}


	public void deleteById(Long id) {
		 repository.deleteById(id);
	}

	public void delete(T object) {
		 repository.delete(object);
	}

}

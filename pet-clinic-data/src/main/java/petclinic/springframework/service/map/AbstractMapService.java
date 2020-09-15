package petclinic.springframework.service.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;

import petclinic.springframework.model.BaseEntity;
import petclinic.springframework.service.CrudService;

public abstract class AbstractMapService<T extends BaseEntity> implements CrudService<T> {
	
	 
	protected Map<Long, T> map = new HashMap<Long, T>();

	public Set<T> findAll() {
		return new HashSet<>(map.values());
	}

	public T findById(Long id) {
		return map.get(id);
	}

	public T save( T object) {
		if (null != object) {
			if (object.getId() == null) {
				object.setId(getNextId());
			}
		}

		map.put(object.getId(), object);
		return object;
	}

	public void deleteById(Long id) {
		map.remove(id);
	}

	public void delete(T object) {
		map.entrySet().removeIf(entrySet -> entrySet.getValue().equals(object));
	}

	Long getNextId() {
		return map.size() > 0 ? Collections.max(map.keySet()) + 1 : 1;
	}
}

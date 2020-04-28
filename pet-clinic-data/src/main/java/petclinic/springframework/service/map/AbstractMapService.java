package petclinic.springframework.service.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import petclinic.springframework.model.BaseEntity;

public abstract class AbstractMapService<T extends BaseEntity, ID extends Long> {

	protected Map<Long, T> map = new HashMap<Long, T>();

	Set<T> findAll() {
		return new HashSet<>(map.values());
	}

	T findById(ID id) {
		return map.get(id);
	}

	T save( T object) {
		if (null != object) {
			if (object.getId() == null) {
				object.setId(getNextId());
			}
		}

		map.put(object.getId(), object);
		return object;
	}

	void deleteById(ID id) {
		map.remove(id);
	}

	void delete(T object) {
		map.entrySet().removeIf(entrySet -> entrySet.getValue().equals(object));
	}

	Long getNextId() {
		return map.size() > 0 ? Collections.max(map.keySet()) + 1 : 1;
	}
}

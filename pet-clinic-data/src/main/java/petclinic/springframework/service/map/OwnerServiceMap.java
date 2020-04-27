package petclinic.springframework.service.map;

import java.util.Set;

import petclinic.springframework.model.Owner;
import petclinic.springframework.service.CrudService;

public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long> {

	@Override
	public Set<Owner> findAll(Owner o) {
		// TODO Auto-generated method stub
		return super.findAll();
	}

	@Override
	public Owner save(Owner o) {
		// TODO Auto-generated method stub
		return super.save(o.getId(), o);
	}

	@Override
	public Owner findById(Long id) {
		return super.findById(id);
	}

	@Override
	public void delete(Owner o) {
		super.delete(o);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

}

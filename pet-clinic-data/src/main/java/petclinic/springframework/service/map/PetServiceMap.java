package petclinic.springframework.service.map;

import java.util.Set;

import petclinic.springframework.model.Pet;
import petclinic.springframework.service.CrudService;

public class PetServiceMap extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long>  {
	@Override
	public Set<Pet> findAll(Pet o) {
		// TODO Auto-generated method stub
		return super.findAll();
	}

	@Override
	public Pet save(Pet o) {
		// TODO Auto-generated method stub
		return super.save(o.getId(), o);
	}

	@Override
	public Pet findById(Long id) {
		return super.findById(id);
	}

	@Override
	public void delete(Pet o) {
		super.delete(o);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

}

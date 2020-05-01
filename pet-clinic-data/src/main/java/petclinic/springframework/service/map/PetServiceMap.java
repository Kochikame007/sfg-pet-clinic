package petclinic.springframework.service.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import petclinic.springframework.model.Pet;
import petclinic.springframework.service.CrudService;
import petclinic.springframework.service.PetService;

@Service
public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService  {
	@Override
	public Set<Pet> findAll() {
		// TODO Auto-generated method stub
		return super.findAll();
	}

	@Override
	public Pet save(Pet o) {
		// TODO Auto-generated method stub
		return super.save( o);
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

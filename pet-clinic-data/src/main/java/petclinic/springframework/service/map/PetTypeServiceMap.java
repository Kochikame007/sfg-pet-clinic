package petclinic.springframework.service.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import petclinic.springframework.model.PetType;
import petclinic.springframework.service.PetTypeService;

@Service
public class PetTypeServiceMap extends AbstractMapService<PetType> implements PetTypeService{
	
	@Override
	public Set<PetType> findAll() {
		// TODO Auto-generated method stub
		return super.findAll();
	}

	@Override
	public PetType save(PetType o) {
		// TODO Auto-generated method stub
		return super.save( o);
	}

	@Override
	public PetType findById(Long id) {
		return super.findById(id);
	}

	@Override
	public void delete(PetType o) {
		super.delete(o);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}


}

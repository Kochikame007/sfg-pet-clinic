package petclinic.springframework.service.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import petclinic.springframework.model.Owner;
import petclinic.springframework.model.Pet;
import petclinic.springframework.service.OwnerService;
import petclinic.springframework.service.PetService;
import petclinic.springframework.service.PetTypeService;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {
	
	private final PetService petService;
	private final PetTypeService petTypeService;
	
	public OwnerServiceMap(PetService petService, PetTypeService petTypeService) {
		super();
		this.petService = petService;
		this.petTypeService = petTypeService;
	}

	@Override
	public Set<Owner> findAll() {
		// TODO Auto-generated method stub
		return super.findAll();
	}

	@Override
	public Owner save(Owner o) {
		if (null != o) {
			if (null != o.getPets()) {
				o.getPets().forEach(pet -> {
					if (pet.getPettype() != null) {
						if (pet.getPettype().getId() == null) {
							pet.setPettype(petTypeService.save(pet.getPettype()));
						}
					} else {
						throw new RuntimeException("Pet type is required");
					}
					if (pet.getId() == null) {
						Pet savedPet = petService.save(pet);
						pet.setId(savedPet.getId());
					}
				});
			}
			return super.save(o);
		} else {
			return null;
		}
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

	@Override
	public Owner findByLastName(String lastName) {
		// TODO Auto-generated method stub
		return null;
	}

}

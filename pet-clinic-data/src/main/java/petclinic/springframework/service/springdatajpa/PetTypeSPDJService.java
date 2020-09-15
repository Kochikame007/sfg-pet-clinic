package petclinic.springframework.service.springdatajpa;

import petclinic.springframework.model.PetType;
import petclinic.springframework.repository.PetTypeRepository;

public class PetTypeSPDJService extends AbstractJpaService<PetType, PetTypeRepository> {

	public PetTypeSPDJService(PetTypeRepository repository) {
		super(repository);
		// TODO Auto-generated constructor stub
	}

}

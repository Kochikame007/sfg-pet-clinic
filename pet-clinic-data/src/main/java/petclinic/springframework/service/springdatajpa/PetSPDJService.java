package petclinic.springframework.service.springdatajpa;

import petclinic.springframework.model.Pet;
import petclinic.springframework.repository.PetRepository;

public class PetSPDJService extends AbstractJpaService<Pet, PetRepository> {

	public PetSPDJService(PetRepository repository) {
		super(repository);
	}

}

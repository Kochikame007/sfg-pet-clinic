package petclinic.springframework.service.springdatajpa;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import petclinic.springframework.model.Owner;
import petclinic.springframework.repository.OwnerRepository;
import petclinic.springframework.service.OwnerService;

@Service
@Profile("jpa")
public class OwnerSPDJService extends AbstractJpaService<Owner, OwnerRepository> implements OwnerService {

	public OwnerSPDJService(OwnerRepository repository) {
		super(repository);

	}

	@Override
	public Owner findByLastName(String lastName) {
		return repository.findByLastName(lastName);
	}

	@Override
	public Owner findByLastNameWithPets(String lastName) {
		return repository.findByLastNameWithPets(lastName);
	}
}

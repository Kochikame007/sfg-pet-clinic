package petclinic.springframework.service.springdatajpa;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import petclinic.springframework.model.Vet;
import petclinic.springframework.repository.VetRepository;

@Service
@Profile("vet")
public class VetSDJService extends AbstractJpaService<Vet, VetRepository> {

	public VetSDJService(VetRepository repository) {
		super(repository);
	}

}

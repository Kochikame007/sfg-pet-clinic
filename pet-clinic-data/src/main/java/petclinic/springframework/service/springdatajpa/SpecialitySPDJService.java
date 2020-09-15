package petclinic.springframework.service.springdatajpa;

import petclinic.springframework.model.Specialty;
import petclinic.springframework.repository.SpecialtyRepository;

public class SpecialitySPDJService extends AbstractJpaService<Specialty, SpecialtyRepository>{

	public SpecialitySPDJService(SpecialtyRepository repository) {
		super(repository);
	}

}

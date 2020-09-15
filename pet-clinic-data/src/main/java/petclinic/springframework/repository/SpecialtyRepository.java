package petclinic.springframework.repository;

import org.springframework.data.repository.CrudRepository;

import petclinic.springframework.model.Specialty;

public interface SpecialtyRepository extends CrudRepository<Specialty, Long>{

}

package petclinic.springframework.repository;

import org.springframework.data.repository.CrudRepository;

import petclinic.springframework.model.Vet;

public interface VetRepository extends CrudRepository<Vet , Long> {

}

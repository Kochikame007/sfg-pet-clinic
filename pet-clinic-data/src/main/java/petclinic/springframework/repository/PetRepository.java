package petclinic.springframework.repository;

import org.springframework.data.repository.CrudRepository;

import petclinic.springframework.model.Pet;

public interface PetRepository extends CrudRepository<Pet, Long> {

}

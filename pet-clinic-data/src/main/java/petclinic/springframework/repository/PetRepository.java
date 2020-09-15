package petclinic.springframework.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import petclinic.springframework.model.Pet;

public interface PetRepository extends JpaRepository<Pet, Long> {

}

package petclinic.springframework.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import petclinic.springframework.model.PetType;

public interface PetTypeRepository extends JpaRepository<PetType , Long> {

}

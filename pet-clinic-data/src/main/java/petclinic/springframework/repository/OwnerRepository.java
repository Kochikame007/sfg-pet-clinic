package petclinic.springframework.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import petclinic.springframework.model.Owner;

public interface OwnerRepository extends JpaRepository<Owner, Long> {

	Owner findByLastName(String lastName);

	@Query("SELECT o FROM Owner o LEFT JOIN FETCH o.pets WHERE o.lastName = :lastName")
	Owner findByLastNameWithPets(@Param("lastName")String lastName);

}

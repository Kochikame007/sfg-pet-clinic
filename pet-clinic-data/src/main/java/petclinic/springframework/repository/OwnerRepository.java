package petclinic.springframework.repository;

import org.springframework.data.repository.CrudRepository;

import petclinic.springframework.model.Owner;

public interface OwnerRepository extends CrudRepository<Owner , Long> {

}

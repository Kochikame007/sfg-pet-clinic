package petclinic.springframework.repository;

import org.springframework.data.repository.CrudRepository;

import petclinic.springframework.model.Visit;

public interface VisitRepository extends CrudRepository<Visit , Long>{

}

package petclinic.springframework.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import petclinic.springframework.model.Visit;

public interface VisitRepository extends JpaRepository<Visit , Long>{

}

package petclinic.springframework.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import petclinic.springframework.model.Specialty;

public interface SpecialtyRepository extends JpaRepository<Specialty, Long>{

}

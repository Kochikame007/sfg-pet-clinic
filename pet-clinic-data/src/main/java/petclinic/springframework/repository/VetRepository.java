package petclinic.springframework.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import petclinic.springframework.model.Vet;

public interface VetRepository extends JpaRepository<Vet , Long> {

}

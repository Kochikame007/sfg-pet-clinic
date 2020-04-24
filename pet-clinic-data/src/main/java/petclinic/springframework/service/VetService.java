package petclinic.springframework.service;

import java.util.Set;

import petclinic.springframework.model.Vet;

public interface VetService {

	Vet save(Vet owner);

	Vet findById(long Id);

	Set<Vet> findAll();
}

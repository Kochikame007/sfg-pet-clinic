package petclinic.springframework.service;

import java.util.Set;

import petclinic.springframework.model.Owner;
import petclinic.springframework.model.Pet;

public interface PetService {

	Pet save(Pet pet);

	Pet findById(long Id);

	Set<Pet> findAll();
}

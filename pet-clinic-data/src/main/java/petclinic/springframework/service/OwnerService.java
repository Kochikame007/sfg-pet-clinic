package petclinic.springframework.service;

import java.util.Set;

import petclinic.springframework.model.Owner;

public interface OwnerService {
	
	Owner findByLastName(String lastName);
	
	Owner save(Owner owner);
	
	Owner findById(long Id);
	
	Set<Owner> findAll();
	
	

}

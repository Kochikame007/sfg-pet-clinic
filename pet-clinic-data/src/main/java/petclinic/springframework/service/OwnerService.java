package petclinic.springframework.service;

import petclinic.springframework.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{
	
	Owner findByLastName(String lastName);
	
	
	
	

}

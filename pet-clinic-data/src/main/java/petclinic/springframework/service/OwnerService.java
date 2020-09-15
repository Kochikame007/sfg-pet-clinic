package petclinic.springframework.service;

import petclinic.springframework.model.Owner;

public interface OwnerService extends CrudService<Owner> {

	Owner findByLastName(String lastName);

	Owner findByLastNameWithPets(String lastName);

}

package petclinic.springframework.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import petclinic.springframework.model.Owner;
import petclinic.springframework.model.PetType;
import petclinic.springframework.model.Vet;
import petclinic.springframework.service.OwnerService;
import petclinic.springframework.service.PetTypeService;
import petclinic.springframework.service.VetService;

@Component
public class DataLoader implements CommandLineRunner {

	private final OwnerService ownerService;
	private final VetService vetService;
	private final PetTypeService petTypeService;

	public DataLoader(OwnerService ownerService, VetService vetService ,PetTypeService petTypeService) {
		super();
		this.ownerService = ownerService;
		this.vetService = vetService;
		this.petTypeService = petTypeService;
	}



	@Override
	public void run(String... args) throws Exception {
		PetType dog = new PetType();
		dog.setName("dog");
		PetType savedDog = petTypeService.save(dog);		

		PetType cat = new PetType();
		dog.setName("cat");
		PetType savedCat = petTypeService.save(cat);		

		
		Owner owner = new Owner();
		owner.setId(1L);
		owner.setFirstName("Rajeshwari");
		owner.setLastName("Sharma");
		ownerService.save(owner);

		Owner owner1 = new Owner();
		owner1.setId(2L);
		owner1.setFirstName("Shivam");
		owner1.setLastName("Sharma");
		ownerService.save(owner1);
		System.out.println("owner ..............");

		Vet vet = new Vet();
		vet.setId(1L);
		vet.setFirstName("Rajeshwari");
		vet.setLastName("Sharma");
		vetService.save(vet);

		Vet vet1 = new Vet();
		vet1.setId(2L);
		vet1.setFirstName("Shivam");
		vet1.setLastName("Sharma");
		vetService.save(vet1);
		System.out.println("Vet.........");
	}

}

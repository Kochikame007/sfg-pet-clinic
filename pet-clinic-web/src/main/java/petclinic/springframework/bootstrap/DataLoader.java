package petclinic.springframework.bootstrap;

import java.time.LocalDate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import petclinic.springframework.model.Owner;
import petclinic.springframework.model.Pet;
import petclinic.springframework.model.PetType;
import petclinic.springframework.model.Specialty;
import petclinic.springframework.model.Vet;
import petclinic.springframework.service.OwnerService;
import petclinic.springframework.service.PetTypeService;
import petclinic.springframework.service.SpecialtyService;
import petclinic.springframework.service.VetService;

@Component
public class DataLoader implements CommandLineRunner {

	private final OwnerService ownerService;
	private final VetService vetService;
	private final PetTypeService petTypeService;
	private final SpecialtyService specialtyService;

	public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService,
			SpecialtyService specialtyService) {
		super();
		this.ownerService = ownerService;
		this.vetService = vetService;
		this.petTypeService = petTypeService;
		this.specialtyService = specialtyService;
	}

	@Override
	public void run(String... args) throws Exception {
		int count = petTypeService.findAll().size();
		
		if(count ==0) {
			loadData();
		}
		
	}

	private void loadData() {
		PetType dog = new PetType();
		dog.setName("dog");
		PetType savedDog = petTypeService.save(dog);

		PetType cat = new PetType();
		dog.setName("cat");
		PetType savedCat = petTypeService.save(cat);

		Specialty specialty = new Specialty();
		specialty.setDescription("dentist");
		Specialty savedSpecialty = specialtyService.save(specialty);

		Specialty specialty1 = new Specialty();
		specialty1.setDescription("some desc");
		Specialty savedSpecialty1 = specialtyService.save(specialty1);

//		Specialty specialty2 = new Specialty();
//		specialty2.setDescription("someother desc");
//		Specialty savedSpecialty2 = specialtyService.save(specialty2);

		Owner owner = new Owner();
		owner.setId(1L);
		owner.setFirstName("Rajeshwari");
		owner.setLastName("Sharma");

		owner.setAddress("someaddress");
		owner.setCity("smeCity");
		owner.setTelephone("12345578");

		Pet pet = new Pet();
		pet.setPettype(savedDog);
		pet.setName("Roxy");
		pet.setOwner(owner);
		pet.setDate(LocalDate.now());
		ownerService.save(owner);

		Owner owner1 = new Owner();
		owner1.setId(2L);
		owner1.setFirstName("Shivam");
		owner1.setLastName("Sharma");
		owner1.setAddress("someaddress");
		owner1.setCity("smeCity");
		owner1.setTelephone("12345578");

		Pet pet1 = new Pet();
		pet1.setPettype(savedCat);
		pet.setName("Evee");
		pet1.setOwner(owner1);
		pet1.setDate(LocalDate.now());
		ownerService.save(owner1);
		System.out.println("owner ..............");

		Vet vet = new Vet();
		vet.setId(1L);
		vet.setFirstName("Rajeshwari");
		vet.setLastName("Sharma");
		vet.getSpecialty().add(savedSpecialty);
		

		Vet vet1 = new Vet();
		vet1.setId(2L);
		vet1.setFirstName("Shivam");
		vet1.setLastName("Sharma");
		vet1.getSpecialty().add(savedSpecialty1);
		
		vetService.save(vet);
		vetService.save(vet1);
		System.out.println("Vet.........");
	}
}

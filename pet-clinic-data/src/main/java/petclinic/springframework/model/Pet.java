package petclinic.springframework.model;

import java.time.LocalDate;

public class Pet extends BaseEntity {

	private Owner owner;

	private PetType pettype;
	private LocalDate date;

	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}

	public PetType getPettype() {
		return pettype;
	}

	public void setPettype(PetType pettype) {
		this.pettype = pettype;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

}

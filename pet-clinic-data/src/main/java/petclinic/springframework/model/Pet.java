package petclinic.springframework.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "pets")
public class Pet extends BaseEntity {

	@ManyToOne
	@JoinColumn(name = "owner_id")
	private Owner owner;

	@ManyToOne
	@JoinColumn(name = "type_id")
	private PetType pettype;

	@Column(name = "birth_date")
	private LocalDate birthDate;

	@Column(name = "name")
	private String name;

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
		return birthDate;
	}

	public void setDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

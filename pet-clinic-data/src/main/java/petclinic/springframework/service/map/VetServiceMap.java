package petclinic.springframework.service.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import petclinic.springframework.model.Specialty;
import petclinic.springframework.model.Vet;
import petclinic.springframework.service.SpecialtyService;
import petclinic.springframework.service.VetService;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long>  implements VetService{
	private final SpecialtyService specialtyService;
	
	public  VetServiceMap(SpecialtyService specialtyService) {
		this.specialtyService =specialtyService;
	}
	@Override
	public Set<Vet> findAll() {
		return super.findAll();
	}

	@Override
	public Vet save(Vet o) {
		
		if(o !=null) {
			if(o.getSpecialty() !=null) {
				o.getSpecialty().forEach(specialty ->{
					if(specialty.getId() ==null) {
						Specialty savedSpecialty = specialtyService.save(specialty);
						specialty.setId(savedSpecialty.getId());
					}
				});
			}
		}
		return super.save(o);
	}

	@Override
	public Vet findById(Long id) {
		return super.findById(id);
	}

	@Override
	public void delete(Vet o) {
		super.delete(o);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

}

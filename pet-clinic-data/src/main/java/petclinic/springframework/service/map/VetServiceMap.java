package petclinic.springframework.service.map;

import java.util.Set;

import petclinic.springframework.model.Vet;
import petclinic.springframework.service.CrudService;

public class VetServiceMap extends AbstractMapService<Vet, Long> implements CrudService<Vet, Long>{
	
	@Override
	public Set<Vet> findAll(Vet o) {
		return super.findAll();
	}

	@Override
	public Vet save(Vet o) {
		return super.save(o.getId(), o);
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
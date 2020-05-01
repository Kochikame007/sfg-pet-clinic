package petclinic.springframework.service.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import petclinic.springframework.model.Specialty;
import petclinic.springframework.service.SpecialtyService;

@Service
public class SpecialtyServiceMap extends AbstractMapService<Specialty, Long> implements SpecialtyService {

	@Override
	public Set<Specialty> findAll() {
		// TODO Auto-generated method stub
		return super.findAll();
	}

	@Override
	public Specialty save(Specialty o) {
		// TODO Auto-generated method stub
		return super.save(o);
	}

	@Override
	public Specialty findById(Long id) {
		return super.findById(id);
	}

	@Override
	public void delete(Specialty o) {
		super.delete(o);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

}

package guru.springframework.sfgurupetclinic.services.map;

import guru.springframework.sfgurupetclinic.model.Speciality;
import guru.springframework.sfgurupetclinic.model.Vet;
import guru.springframework.sfgurupetclinic.services.SpecialityService;
import guru.springframework.sfgurupetclinic.services.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

    private final SpecialityService specialityService;

    public VetServiceMap(SpecialityService specialityService) {
        this.specialityService = specialityService;
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Vet save(Vet object) {
        if (object.getSpecialities()!=null){
            object.getSpecialities().forEach(speciality -> {
                if (speciality.getId()==null){
                    Speciality savedSpeciality = specialityService.save(speciality);
                    speciality.setId(savedSpeciality.getId());
                }
            });
            return super.save(object);
        }else{
            throw new RuntimeException("Speciality is Required");
        }

    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }
}

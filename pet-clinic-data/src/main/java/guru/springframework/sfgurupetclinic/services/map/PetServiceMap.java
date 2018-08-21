package guru.springframework.sfgurupetclinic.services.map;

import guru.springframework.sfgurupetclinic.model.Pet;
import guru.springframework.sfgurupetclinic.services.PetService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService{
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.map.remove(id);
    }

    @Override
    public void delete(Pet object) {
        super.map.remove(object);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }
}

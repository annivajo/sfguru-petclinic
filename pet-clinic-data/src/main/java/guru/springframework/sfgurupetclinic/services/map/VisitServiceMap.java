package guru.springframework.sfgurupetclinic.services.map;

import guru.springframework.sfgurupetclinic.model.Owner;
import guru.springframework.sfgurupetclinic.model.Pet;
import guru.springframework.sfgurupetclinic.model.Visit;
import guru.springframework.sfgurupetclinic.services.VisitService;

import java.util.Optional;
import java.util.Set;

public class VisitServiceMap extends AbstractMapService<Visit, Long> implements VisitService {

    @Override
    public Set<Visit> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Visit object) {
        super.delete(object);
    }

    @Override
    public Visit save(Visit object) {
        Optional<Visit> visit = Optional.ofNullable(object);
        Optional<Pet> pet = Optional.ofNullable(visit.get().getPet());
        Optional<Owner> owner = Optional.ofNullable(pet.get().getOwner());

        if (visit.isPresent() &&
                pet.isPresent() && pet.get().getId() != null &&
                owner.isPresent() && owner.get().getId() != null) {
            return super.save(object);
        }else{
            throw new RuntimeException("Invalid Visit");
        }
    }

    @Override
    public Visit findById(Long id) {
        return super.findById(id);
    }
}

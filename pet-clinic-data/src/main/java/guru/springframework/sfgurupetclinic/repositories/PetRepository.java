package guru.springframework.sfgurupetclinic.repositories;

import guru.springframework.sfgurupetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}

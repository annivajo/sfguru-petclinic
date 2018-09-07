package guru.springframework.sfgurupetclinic.repositories;

import guru.springframework.sfgurupetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType,Long> {
}

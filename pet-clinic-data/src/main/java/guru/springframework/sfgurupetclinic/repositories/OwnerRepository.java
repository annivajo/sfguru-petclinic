package guru.springframework.sfgurupetclinic.repositories;

import guru.springframework.sfgurupetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
}

package guru.springframework.sfgurupetclinic.repositories;

import guru.springframework.sfgurupetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OwnerRepository extends CrudRepository<Owner, Long> {

    Owner findByLastName(String name);

    List<Owner> findAllByLastNameLike(String lastName);
}

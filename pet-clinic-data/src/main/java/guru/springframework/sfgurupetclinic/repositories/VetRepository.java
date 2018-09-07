package guru.springframework.sfgurupetclinic.repositories;

import guru.springframework.sfgurupetclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet, Long> {
}

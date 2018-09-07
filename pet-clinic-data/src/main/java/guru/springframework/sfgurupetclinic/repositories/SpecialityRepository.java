package guru.springframework.sfgurupetclinic.repositories;

import guru.springframework.sfgurupetclinic.model.Speciality;
import org.springframework.data.repository.CrudRepository;

public interface SpecialityRepository extends CrudRepository<Speciality, Long> {
}

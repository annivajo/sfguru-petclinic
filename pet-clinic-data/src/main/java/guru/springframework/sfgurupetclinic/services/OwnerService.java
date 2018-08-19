package guru.springframework.sfgurupetclinic.services;

import guru.springframework.sfgurupetclinic.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}

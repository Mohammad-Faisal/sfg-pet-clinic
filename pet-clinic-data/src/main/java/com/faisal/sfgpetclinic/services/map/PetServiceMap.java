package com.faisal.sfgpetclinic.services.map;

import com.faisal.sfgpetclinic.models.Pet;
import com.faisal.sfgpetclinic.services.CrudService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service

public class PetServiceMap extends AbstractMapService<Pet, Long> implements CrudService<Pet , Long> {
    
    
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId() , object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }
}

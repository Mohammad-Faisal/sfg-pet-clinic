package com.faisal.sfgpetclinic.services.map;

import com.faisal.sfgpetclinic.models.Owner;
import com.faisal.sfgpetclinic.services.CrudService;
import com.faisal.sfgpetclinic.services.OwnerService;
import org.springframework.stereotype.Service;

import java.util.Set;


@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {


    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId() , object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}

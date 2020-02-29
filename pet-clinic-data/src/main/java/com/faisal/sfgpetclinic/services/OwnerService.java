package com.faisal.sfgpetclinic.services;

import com.faisal.sfgpetclinic.models.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();

    Owner findByLastName(String lastName);
}

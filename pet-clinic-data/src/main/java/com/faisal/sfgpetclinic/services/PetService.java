package com.faisal.sfgpetclinic.services;

import com.faisal.sfgpetclinic.models.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet Pet);

    Set<Pet> findAll();

}

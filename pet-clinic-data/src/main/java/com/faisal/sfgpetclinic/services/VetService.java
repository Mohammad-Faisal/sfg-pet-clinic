package com.faisal.sfgpetclinic.services;

import com.faisal.sfgpetclinic.models.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();

    Vet findByLastName(String lastName);

}

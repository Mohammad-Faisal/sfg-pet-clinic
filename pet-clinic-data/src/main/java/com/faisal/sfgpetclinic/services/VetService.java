package com.faisal.sfgpetclinic.services;

import com.faisal.sfgpetclinic.models.Owner;
import com.faisal.sfgpetclinic.models.Vet;

import java.util.Set;

public interface VetService extends CrudService<Vet, Long >  {


    Vet findByLastName(String lastName);

}

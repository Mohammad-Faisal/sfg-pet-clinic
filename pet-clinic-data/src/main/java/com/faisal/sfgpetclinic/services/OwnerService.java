package com.faisal.sfgpetclinic.services;

import com.faisal.sfgpetclinic.models.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner , Long > {


    Owner findByLastName(String lastName);
}

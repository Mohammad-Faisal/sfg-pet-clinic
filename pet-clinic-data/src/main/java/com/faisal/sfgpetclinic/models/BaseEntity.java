package com.faisal.sfgpetclinic.models;

import java.io.Serializable;

public class BaseEntity implements Serializable {
    //we could use long but hibernate recommends to use Long because Long can be null but long can't


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    private Long id;

}

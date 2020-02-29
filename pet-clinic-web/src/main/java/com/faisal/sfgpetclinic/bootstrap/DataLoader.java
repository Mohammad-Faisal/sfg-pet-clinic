package com.faisal.sfgpetclinic.bootstrap;

import com.faisal.sfgpetclinic.models.Owner;
import com.faisal.sfgpetclinic.models.Vet;
import com.faisal.sfgpetclinic.services.OwnerService;
import com.faisal.sfgpetclinic.services.VetService;
import com.faisal.sfgpetclinic.services.map.OwnerServiceMap;
import com.faisal.sfgpetclinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private static OwnerService ownerService;
    private static VetService vetService;



    public DataLoader() {
        ownerService = new OwnerServiceMap();
        vetService = new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setFirstName("faisal");
        owner1.setLastName("udin");
        owner1.setId(1L);

        ownerService.save(owner1);


        Vet vet1 = new Vet();

        vet1.setId(1L);
        vet1.setFirstName("mohammad");
        vet1.setLastName("Faisal");

        vetService.save(vet1);

    }

}

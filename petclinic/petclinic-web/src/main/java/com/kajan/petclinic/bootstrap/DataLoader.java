package com.kajan.petclinic.bootstrap;

import com.kajan.petclinic.model.Owner;
import com.kajan.petclinic.model.Vet;
import com.kajan.petclinic.service.OwnerService;
import com.kajan.petclinic.service.VetService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(DataLoader.class);

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setFirstName("panda");
        owner1.setId(1L);
        owner1.setLastName("karady");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("panda1");
        owner2.setLastName("karady1");

        ownerService.save(owner2);

        logger.debug("loaded owners...");

        Vet vet1 = new Vet();
        vet1.setFirstName("foo");
        vet1.setId(1L);
        vet1.setLastName("goo");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("foo1");
        vet2.setId(2L);
        vet2.setLastName("goo1");

        vetService.save(vet2);

        logger.debug("loaded vets...");
    }
}

package com.livemarket.business.gcp.gcpexample.controllers;

import com.google.common.collect.ImmutableList;
import com.livemarket.business.gcp.gcpexample.models.Dog;
import com.livemarket.business.gcp.gcpexample.repository.DogRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
public class DogController {


    @Autowired
    private DogRepository dogRepository;

    @GetMapping("/api/v1/dogs")
    public Iterable<Dog> getAllDogs() {
        String message = "This line was written to the log.";
        String secondMessage = "This line was also written to the log with the same Trace ID.";
        log.info(message);
        log.info(secondMessage);

        log.debug("->getAllDogs");
        ImmutableList.of(new Dog("Fluffy", 5L),
                new Dog("Bob", 6L),
                new Dog("Cupcake", 11L)).forEach( perrito->{

               this.dogRepository.save(perrito);
        });
        return dogRepository.findAll();
    }

    @PostMapping("/api/v1/dogs")
    public Dog saveDog(@RequestBody Dog dog) {
        log.debug("->saveDog {}", dog);
        return dogRepository.save(dog);
    }
}

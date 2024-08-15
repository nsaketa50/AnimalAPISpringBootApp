package com.fun_animal_facts.animal_facts;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.fun_animal_facts.animal_facts.Animals.Animals;

@RestController
public class ControllerClass {

    @Autowired
    AnimalService service;

    @GetMapping(value = "/animal/{animalName}", produces = "application/json")
    public Animals getAnimals(@PathVariable String animalName) {
        return service.getAnimals(animalName);
    }

}

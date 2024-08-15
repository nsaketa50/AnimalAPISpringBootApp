package com.fun_animal_facts.animal_facts.Animals;

import java.util.List;

import lombok.Data;

@Data
public class Animals {
    private String name;
    private Taxonomy taxonomy;
    private List<String> locations;
    private Characteristics characteristics;
}

package com.fun_animal_facts.animal_facts.Animals;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Taxonomy {
    private String family;
}

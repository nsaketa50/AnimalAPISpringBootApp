package com.fun_animal_facts.animal_facts.Animals;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Characteristics {
    private String name_of_young;
    private String estimated_population_size;
    private String habitat;
    private String diet;
    private String common_name;
    private String slogan;
    private String group;
    private String lifespan;
    private String weight;

}

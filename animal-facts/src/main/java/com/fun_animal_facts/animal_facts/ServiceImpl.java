package com.fun_animal_facts.animal_facts;

import com.fun_animal_facts.animal_facts.Animals.Animals;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ServiceImpl implements AnimalService {

    // https://api.api-ninjas.com/v1/animals?name=cheetah
    // &x-api-key=D06khUbNzMyykoGy4J//5w==64uTgzysEDq8Vr3C

    // RestTemplate is used to make HTTP request and handle responses
    @Autowired
    RestTemplate restTemplate;

    @Override
    public Animals getAnimals(String animalName) {
        String API_KEY = "D06khUbNzMyykoGy4J//5w==64uTgzysEDq8Vr3C";
        String API_URL = "https://api.api-ninjas.com/v1/animals?name=" + animalName + "&x-api-key=";
        String url = API_URL + API_KEY;

        // ResponseEntity represent entire HTTP response
        // responseEntity is a variable that holds result of HTTP request
        // restTemplate simplifies making HTTP requests.
        // .getForEntity(url,Animal.class)->Preforms http get request for specific url
        // Animal.class -> class type to which response body will be mapped So,
        // restTemplate will take a response(usually JSON or XML)
        // and convert it into instance of Animals.
        ResponseEntity<Animals[]> responseEntity = restTemplate.getForEntity(url, Animals[].class);

        // Loging the response body
        Animals[] animals = responseEntity.getBody();
        Animals animalsStore = null;

        System.out.println("Response code = " + responseEntity.getBody());

        if (animals != null) {
            animalsStore = animals[0];
            System.out.println("Animal name is " + animalsStore.getName());
        }
        return animalsStore;
    }
}

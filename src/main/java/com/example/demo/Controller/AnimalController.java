package com.example.demo.Controller;

import com.example.demo.Entity.Animal;
import com.example.demo.Entity.AnimalCoord;
import com.example.demo.Service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AnimalController {

    @Autowired
    AnimalService animalService;
    @GetMapping("/getAllAnimals")
    public List<Animal> getAllAnimals(@RequestBody AnimalCoord animalCoord) {
        //System.out.println(2323);
        return animalService.getByDistance(animalCoord);
    }

    @PostMapping("/addAnimal")
    public Animal createCustomer(@RequestBody Animal animal) {

        animalService.insert(animal);
        return animal;
    }

}

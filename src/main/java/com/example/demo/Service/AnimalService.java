package com.example.demo.Service;

import com.example.demo.Entity.Animal;
import com.example.demo.Entity.AnimalCoord;
import com.example.demo.Repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class AnimalService {

    @Autowired
    AnimalRepository animalRepository;
    public void insert(Animal animal) {
        animalRepository.save(animal);
    }

    public List<Animal> getByDistance(AnimalCoord animalCoord) {

        List<Animal> animals = new ArrayList<>();
        animalRepository.findAll().iterator().forEachRemaining(animals::add);


        List<Animal> animals2 = new ArrayList<>();

        for (int i = 0; i < animals.size(); i++) {

            if (animals.get(i).getType().equals(animalCoord.getType())) {
                animals2.add(animals.get(i));
            }
        }

        System.out.println(animalCoord);
        return animals2;
    }
}

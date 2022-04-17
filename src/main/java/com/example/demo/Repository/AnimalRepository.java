package com.example.demo.Repository;

import com.example.demo.Entity.Animal;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimalRepository extends CrudRepository<Animal, Integer> {
    public Animal getById(Integer id);
    public void deleteById(Integer id);
}

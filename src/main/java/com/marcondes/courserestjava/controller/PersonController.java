package com.marcondes.courserestjava.controller;

import com.marcondes.courserestjava.model.Person;
import com.marcondes.courserestjava.services.PersonServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonServices personServices;

    @GetMapping(value = "/{id}")
    public Person findById (@PathVariable (value = "id") String id){
        return personServices.findById(id);
    }

    @GetMapping()
    public List<Person> findAll () {
        return personServices.findAll();
    }

    @PostMapping()
    public Person create(@RequestBody Person person){
        return personServices.create(person);
    }

    @PutMapping()
    public Person update(@RequestBody Person person){
        return personServices.update(person);
    }

    @DeleteMapping(value = "/{id}")
    public void delete (@PathVariable (value = "id") String id){
        personServices.delete(id);
    }
}

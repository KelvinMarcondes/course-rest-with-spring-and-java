package com.marcondes.courserestjava.services;

import com.marcondes.courserestjava.exceptions.ResourceNotFoundException;
import com.marcondes.courserestjava.model.Person;
import com.marcondes.courserestjava.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

@Service
public class PersonServices {
    private Logger logger = Logger.getLogger(PersonServices.class.getName());

    @Autowired
    PersonRepository repository;

    public Person findById(Long id){

        logger.info("Finding one person!");

        Person person = new Person();
        person.setFirstName("Kelvin");
        person.setLastName("Marcondes");
        person.setAddress("Rio Grande da Serra - SP");
        person.setGender("Male");
        return repository.findById(id).orElseThrow(()-> new ResourceNotFoundException("No records found for this Id."));
    }

    public List<Person> findAll() {
        logger.info("Finding all persons!");
        return repository.findAll();
    }

    public Person create(Person person){
        logger.info("Creating person!");
        return repository.save(person);
    }

    public Person update(Person person){
        logger.info("Updating person!");

        var entity = repository.findById(person.getId())
                .orElseThrow(()-> new ResourceNotFoundException("No records found for this Id."));

        entity.setFirstName(person.getFirstName());
        entity.setLastName(person.getLastName());
        entity.setAddress(person.getAddress());
        entity.setGender(person.getGender());

        return repository.save(entity);
    }

    public void delete(Long id) {
        logger.info("delete person!");

        var entity = repository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("No records found for this Id."));

        repository.delete(entity);
    }
}

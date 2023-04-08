package com.marcondes.courserestjava.services;

import com.marcondes.courserestjava.model.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

@Service
public class PersonServices {
    private final AtomicLong counter = new AtomicLong();
    private Logger logger = Logger.getLogger(PersonServices.class.getName());

    public Person findById(String id){

        logger.info("Finding one person!");

        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFirstName("Kelvin");
        person.setLastName("Marcondes");
        person.setAddress("Rio Grande da Serra - SP");
        person.setGender("Male");
        return person;
    }

    public List<Person> findAll() {

        logger.info("Finding all persons!");

        List<Person> persons = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            Person person = mockPerson(i);
            persons.add(person);
        }
        return persons;
    }

    private Person mockPerson(int i) {

        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFirstName("First name " + i);
        person.setLastName("Last name " + i);
        person.setAddress("address " + i);
        person.setGender("Gender " + i);
        return person;
    }

    public Person create(Person person){
        logger.info("Creating person!");
        return person;
    }

    public Person update(Person person){
        logger.info("Updating person!");
        return person;
    }

    public void delete(String id) {
        logger.info("delete person!");
    }
}

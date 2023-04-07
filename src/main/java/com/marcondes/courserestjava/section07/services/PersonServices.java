package com.marcondes.courserestjava.section07.services;

import com.marcondes.courserestjava.section07.model.Person;
import org.springframework.stereotype.Service;

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
        person.setFisrtName("Kelvin");
        person.setLastName("Marcondes");
        person.setAdress("Rio Grande da Serra - SP");
        person.setGender("Male");
        return person;
    }
}

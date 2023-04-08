package com.marcondes.courserestjava.services;


import com.marcondes.courserestjava.model.Car;
import com.marcondes.courserestjava.repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {

    @Autowired
    CarRepository repository;


    public List<Car> findAll(){
        return repository.findAll();
    }
}

package com.marcondes.courserestjava.controller;

import com.marcondes.courserestjava.model.Car;
import com.marcondes.courserestjava.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cars")
public class CarController {

    @Autowired
    CarService service;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Car> findAll(){
        return service.findAll();
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Car findById(@PathVariable Long id){
        return service.findById(id);
    }

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE,
                 consumes = MediaType.APPLICATION_JSON_VALUE)
    public Car create(@RequestBody Car car){
        return service.create(car);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        service.delete(id);
    }

    @PutMapping
    public Car update(@RequestBody Car car){
        return service.update(car);
    }


}

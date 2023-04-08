package com.marcondes.courserestjava.controller;

import com.marcondes.courserestjava.model.Car;
import com.marcondes.courserestjava.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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


}

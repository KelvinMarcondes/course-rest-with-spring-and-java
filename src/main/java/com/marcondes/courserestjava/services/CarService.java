package com.marcondes.courserestjava.services;


import com.marcondes.courserestjava.exceptions.ResourceNotFoundException;
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

    public Car findById(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("ID não encontrado."));
    }

    public Car create(Car car) {
        return repository.save(car);
    }

    public void delete(Long id) {
        var entity = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("ID não encontrado."));
        repository.delete(entity);
    }

    public Car update(Car car){

        var entity = repository.findById(car.getId()).orElseThrow(() -> new ResourceNotFoundException("ID não encontrado."));

        entity.setFabricante(car.getFabricante());
        entity.setAno(car.getAno());
        entity.setCor(car.getCor());
        entity.setPlaca(car.getPlaca());
        entity.setModelo(car.getModelo());

        return repository.save(entity);
    }


}

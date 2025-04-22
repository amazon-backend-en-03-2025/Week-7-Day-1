package com.ironhack.hellojpa.service;

import com.ironhack.hellojpa.model.Coffee;
import com.ironhack.hellojpa.repository.CoffeeRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CoffeeService {

    private final CoffeeRepository coffeeRepository;

    public CoffeeService(CoffeeRepository coffeeRepository) {
        this.coffeeRepository = coffeeRepository;
    }


    public List<Coffee> getAllCoffees() {
        return coffeeRepository.findAll();
    }

    public Coffee getCoffeeById(Long id) {
        Optional<Coffee> coffee = coffeeRepository.findById(id);
        if (coffee.isPresent()) {
            return coffee.get();
        }
        throw new EntityNotFoundException("Coffee with id " + id + " not found");
    }


    public Coffee findCoffeeByName(String name) {
        Optional<Coffee> coffee = coffeeRepository.findByCoffeeName(name);
        if (coffee.isPresent()) {
            return coffee.get();
        }
        throw new EntityNotFoundException("Coffee with name " + name + " not found");

    }
}

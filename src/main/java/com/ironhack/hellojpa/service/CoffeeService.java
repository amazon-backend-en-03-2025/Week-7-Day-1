package com.ironhack.hellojpa.service;

import com.ironhack.hellojpa.model.Coffee;
import com.ironhack.hellojpa.repository.CoffeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

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
        return coffeeRepository.findById(id).orElse(null);
    }
}

package com.example.springLaptop.controller;

import com.example.springLaptop.entities.Laptop;
import com.example.springLaptop.repository.LaptopRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class LaptopController {

    private LaptopRepository laptopRepository;

    public LaptopController(LaptopRepository laptopRepository){
        this.laptopRepository = laptopRepository;
    }

    @GetMapping("/api/laptops")
    public List<Laptop> findAll(){

        return laptopRepository.findAll();
    }

    @GetMapping("/api/laptops/{id}")
    public Laptop findOneById(@PathVariable Long id){

        Optional<Laptop> laptopOptional = laptopRepository.findById(id);
        if(laptopOptional.isPresent())
            return laptopOptional.get();
        else
            return null;
    }
}

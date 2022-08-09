package com.example.springLaptop.repository;

import com.example.springLaptop.entities.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LaptopRepository extends JpaRepository<Laptop, Long> {
}

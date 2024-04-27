package com.example.digitgrow.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.digitgrow.model.*;

@Repository
public interface DigitRepo extends JpaRepository<Digit, Integer> {

}

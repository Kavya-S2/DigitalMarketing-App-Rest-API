package com.example.digitgrow.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.digitgrow.model.*;
import com.example.digitgrow.service.*;

@RestController
public class DigitController {
    @Autowired
    DigitService ds;

    @GetMapping("/api/digits")
    public ResponseEntity<List<Digit>> getAllDigits() {
        List<Digit> digits = ds.getAllDigits();
        if (digits != null && !digits.isEmpty()) {
            return new ResponseEntity<>(digits, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/api/sort/{field}")
    public ResponseEntity<List<Digit>> get(@PathVariable String field) {
        try {
            return new ResponseEntity<>(ds.getbysort(field), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/api/digit")
    public ResponseEntity<Digit> adddata(@RequestBody Digit d) {
        Digit obj = ds.create(d);
        return new ResponseEntity<>(obj, HttpStatus.CREATED);
    }

    @SuppressWarnings("null")
    @PutMapping("/api/digit/{serviceId}")
    public ResponseEntity<Digit> putMethod(@PathVariable("serviceId") int serviceId, @RequestBody Digit pd) {
        if (ds.updateDetails(serviceId, pd) == true) {
            return new ResponseEntity<>(pd, HttpStatus.OK);
        }
        return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/api/digit/{serviceId}")
    public ResponseEntity<Boolean> delete(@PathVariable("serviceId") int serviceId) {
        if (ds.deleteEmployee(serviceId) == true) {
            return new ResponseEntity<>(true, HttpStatus.OK);
        }
        return new ResponseEntity<>(false, HttpStatus.NOT_FOUND);
    }

}

package com.example.digitgrow.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import com.example.digitgrow.model.*;
import com.example.digitgrow.repository.*;

@Service
public class DigitService {
    @Autowired

    DigitRepo dr;

    // post
    public Digit create(Digit d) {
        return dr.save(d);
    }

    // getbyid
    public Digit getbyid(int serviceId) {
        return dr.findById(serviceId).orElse(null);

    }

    public List<Digit> getbysort(String field) {
        return dr.findAll(Sort.by(Sort.Direction.ASC, field));
    }

    // put
    public boolean updateDetails(int serviceId, Digit d) {
        if (dr.findById(serviceId) == null) {
            return false;
        }
        try {
            dr.save(d);

        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public boolean deleteEmployee(int employeeId) {
        if (this.getbyid(employeeId) == null) {
            return false;
        }
        dr.deleteById(employeeId);
        return true;
    }

    public List<Digit> getAllDigits() {
        return dr.findAll();
    }
}

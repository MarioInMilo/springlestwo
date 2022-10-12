package com.example.demo.service.impl;

import com.example.demo.model.Salary;
import com.example.demo.repository.SalaryRepository;

import com.example.demo.service.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class SalaryServiceImpl implements SalaryService {

    @Autowired
    private SalaryRepository repository;

    @Override
    public List<Salary> getMoney(BigDecimal decimal) {
        return repository.findByValueAfter(decimal);
    }
}

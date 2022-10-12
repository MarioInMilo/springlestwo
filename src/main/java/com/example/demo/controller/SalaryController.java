package com.example.demo.controller;


import com.example.demo.bean.CurrencyRequest;
import com.example.demo.bean.CurrencyResponse;
import com.example.demo.model.Salary;
import com.example.demo.repository.SalaryRepository;
import com.example.demo.service.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RestController
public class SalaryController {

    @Autowired
    private SalaryService service;

    @GetMapping("/get/user/money/to/{sum}")
    public List<Salary> getMoney(@PathVariable(name = "sum") BigDecimal decimal){
        return service.getMoney(decimal);
    }











}

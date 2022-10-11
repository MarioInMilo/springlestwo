package com.example.demo.controller;


import com.example.demo.bean.CurrencyRequest;
import com.example.demo.bean.CurrencyResponse;
import com.example.demo.service.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SalaryController {

    @Autowired
    private SalaryService service;

    @GetMapping("/salary/eur/get/")
    public Double salaryToUER(@RequestParam(name = "salary") Integer salary){
        if(salary == null ) {
            return 0.0;
        }
        return service.bynToEur(Double.valueOf(salary.toString()));
    }

    @GetMapping("/salary/usd/get/{salary}")
    public Double salaryToUSD(@PathVariable(name = "salary", required = false) Integer salary,
                              @RequestParam(name = "usdSalary", required = false) Double usdSalary){
//        Double value = 0.0;
//        if(salary !=null){
//            value = service.bynToUsd(Double.valueOf(salary.toString()));
//        }
//        return value;
//
        if(salary != null){

        }else if(usdSalary != null){

        }else {
            return null;
        }


        return salary != null ?
                service.bynToUsd(Double.valueOf(salary.toString()))
                : null;
    }

    @PostMapping("/salary/all/currency")
    public CurrencyResponse allSalary(@RequestBody CurrencyRequest request){
        return service.allCurrency(request);
    }

}

package com.example.demo.controller;


import com.example.demo.bean.CurrencyRequest;
import com.example.demo.bean.CurrencyResponse;
import com.example.demo.model.Salary;
import com.example.demo.repository.SalaryRepository;
import com.example.demo.service.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SalaryController {

    @Autowired
    private SalaryService service;

    @PostMapping("/salary/save")
    public Salary saveSalary(@RequestBody Salary salary) {
        return service.saveSalary(salary);
    }

    @GetMapping("/read/all/salary")
    public List<Salary> allSalaryInfo(){
        return service.getAllSalary();
    }

    @PutMapping("/update/salary")
    public List<Salary> updateSalary(@RequestBody Salary salary){
        return service.updateSalary(salary);
    }


    @DeleteMapping("/delete/salary/by/id")
    public String deleteSalaryById(@PathVariable Integer id){
        return service.deleteSalaryById(id);
    }


    @DeleteMapping("/delete/salary")
    public String deleteSalary(@RequestBody Salary salary){
        return service.deleteSalary(salary);
    }






    //
//    @GetMapping("/salary/eur/get/")
//    public Double salaryToUER(@RequestParam(name = "salary") Integer salary){
//        if(salary == null ) {
//            return 0.0;
//        }
//        return service.bynToEur(Double.valueOf(salary.toString()));
//    }
//
//    @GetMapping("/salary/usd/get/{salary}")
//    public Double salaryToUSD(@PathVariable(name = "salary", required = false) Integer salary,
//                              @RequestParam(name = "usdSalary", required = false) Double usdSalary){
////        Double value = 0.0;
////        if(salary !=null){
////            value = service.bynToUsd(Double.valueOf(salary.toString()));
////        }
////        return value;
////
//        if(salary != null){
//
//        }else if(usdSalary != null){
//
//        }else {
//            return null;
//        }
//
//
//        return salary != null ?
//                service.bynToUsd(Double.valueOf(salary.toString()))
//                : null;
//    }
//
//    @PostMapping("/salary/all/currency")
//    public CurrencyResponse allSalary(@RequestBody CurrencyRequest request){
//        return service.allCurrency(request);
//    }


}

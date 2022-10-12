package com.example.demo.service;

import com.example.demo.bean.CurrencyRequest;
import com.example.demo.bean.CurrencyResponse;
import com.example.demo.model.Salary;

import java.util.List;

public interface SalaryService {
    Salary saveSalary(Salary salary);

    List<Salary> getAllSalary();

    List<Salary> updateSalary(Salary salary);

    String deleteSalaryById(Integer id);

    String deleteSalary(Salary salary);
//    Double bynToUsd(Double byn);
//    Double bynToEur(Double byn);
//
//    CurrencyResponse allCurrency(CurrencyRequest request);

}

package com.example.demo.service.impl;

import com.example.demo.bean.CurrencyRequest;
import com.example.demo.bean.CurrencyResponse;
import com.example.demo.model.Salary;
import com.example.demo.repository.SalaryRepository;
import com.example.demo.service.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalaryServiceImpl implements SalaryService {

    @Autowired
    private SalaryRepository repository;
    @Override
    public Salary saveSalary(Salary salary) {
        return repository.save(salary);
    }

    @Override
    public List<Salary> getAllSalary() {
        return repository.findAll();
    }

    @Override
    public List<Salary> updateSalary(Salary salary) {
        if (salary.getId() != null){
            saveSalary(salary);
        }
        return getAllSalary();
    }

    @Override
    public String deleteSalaryById(Integer id) {
        String info = null;
        try {
            repository.deleteById(id);
            info = "true";
        } catch (Exception exception){
            info = "error";
        }
        return info;
    }

    @Override
    public String deleteSalary(Salary salary) {
        String info = null;
        try {
            info = "true";
            repository.delete(salary);
        }catch (Exception exception){
            info = "error";
        }

        return info;
    }
//    @Override
//    public Double bynToUsd(Double byn) {
//        return byn / 2.5;
//    }
//
//    @Override
//    public Double bynToEur(Double byn) {
//        return byn / 2.44;
//    }
//
//    @Override
//    public CurrencyResponse allCurrency(CurrencyRequest request) {
//        Double salary = request.getSalary();
//
//
//        CurrencyResponse response = new CurrencyResponse();
//
//
//        response.setEur(bynToEur(salary));
//        response.setUsd(bynToUsd(salary));
//
//
//        return response;
//    }
}

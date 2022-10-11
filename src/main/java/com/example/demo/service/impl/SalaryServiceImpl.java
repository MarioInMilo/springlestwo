package com.example.demo.service.impl;

import com.example.demo.bean.CurrencyRequest;
import com.example.demo.bean.CurrencyResponse;
import com.example.demo.service.SalaryService;
import org.springframework.stereotype.Service;

@Service
public class SalaryServiceImpl implements SalaryService {
    @Override
    public Double bynToUsd(Double byn) {
        return byn / 2.5;
    }

    @Override
    public Double bynToEur(Double byn) {
        return byn / 2.44;
    }

    @Override
    public CurrencyResponse allCurrency(CurrencyRequest request) {
        Double salary = request.getSalary();


        CurrencyResponse response = new CurrencyResponse();


        response.setEur(bynToEur(salary));
        response.setUsd(bynToUsd(salary));


        return response;
    }
}

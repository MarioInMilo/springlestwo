package com.example.demo.service;

import com.example.demo.bean.CurrencyRequest;
import com.example.demo.bean.CurrencyResponse;
import com.example.demo.model.Salary;

import java.math.BigDecimal;
import java.util.List;

public interface SalaryService {


    List<Salary> getMoney(BigDecimal decimal);
}

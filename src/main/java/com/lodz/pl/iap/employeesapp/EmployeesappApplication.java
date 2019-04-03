package com.lodz.pl.iap.employeesapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@SpringBootApplication
public class EmployeesappApplication {
    public static void main(String[] args) {
        SpringApplication.run(EmployeesappApplication.class, args);
    }
    public Integer myVar;
}

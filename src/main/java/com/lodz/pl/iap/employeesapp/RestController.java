package com.lodz.pl.iap.employeesapp;

import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
@RequestMapping(value = "/")
public class RestController {
    @RequestMapping(value ="/hello")
    public String HelloReturn() {
        return "Hello!";
    }
}

package com.example.mydemo.controller;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.annotation.PostConstruct;

public class MyCustomService {

    
    @Autowired    
    private Service service;

    
    public void addEmployee() {
        service.add();
    }

}

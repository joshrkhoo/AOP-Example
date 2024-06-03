package com.example.demo.service;

// stereotype annotation to indicate that the class is a service
    // a service is a class that contains business logic
    // business logic includes things such as:
        // data processing
        // data validation
        // data manipulation
        // data retrieval
        // data storage
        // etc.
import org.springframework.stereotype.Service;

@Service
public class DemoService {
    // method that will be executed
    public void execute() {
        System.out.println("Executing method");
    }
}

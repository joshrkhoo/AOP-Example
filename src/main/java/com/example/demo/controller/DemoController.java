package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.service.DemoService;


// @RestController annotation is used to create RESTful web services using Spring MVC
@RestController
public class DemoController {

        // instance of the service
        private final DemoService demoService;

        // constructor
                // constructors are used to initialize objects
        public DemoController(DemoService demoService) {
            this.demoService = demoService;
        }

        // method that will be executed when the endpoint is accessed
        // @GetMapping annotation is used to map HTTP GET requests onto specific handler methods
                // example -> url: http://localhost:8080/execute
        @GetMapping("/execute")
        public String execute() {
            demoService.execute();
            return "Executed";
        }

}
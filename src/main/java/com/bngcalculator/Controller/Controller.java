package com.bngcalculator.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

   @CrossOrigin(origins = "http://localhost:3000")
   @GetMapping("/health")
    public String getHealthCheck() {
        return "You got your endpoint";
    }
}

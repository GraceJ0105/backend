package com.bngcalculator.Controller;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping
public class Controller {

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/health")
    public String getHealthCheck() {
        return "You have reached the endpoint";
    }
    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/postnumber")
    public String submitValue(@RequestBody ValueRequest request) {
        int value = request.getValue();
        value = value*2;
        return "Your value x 2 = " + value;
    }
}

class ValueRequest {
    private int value;

    // Getter and setter
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}

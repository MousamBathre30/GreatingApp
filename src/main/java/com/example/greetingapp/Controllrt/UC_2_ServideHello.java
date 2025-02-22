package com.example.greetingapp.Controllrt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

public class UC_2_ServideHello {
    // UC 2: Fetch "Hello World!" using the Service Layer
    @Autowired
    private GreetingService greetingService;
    @GetMapping("/service-hello")
    public String serviceHello() {
        return greetingService.getSimpleGreeting();
    }

}

package com.example.greetingapp.Controllrt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class UC_4_ADD {
    // UC 4: Save a greeting message

    @Autowired
    private GreetingService greetingService;
    @PostMapping("/add")
    public Greeting addGreeting(@RequestBody Greeting greeting) {
        return greetingService.saveGreeting(greeting);
    }

}

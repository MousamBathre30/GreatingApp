package com.example.greetingapp.Controllrt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

public class UC_5_Find {

    // UC 5: Find a greeting message by ID
    @Autowired
    private GreetingService greetingService;
    @GetMapping("/{id}")
    public Optional<Greeting> getGreetingById(@PathVariable Long id) {
        return greetingService.getGreetingById(id);
    }
}

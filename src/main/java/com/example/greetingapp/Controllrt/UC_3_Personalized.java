package com.example.greetingapp.Controllrt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class UC_3_Personalized {
    // UC 3: Greeting with first name, last name, or both
    @Autowired
    private GreetingService greetingService;
    @GetMapping("/personalized")
    public String personalizedGreeting(
            @RequestParam(required = false) String firstName,
            @RequestParam(required = false) String lastName) {

        return greetingService.getPersonalizedGreeting(firstName, lastName);
    }
}

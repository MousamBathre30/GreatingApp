package com.example.greetingapp.Controllrt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class UC_7_UPDATE {

    // UC 7: Edit a greeting message

    @Autowired
    private GreetingService greetingService;
    @PutMapping("/update/{id}")
    public Greeting updateGreeting(@PathVariable Long id, @RequestBody Greeting updatedGreeting) {
        return greetingService.updateGreeting(id, updatedGreeting);
    }

}

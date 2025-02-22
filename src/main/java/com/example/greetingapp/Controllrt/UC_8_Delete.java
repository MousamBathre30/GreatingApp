package com.example.greetingapp.Controllrt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class UC_8_Delete {


    // UC 8: Delete a greeting message
    @Autowired
    private GreetingService greetingService;
    @DeleteMapping("/delete/{id}")
    public String deleteGreeting(@PathVariable Long id) {
        return greetingService.deleteGreeting(id);
    }
}

package com.example.greetingapp.Controllrt;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/greetings")
public class GreetingController {

    @Autowired
    private GreetingService greetingService;

    // UC 1: Return JSON for different HTTP methods
    @GetMapping("/hello")
    public String hello() {
        return "Hello World!";
    }

}

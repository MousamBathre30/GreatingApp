package com.example.greetingapp.Controllrt;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GreetingService {
    private final GreetingRepository greetingRepository;

    public GreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    // UC 2: Simple Greeting "Hello World"
    public String getSimpleGreeting() {
        return "Hello World!";
    }

    // UC 3: Personalized Greeting
    public String getPersonalizedGreeting(String firstName, String lastName) {
        if (firstName != null && lastName != null) {
            return "Hello " + firstName + " " + lastName + "!";
        } else if (firstName != null) {
            return "Hello " + firstName + "!";
        } else if (lastName != null) {
            return "Hello " + lastName + "!";
        } else {
            return "Hello World!";
        }
    }

    // UC 4: Save a greeting message
    public Greeting saveGreeting(Greeting greeting) {
        return greetingRepository.save(greeting);
    }

    // UC 5: Find a greeting by ID
    public Optional<Greeting> getGreetingById(Long id) {
        return greetingRepository.findById(id);
    }

    // UC 6: List all greetings
    public List<Greeting> getAllGreetings() {
        return greetingRepository.findAll();
    }

    // UC 7: Edit a greeting message
    public Greeting updateGreeting(Long id, Greeting updatedGreeting) {
        return greetingRepository.findById(id).map(greeting -> {
            greeting.setMessage(updatedGreeting.getMessage());
            return greetingRepository.save(greeting);
        }).orElseThrow(() -> new RuntimeException("Greeting not found"));
    }

    // UC 8: Delete a greeting message
    public String deleteGreeting(Long id) {
        greetingRepository.deleteById(id);
        return "Greeting deleted!";
    }
}

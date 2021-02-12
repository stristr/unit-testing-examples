package com.example.demo.untestable;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {
    private final TimeOfDaySystem timeOfDaySystem;

    public GreetingService() {
        this.timeOfDaySystem = new TimeOfDaySystem();
    }

    public String sayHello() {
        return timeOfDaySystem.isMorning() ? "Good morning" : "Goodnight";
    }
}

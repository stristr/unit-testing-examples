package com.example.demo.mosttestable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {
    private final TimeOfDaySystem timeOfDaySystem;

    @Autowired
    public GreetingService(TimeOfDaySystem timeOfDaySystem) {
        this.timeOfDaySystem = timeOfDaySystem;
    }

    public String sayHello() {
        return timeOfDaySystem.isMorning() ? "Good morning" : "Goodnight";
    }
}

package com.example.demo.moretestable;

import java.util.Random;
import org.springframework.stereotype.Component;

@Component
public class TimeOfDaySystem {
    private Random random = new Random();

    public boolean isMorning() {
        return random.nextInt(100) < 50;
    }
}

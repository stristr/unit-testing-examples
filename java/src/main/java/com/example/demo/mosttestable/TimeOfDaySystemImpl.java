package com.example.demo.mosttestable;

import java.util.Random;
import org.springframework.stereotype.Component;

@Component
public class TimeOfDaySystemImpl implements TimeOfDaySystem {
    private Random random = new Random();

    public boolean isMorning() {
        return random.nextInt(100) < 50;
    }
}

package com.example.demo.untestable;

import java.util.Random;

public class TimeOfDaySystem {
    private Random random = new Random();

    public boolean isMorning() {
        return random.nextInt(100) < 50;
    }
}

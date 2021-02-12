package com.example.demo.untestable;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = GreetingService.class)
class GreetingServiceTest {
    @Autowired GreetingService greetingService;
    @Test
    void sayHello() {
        // TimeOfDaySystem in the untestable namespace is totally outside our control.
        // How can we control the time of day for the purpose of testing?
        System.out.println(greetingService.sayHello());
        System.out.println(greetingService.sayHello());
        System.out.println(greetingService.sayHello());
        System.out.println(greetingService.sayHello());
    }
}

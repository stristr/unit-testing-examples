package com.example.demo.mosttestable;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@SpringBootTest(classes = GreetingService.class)
class GreetingServiceTest {
    @MockBean
    TimeOfDaySystem timeOfDaySystem;
    @Autowired
    GreetingService greetingService;

    @Test
    void sayHelloInTheMorning() {
        when(timeOfDaySystem.isMorning()).thenReturn(true);
        assertThat(greetingService.sayHello()).isEqualTo("Good morning");
    }

    @Test
    void sayHelloAtNight() {
        when(timeOfDaySystem.isMorning()).thenReturn(false);
        assertThat(greetingService.sayHello()).isEqualTo("Goodnight");
    }
}

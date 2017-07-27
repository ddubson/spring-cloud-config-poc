package com.dmitriydubson.poc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.MOCK;

public class AppRestControllerTest {
    @Test
    public void envWelcome_shoulReturnProperEnvironmentGreeting() {
        AppRestController controller = new AppRestController("Hello World!");

        assertThat(controller.welcome(), equalTo("Hello World!"));
    }
}
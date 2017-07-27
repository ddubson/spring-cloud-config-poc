package com.dmitriydubson.poc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = RANDOM_PORT,
        properties = "classpath:application.yml")
public class AppRestControllerAcceptanceTest {
    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void welcome_shouldReturnGreetingFromConfiguration() {
        String body = this.restTemplate.getForObject("/", String.class);
        assertThat(body, equalTo("Hello! from a test."));
    }
}

package com.dmitriydubson.poc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@Controller
@EnableAutoConfiguration
public class App {
    @Value("${hello.world}")
    String helloWorldString;

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return helloWorldString;
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(App.class, args);
    }
}

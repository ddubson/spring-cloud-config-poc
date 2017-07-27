package com.dmitriydubson.poc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppRestController {
    private final String envWelcome;

    public AppRestController(@Value("${environment.welcome}") String envWelcome) {
        this.envWelcome = envWelcome;
    }

    @GetMapping
    public String welcome() {
        return envWelcome;
    }
}

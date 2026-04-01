package com.example.TestingJenkins;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello CI/CD";
    }

@GetMapping("/testwebhook")
    public String webhooktest() {
        return "auto triggered using webhook";
    }

    @GetMapping("/testwebhook")
    public String Jenkinstest() {
        return "auto triggered using webhook and build in jenkins is triggered";
    }
}
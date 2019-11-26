package com.example.AWS;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AWSController {

    @GetMapping("/healthCheck")
    public String getUserById() {
        return "healty";
    }
}
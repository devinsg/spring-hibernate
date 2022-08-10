package com.demo.bigbear.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HomeController {
    @Value("${app.version}")
    private String appVersion;

    @GetMapping("/status")
    public String greeting (Map<String, Object> model) {
        model.put("version:", appVersion);
        return model.toString();
    }
}

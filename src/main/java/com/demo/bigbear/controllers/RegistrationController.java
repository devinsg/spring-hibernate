package com.demo.bigbear.controllers;

import com.demo.bigbear.models.Registration;
import com.demo.bigbear.models.RegistrationReport;
import com.demo.bigbear.services.IRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/registration")
public class RegistrationController {
    @Autowired
    private IRegistrationService registrationService;

    @GetMapping(path = "/")
    public List<Registration> getRegistration() {
        return registrationService.findAll();
    }

    @PostMapping(path = "/")
    public Registration postRegistration(@RequestBody Registration registration) {
        return registrationService.addRegistration(registration);
    }

    @GetMapping(path = "/report")
    public List<RegistrationReport> getRegistrationReport() {
        return registrationService.findAllReport();
    }
}

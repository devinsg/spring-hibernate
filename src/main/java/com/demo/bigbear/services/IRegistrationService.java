package com.demo.bigbear.services;

import com.demo.bigbear.models.Registration;
import com.demo.bigbear.models.RegistrationReport;

import java.util.List;

public interface IRegistrationService {
    Registration addRegistration(Registration registration);

    List<Registration> findAll();

    List<RegistrationReport> findAllReport();
}

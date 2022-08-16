package com.demo.bigbear.repositories;

import com.demo.bigbear.models.Registration;
import com.demo.bigbear.models.RegistrationReport;

import java.util.List;

public interface IRegistrationRepository {
    Registration save(Registration registration);
    List<Registration> findAll();
    List<RegistrationReport> findAllReport();
    List<RegistrationReport> findAllReportByNamedQuery();
}

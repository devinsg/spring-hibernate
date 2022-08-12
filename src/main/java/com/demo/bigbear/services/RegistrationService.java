package com.demo.bigbear.services;

import com.demo.bigbear.models.Course;
import com.demo.bigbear.models.Registration;
import com.demo.bigbear.models.RegistrationReport;
import com.demo.bigbear.repositories.ICourseRepository;
import com.demo.bigbear.repositories.IRegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class RegistrationService implements IRegistrationService {

    @Autowired
    private IRegistrationRepository registrationRepository;

    @Autowired
    private ICourseRepository courseRepository;

    @Override
    @Transactional
    public Registration addRegistration(Registration registration) {
        registration = registrationRepository.save(registration);

        Course course = new Course();
        course.setName("Intro");
        course.setDescription("Everyone must attend The Introduction");
        course.setRegistration(registration);

        courseRepository.save(course);
        return registration;
    }

    @Override
    public List<Registration> findAll() {
        return registrationRepository.findAll();
    }

    @Override
    public List<RegistrationReport> findAllReport() {
        return registrationRepository.findAllReport();
    }
}

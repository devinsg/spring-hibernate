package com.demo.bigbear.repositories;

import com.demo.bigbear.models.Registration;
import com.demo.bigbear.models.RegistrationReport;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class RegistrationRepository implements IRegistrationRepository {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Registration save(Registration registration) {
        entityManager.persist(registration);
        return registration;
    }

    @Override
    public List<Registration> findAll() {
        return entityManager.createQuery("SELECT R FROM Registration R").getResultList();
    }

    @Override
    public List<RegistrationReport> findAllReport() {
        String jpql = "SELECT new com.demo.bigbear.models.RegistrationReport " +
                "(R.name, R.description, C.name, C.description, C.totalHours) " +
                "FROM Registration R, Course C " +
                "WHERE R.id = C.registration.id";
        return entityManager.createQuery(jpql).getResultList();
    }
}

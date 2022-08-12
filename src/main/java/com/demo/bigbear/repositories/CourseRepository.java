package com.demo.bigbear.repositories;

import com.demo.bigbear.models.Course;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class CourseRepository implements ICourseRepository {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Course save(Course course){
        entityManager.persist(course);
        return course;
    }
}

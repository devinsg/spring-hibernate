package com.demo.bigbear.repositories;

import com.demo.bigbear.models.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserRepository implements IUserRepository {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public User create(User user) {
        entityManager.persist(user);
        return user;
    }

    @Override
    public User update(User user) {
        entityManager.merge(user);
        return user;
    }

    @Override
    public List<User> getList(String keyword) {
        List<User> users  = entityManager.createQuery("SELECT u FROM User u")
                .getResultList();
        return users;
    }
}

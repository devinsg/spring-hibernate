package com.demo.bigbear.services;

import com.demo.bigbear.models.User;
import com.demo.bigbear.repositories.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class UserService implements IUserService {
    @Autowired
    private IUserRepository userRepository;

    @Override
    @Transactional
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    @Transactional
    public List<User> getList(String keyword) { return userRepository.getList(keyword); }
}

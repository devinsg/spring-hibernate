package com.demo.bigbear.services;

import com.demo.bigbear.models.User;

import java.util.List;

public interface IUserService {
    User save(User user);

    List<User> getList(String keyword);
}

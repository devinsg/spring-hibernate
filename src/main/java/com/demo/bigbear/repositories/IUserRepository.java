package com.demo.bigbear.repositories;

import com.demo.bigbear.models.User;

import java.util.List;

public interface IUserRepository {
    User save(User user);

    List<User> getList(String keyword);
}

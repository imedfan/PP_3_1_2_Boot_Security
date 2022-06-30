package ru.kata.spring.boot_security.demo.service;

import org.apache.catalina.User;

public interface UserService {
    void save(User user);

    User findUsername(String username);
}

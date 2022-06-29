package ru.kata.spring.boot_security.demo.service;


import java.util.List;

import ru.kata.spring.boot_security.demo.model.User;

public interface UserService {
    void addUser(User user);

    User getUser(long id);

    void deleteUser(long id);

    void updateUser(User user);

    List<User> getAllUsers();
}

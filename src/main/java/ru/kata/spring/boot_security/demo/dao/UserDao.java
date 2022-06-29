package ru.kata.spring.boot_security.demo.dao;

import java.util.List;

import ru.kata.spring.boot_security.demo.model.User;



public interface UserDao {
    void addUser(User user);

    User getUser(long id);

    void deleteUser(long id);

    void updateUser(User user);

    List<User> getAllUsers();
}

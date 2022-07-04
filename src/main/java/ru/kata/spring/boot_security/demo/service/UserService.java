package ru.kata.spring.boot_security.demo.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;

public interface UserService extends UserDetailsService {
    void add(User user);
    User getUserById(int id);
    void delete(int id);
    void update(User user, int id);
    List<User> getAllUsers();
    User getUserByName(String username);

}

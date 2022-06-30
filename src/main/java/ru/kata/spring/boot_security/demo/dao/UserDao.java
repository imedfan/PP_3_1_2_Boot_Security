package ru.kata.spring.boot_security.demo.dao;

import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Long> {
    User findByUsername(String username);
}

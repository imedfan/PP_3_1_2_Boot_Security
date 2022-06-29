package ru.kata.spring.boot_security.demo.dao;



import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

import org.springframework.stereotype.Repository;

import ru.kata.spring.boot_security.demo.model.User;



@Repository
public class UserDaoImpl implements UserDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void addUser(User user) {
        this.entityManager.persist(user);
    }

    @Override
    public void deleteUser(long id) {
        entityManager.createQuery("delete from User where id = :id").setParameter("id", (int) id).executeUpdate();
    }

    @Override
    public void updateUser(User user) {
        System.out.println(user.toString());
        entityManager
                .createQuery("update User set username = :username, password = :password")
                .setParameter("username", user.getUsername())
                .setParameter("age", user.getPassword())
                .setParameter("id", user.getUserId())
                .executeUpdate();
    }

    @Override
    public List<User> getAllUsers() {
        return entityManager.createQuery("FROM User").getResultList();
    }

    @Override
    public User getUser(long id) {
        User user = entityManager.find(User.class, (int) id);
        return user;
    }

}

package ru.kata.spring.boot_security.demo.model;


import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String username;

    @Column
    private String password;

    @ManyToMany
    @JoinTable(name = "user_role", joinColumns = {@JoinColumn(name = "user_id")}) // TODO дописать множкствыо ролей в юзере 
    Set<Role> roles;
}

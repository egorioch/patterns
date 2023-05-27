package org.patterns.dto;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

//@Table
//@Entity
@Getter
@Setter
public class User {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String username;
    private String password;
    private String email;
//    @OneToMany
//    private List<Order> orders;
}

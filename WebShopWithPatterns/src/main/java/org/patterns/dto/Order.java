package org.patterns.dto;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

//
//@Table
//@Entity
@Getter
@Setter
public class Order {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
//    @ManyToOne
//    @JoinColumn(name = "user_id")
//    private User user;
//    @OneToMany
//    private List<Beer> beerList;

}

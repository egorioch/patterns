package org.patterns.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Table
@Entity
@Getter
@Setter
@ToString(of = {"id", "name", "description", "price"})
public class Beer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String description;
    private float price;
    private int quantity;
//    @ElementCollection
//    private List<String> beersName;
}

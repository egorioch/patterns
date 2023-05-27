package org.patterns.dto;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.Map;


@Getter
@Setter
public class Order {
    private Long id;
    private Map<String, Integer> products;
    private String paymentMethod;
    private float totalPrice;

    // Конструктор и геттеры/сеттеры
}

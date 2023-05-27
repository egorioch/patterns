package org.patterns.builder;

import org.patterns.dto.Order;

import java.util.Map;

public class OrderBuilder {
    private Order order;

    public OrderBuilder() {
        this.order = new Order();
    }

    public OrderBuilder withMap(Map<String, Integer> products) {
        this.order.setProducts(products);
        return this;
    }

    public OrderBuilder withPaymentMethod(String paymentMethod) {
        this.order.setPaymentMethod(paymentMethod);
        return this;
    }

    public OrderBuilder withTotalPrice(float totalPrice) {
        this.order.setTotalPrice(totalPrice);
        return this;
    }

    public Order build() {
        System.out.println("Заказ с суммой " + this.order.getTotalPrice() + " создан!");
        return this.order;
    }
}

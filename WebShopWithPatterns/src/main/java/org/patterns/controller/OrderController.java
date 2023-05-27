package org.patterns.controller;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.patterns.builder.OrderBuilder;
import org.patterns.dto.Order;
import org.patterns.stategy.CreditCardStrategy;
import org.patterns.stategy.PayPalStrategy;
import org.patterns.stategy.PaymentContext;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

@RestController
@CrossOrigin(origins = "http://localhost:8000")
@RequestMapping("/order")
public class OrderController {
    private Map<String, String> orderJsonMap;
    private Map<String, Integer> products = new HashMap<>();
    private String paymentMethod;
    private float totalPrice;
    private Order order;

    @PostMapping("/make_payment")
    public void orderPost(@RequestBody String orderJson) {
        System.out.println("product in cart: " + orderJson);

        Type type = new TypeToken<Map<String, String>>(){}.getType();
        Gson gson = new Gson();
        orderJsonMap = gson.fromJson(orderJson, type);

        orderJsonMap.forEach((key, value) -> System.out.println("key: " + key + ", value: " + value));
        parseInfo();
    }

    public void parseInfo() {
        orderJsonMap.forEach((key, value) -> {
            if (value.matches("\\d+")) {
                products.put(key, Integer.valueOf(value));
            } else {
                paymentMethod = value;
            }
        });

        performOrder();
    }

    public void performOrder() {
        PaymentContext paymentContext = new PaymentContext();

        if (paymentMethod.equals("creditCard")) {
            paymentContext.setPaymentStrategy(new CreditCardStrategy("1234 5678 9012 3456", "123", "12/25"));
        } else {
            paymentContext.setPaymentStrategy(new PayPalStrategy("example@gmail.com", "password123"));
        }

        countPriceByAmount();
        paymentContext.performPayment(totalPrice);

        createOrderWithBuilder();
    }

    //создаем заказ
    private void createOrderWithBuilder() {
        order = new OrderBuilder()
                .withMap(products)
                .withPaymentMethod(paymentMethod)
                .withTotalPrice(totalPrice)
                .build();
    }

    //считаем общую сумму заказа
    private void countPriceByAmount() {
        products.forEach((key, value) -> {
            switch (key) {
                case "miller" -> { totalPrice = 100 * value;}
                case "bud" -> { totalPrice = 75 * value; }
                case "zhigulevskoe" -> { totalPrice = 50 * value; }
            }
        });
    }
}

package org.patterns.controller;

import com.google.gson.Gson;
import org.springframework.web.bind.annotation.*;
import java.lang.reflect.Type;
import java.util.Map;

import com.google.gson.reflect.TypeToken;

@RestController
@CrossOrigin(origins = "http://localhost:8000")
public class CartController {
    private Map<String, Integer> productsMap;

    @PostMapping("/cart/add_products")
    public void addBeerToCart(@RequestBody String productInCart) {
        System.out.println("product in cart: " + productInCart);
        Type type = new TypeToken<Map<String, Integer>>(){}.getType();
        Gson gson = new Gson();
        productsMap = gson.fromJson(productInCart, type);

        productsMap.forEach((key, value) -> System.out.println("key: " + key + ", value: " + value));
    }

    @GetMapping("/cart/get_products")
    public Map<String, Integer> getProductsMap() {
        return productsMap;
    }
}

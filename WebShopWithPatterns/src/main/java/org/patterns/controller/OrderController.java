package org.patterns.controller;

import com.google.gson.Gson;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:8000")
@RequestMapping("/order")
public class OrderController {

    @PostMapping
    public void orderPost(@RequestParam String orderJson) {
        Gson gson = new Gson();
        System.out.println("orderJson: " + orderJson);
    }
}

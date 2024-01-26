package org.example.spring_core_3;

import org.springframework.stereotype.Component;

@Component
public class OrderServiceB implements OrderService{
    @Override
    public String Order() {
        return "Order From Service B";
    }
}

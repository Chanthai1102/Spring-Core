package org.example.spring_core_3;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class OrderServiceA implements OrderService{
    @Override
    public String Order() {
        return "Order From Service A";
    }
}

package org.example.spring_core_3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class OrderClient {
    @Qualifier("orderServiceA")
    @Autowired
    private OrderService orderService;

    public void displayOrder(){
        System.out.println(orderService.Order());
    }
}

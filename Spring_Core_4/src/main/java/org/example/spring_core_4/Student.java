package org.example.spring_core_4;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.security.PrivateKey;

@Component
public class Student {
    @Autowired
    private Subject subject;
    @PostConstruct
    public void setUp(){
        System.out.println("Create");
    }
    @PreDestroy
    public void clear(){
        System.out.println("Clear");
    }
    public void display(){
        subject.setSubject();
    }
}

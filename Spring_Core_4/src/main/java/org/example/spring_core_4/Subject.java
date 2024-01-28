package org.example.spring_core_4;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class Subject {
    private String title;
    @PostConstruct
    public void init(){
        System.out.println("Subject Created");
    }
    public void setSubject(){
        System.out.println("SetSubject Method");
    }
}

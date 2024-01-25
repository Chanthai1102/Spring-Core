package org.spring_core.spring_core_2;

import org.springframework.beans.factory.annotation.Autowired;

public class GreetingApplication {

    @Autowired
    private GreetingService greetingService;

    public void greet(){
        greetingService.sayHello();
    }
}

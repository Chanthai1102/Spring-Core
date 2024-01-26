package org.spring_core.spring_core_2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    int counter ;
    @Bean
    public String myString(){
        System.out.println(++counter);
        return "Dara";
    }

    @Bean
    public GreetingService getGreetingService(){
        return new GreetingThailand();
    }

    @Bean
    public GreetingApplication greetingApplication(){
        return new GreetingApplication();
    }
}

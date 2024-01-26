package org.spring_core.spring_core_2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class BeanConfig2 {
    @Bean
    List<Integer> score(){
        return List.of(45,65,75);
    }
}

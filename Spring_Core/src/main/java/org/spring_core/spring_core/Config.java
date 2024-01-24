package org.spring_core.spring_core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public Game game(){
        return new ZoombieGame();
    }

    @Bean
    public GameRunner gameRunner(Game game){
        return new GameRunner(game);
    }
}

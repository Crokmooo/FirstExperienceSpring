package fr.crokmoo.spring;

import fr.crokmoo.spring.game.GameRunner;
import fr.crokmoo.spring.game.GamingConsole;
import fr.crokmoo.spring.game.PacManGame;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfiguration {



    @Bean
    public GamingConsole game() {
        var game = new PacManGame(); //1 : Object creation
        return game;
    }

    @Bean
    public GameRunner gameRunner(GamingConsole game) {
        var gameRunner = new GameRunner(game);
        return gameRunner;
    }
}

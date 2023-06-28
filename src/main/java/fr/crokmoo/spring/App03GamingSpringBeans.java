package fr.crokmoo.spring;

import fr.crokmoo.spring.game.GameRunner;
import fr.crokmoo.spring.game.GamingConsole;
import fr.crokmoo.spring.game.PacManGame;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App03GamingSpringBeans {

    public static void main(String[] args) {

        try (var context =
                 new AnnotationConfigApplicationContext
                        (GamingConfiguration.class);) {

            context.getBean(GamingConsole.class).up();

            context.getBean(GameRunner.class).run();
        }
    }
}



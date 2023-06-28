package fr.crokmoo.spring;

import fr.crokmoo.spring.game.GameRunner;
import fr.crokmoo.spring.game.PacManGame;

public class App01GamingBasicJava {

    public static void main(String[] args) {

        //var game = new MarioGame();
        //var game = new SuperContraGame();

        var game = new PacManGame(); //1 : Object creation

        var gameRunner = new GameRunner(game);
            //2 : Object Creation + Wiring of Dependencies
            //Game is a Dependency of GameRunner
        gameRunner.run();
    }

}



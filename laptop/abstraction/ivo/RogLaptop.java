package laptop.abstraction.ivo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RogLaptop extends Laptop implements GamingLaptop {
    private List<Game> games = new ArrayList<>();

    public RogLaptop() {
        super();
    }

    public RogLaptop(String brand, String model, BigDecimal price, int gpu, double frameRatePerSecond, List<Game> games) {
        super(brand, model, price, gpu, frameRatePerSecond);
        this.games = games;
    }

    @Override
    public Game findGame(String gameName) {
        for (Game game : games) {
            if (game.getName().equals(gameName)) {
                return game;
            }
        }
        return new Game();
    }

    @Override
    public void testGpu() {
        if (isGpuGood()) {
            System.out.println("GPU is good!");
            return;
        }
        System.out.println("GPU is not good. Must be greater than 32!");
        setGpu(32);
        System.out.println("It's fine now!");
    }

    @Override
    public void modifyFrameRate(double frameRate) {
        setFrameRatePerSecond(frameRate);
    }

    public void playingGame(String gameName) {
        if (!findGame(gameName).getName().equals("")) {
            Random rn = new Random();
            int hours = rn.nextInt(10) + 1;
            System.out.println(findGame(gameName).getName() + " was player for " + hours + " hours!");
            return;
        }
        System.out.println("The game not found!");
    }

    @Override
    public String toString() {
        return super.toString() + "\nGames:\n" + gamesToString();
    }

    private String gamesToString() {
        String gamesStr = "";
        for (Game game : this.games) {
            gamesStr += "   " + game.getName() + "\n";
        }
        return gamesStr;
    }
}

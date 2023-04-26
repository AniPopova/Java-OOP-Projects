package laptop.abstraction.ivo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        introduceLaptop();
    }

    public static void introduceLaptop() {
        List<Game> games = gamesCollection();
        List<Folder> folders = foldersCollection();
        RogLaptop rogLaptop = new RogLaptop("Acer", "Nitro 5", BigDecimal.valueOf(3600), 32, 28, games);
        NoteBookLaptop noteBookLaptop = new NoteBookLaptop("Acer", "Nitro 5", BigDecimal.valueOf(3600), 32, 28, folders);
        LaptopStarter laptopStarter = new LaptopStarter(rogLaptop, noteBookLaptop);
        System.out.println(laptopStarter);
        laptopStarter.start();
    }

    public static List<Game> gamesCollection() {
        List<Game> games = new ArrayList<>();
        Game game1 = new Game("League of legends", BigDecimal.valueOf(0));
        games.add(game1);
        Game game2 = new Game("FIFA 23", BigDecimal.valueOf(160));
        games.add(game2);
        Game game3 = new Game("World of warcraft", BigDecimal.valueOf(100));
        games.add(game3);
        Game game4 = new Game("Hearthstone", BigDecimal.valueOf(0));
        games.add(game4);
        Game game5 = new Game("CS", BigDecimal.valueOf(0));
        games.add(game5);
        Game game6 = new Game("Overwatch", BigDecimal.valueOf(50));
        games.add(game6);
        Game game7 = new Game("Diablo III", BigDecimal.valueOf(40));
        games.add(game7);
        Game game8 = new Game("StarCraft", BigDecimal.valueOf(30));
        games.add(game8);
        return games;
    }

    public static List<Folder> foldersCollection() {
        List<Folder> folders = new ArrayList<>();
        Folder folder1 = new Folder("C:\\Users\\Ivo\\doc");
        folders.add(folder1);
        Folder folder2 = new Folder("C:\\Users\\Public");
        folders.add(folder2);
        Folder folder3 = new Folder("E:\\downloads\\Microsoft");
        folders.add(folder3);
        Folder folder4 = new Folder("F:\\license");
        folders.add(folder4);
        Folder folder5 = new Folder("C:\\Windows\\debug");
        folders.add(folder5);
        return folders;
    }
}

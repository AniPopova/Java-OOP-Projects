package laptop.abstraction.ivo;

import java.util.Scanner;

public class LaptopStarter {
    private RogLaptop rogLaptop;
    private NoteBookLaptop noteBookLaptop;

    public LaptopStarter() {
        this.rogLaptop = new RogLaptop();
        this.noteBookLaptop = new NoteBookLaptop();
    }

    public LaptopStarter(RogLaptop rogLaptop, NoteBookLaptop noteBookLaptop) {
        this.rogLaptop = rogLaptop;
        this.noteBookLaptop = noteBookLaptop;
        if (!isTheSameLaptop()) {
            System.out.println("These laptops are different!");
            this.rogLaptop = new RogLaptop();
            this.noteBookLaptop = new NoteBookLaptop();
        }
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        noteBookLaptop.powerUp();
        String wish = "";
        while (!wish.toLowerCase().equals("shut down")) {
            System.out.println("If you want to play enter ( play )!");
            System.out.println("If you want to work enter ( work )!");
            System.out.println("If you want to shut down the computer enter ( shut down )!");
            wish = scanner.nextLine();
            if (wish.toLowerCase().equals("play")) {
                System.out.println("Enter the name of the game");
                String gameName = scanner.nextLine();
                this.rogLaptop.playingGame(gameName);
            } else if (wish.toLowerCase().equals("work")) {
                System.out.println("Enter the name of the folder");
                String folderName = scanner.nextLine();
                this.noteBookLaptop.working(folderName);
            } else if (!wish.toLowerCase().equals("shut down")) {
                System.out.println("Invalid wish!");
            }
        }
    }

    @Override
    public String toString() {
        return rogLaptop.toString() + "\nFolders:\n" + noteBookLaptop.foldersToString();
    }

    private boolean isTheSameLaptop() {
        if (this.noteBookLaptop.getBrand().equals(this.rogLaptop.getBrand()) &&
                this.noteBookLaptop.getModel().equals(this.rogLaptop.getModel()) &&
                this.noteBookLaptop.getPrice().equals(this.rogLaptop.getPrice())) {
            return true;
        }
        return false;
    }
}

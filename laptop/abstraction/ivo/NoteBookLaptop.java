package laptop.abstraction.ivo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NoteBookLaptop extends Laptop implements UserLaptop {
    private List<Folder> folders = new ArrayList<>();

    public NoteBookLaptop() {
        super();
    }

    public NoteBookLaptop(String brand, String model, BigDecimal price, int gpu, double frameRatePerSecond, List<Folder> folders) {
        super(brand, model, price, gpu, frameRatePerSecond);
        this.folders = folders;
    }

    @Override
    public void powerUp() {
        setStarted(true);
        System.out.println("The laptop is on!");
    }

    @Override
    public void shutDown() {
        setStarted(false);
        System.out.println("The laptop is off!");
    }

    @Override
    public Folder findFolder(String folderName) {
        for (int i = 0; i < folders.size(); i++) {
            if (folders.get(i).getPath().equals(folderName)) {
                return folders.get(i);
            }
        }
        return new Folder();
    }

    public void working(String gameName) {
        if (!findFolder(gameName).getPath().equals("")) {
            Random rn = new Random();
            int hours = rn.nextInt(10) + 1;
            System.out.println("The work in " + findFolder(gameName).getPath() + " was done in " + hours + " hours!");
            return;
        }
        System.out.println("The folder not found!");
    }

    @Override
    public String toString() {
        return super.toString() + "\nFolders:\n" + foldersToString();
    }

    protected String foldersToString() {
        String gamesStr = "";
        for (Folder folder : this.folders) {
            gamesStr += "   " + folder.getPath() + "\n";
        }
        return gamesStr;
    }
}

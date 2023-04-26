package mentor.laptopAbstraction;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  static Scanner scanner = new Scanner(System.in);
  public static void main(String[] args) {

    List<Game> games = new ArrayList<>();
    List<Folder> folders = new ArrayList<>();


    System.out.println("Please choose what kind of laptop do you want to buy. "
        + "For gaming machine enter 1, for user laptop enter 2.");
    int option = scanner.nextInt();
    scanner.nextLine(); // 456\n
    int numberOfGames = 0;
    while (option >= 0) {

      switch (option) {
        case 1:
          System.out.println("How many games do you have in you laptop? ");
          numberOfGames= Integer.parseInt(scanner.nextLine());

          for (int i = 0; i < numberOfGames; i++) {
            Game game = new Game(scanner.nextLine());
            games.add(game);
          }

          RogLaptop acer = new RogLaptop("Acer", "Aspire", new BigDecimal("2500.00"), 20);
          acer.setGames(games);
          acer.testCPU();
          System.out.print("Please enter the name of the game you are looking for: ");
          acer.findGame(scanner.nextLine());
          break;

        case 2:
          System.out.println("How many folders do you have in you laptop? ");
          int numberOfFolders = Integer.parseInt(scanner.nextLine());
          for (int i = 0; i < numberOfFolders; i++) {
            Folder folder = new Folder(scanner.nextLine());
            folder.setFolderName(scanner.nextLine());
            folders.add(folder);
          }
          System.out.println(folders);
          NoteBookLaptop dell = new NoteBookLaptop("Dell", "Inspiron", new BigDecimal("1700.50"));
          dell.setFolders(folders);
          dell.powerUp();
          dell.setFolders(folders);
          System.out.print("Please enter the name of the folder you are looking for: ");
          dell.findFolder(scanner.nextLine());
          dell.shutDown();
          System.out.println(dell);
          break;

        default:
          System.out.println("Please enter valid option!");
          break;
      }
      System.out.println("Please choose what kind of laptop do you want to buy. "
          + "For gaming machine enter 1, for user laptop enter 2.");
      option = scanner.nextInt();
    }
  }
}
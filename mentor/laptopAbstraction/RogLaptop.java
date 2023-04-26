package mentor.laptopAbstraction;

import java.math.BigDecimal;
import java.util.List;
import java.util.Scanner;

public class RogLaptop extends Laptop implements GamingLaptop {

  Scanner scanner;
  private String gameName;
  private int cpuSize;
  private double refreshRate = 150;
  private double frameRate = 24;
  private List<Game> games;

  public RogLaptop(String brand, String model, BigDecimal price, int cpuSize) {
    super(brand, model, price);
    this.cpuSize = cpuSize;
  }

  public String getGameName() {
    return gameName;
  }

  public void setGameName(String gameName) {
    this.gameName = gameName;
  }

  public int getCpuSize() {
    return cpuSize;
  }

  public void setCpuSize(int cpuSize) {
    this.cpuSize = cpuSize;
  }

  public double getFrameRate() {
    return frameRate;
  }

  public void setFrameRate(double frameRate) {
    this.frameRate = frameRate;
  }

  public List<Game> getGames() {
    return games;
  }

  public void setGames(List<Game> games) {
    this.games = games;
  }

  @Override
  public void findGame(String name) {
    System.out.print("Please enter the name of the game you are looking for: ");
    for (Game game : games) {
      String checkName = game.getGameName();
      if (name.equalsIgnoreCase(checkName)) {
        System.out.println("Game " + checkName + " is found.");
        this.modifyFrameRate(120);
        return;
      }
    }

    System.out.println("The game " + name + " is not installed. Try to install first..");
    System.out.println("What would you like next?");
    System.out.print("(1) - Install new game\n(2) - Search another game\n(0) - Whatever!");
    int choice = scanner.nextInt();
    if (choice == 1) {
      this.games.add(new Game(scanner.nextLine()));
    } else if (choice == 2) {

      findGame(scanner.nextLine());
    }else if(choice==0){

    }else {
      System.out.println("Make a valid choice");
    }
  }

  @Override
  public void testCPU() {
    if (this.cpuSize <= 16) {
      System.out.println("Your CPU is not powerful enough to play games, buy another one.");
    } else {
      System.out.println("Your CPU is powerful enough to play games.");
    }
  }

  @Override
  public void modifyFrameRate(double frameRate) {
    if (frameRate <= refreshRate) {
      System.out.println("Frame rate changed successfully!");
      this.frameRate = frameRate;
    } else {
      System.out.println("This system can't run that frame rate!");
    }
  }

  @Override
  public String toString() {
    return "Rog is a gaming machine. It is a " + super.toString();
  }
}

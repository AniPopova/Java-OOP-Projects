package mentor.laptopAbstraction;

public class Game {

  private String gameName;

  public Game(String name) {
    this.gameName = name;
  }

  public String getGameName() {
    return gameName;
  }


  public void setGameName(String gameName) {
    this.gameName = gameName;
  }

  @Override
  public String toString() {
    return "Game: " + gameName + " is installed successfully.";
  }
}

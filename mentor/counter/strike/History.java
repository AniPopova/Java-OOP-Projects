package mentor.counter.strike;

import java.util.Collection;


public class History {

  private Collection<Player> terrorist;
  private Collection<Player> counterTerrorist;
  private Player topPlayer;
  private int terroristNumberOfRoundsWin;
  private int counterTerroristNumberOfRoundsWin;

  public History() {
  }

  public Collection<Player> getTerrorist() {
    return terrorist;
  }

  public void setTerrorist(Collection<Player> terrorist) {
    this.terrorist = terrorist;
  }

  public Collection<Player> getCounterTerrorist() {
    return counterTerrorist;
  }

  public void setCounterTerrorist(Collection<Player> counterTerrorist) {
    this.counterTerrorist = counterTerrorist;
  }

  public Player getTopPlayer() {
    return topPlayer;
  }

  public void setTopPlayer(Player topPlayer) {
    this.topPlayer = topPlayer;
  }

  public int getTerroristNumberOfRoundsWin() {
    return terroristNumberOfRoundsWin;
  }

  public void setTerroristNumberOfRoundsWin(int terroristNumberOfRoundsWin) {
    this.terroristNumberOfRoundsWin = terroristNumberOfRoundsWin;
  }

  public int getCounterTerroristNumberOfRoundsWin() {
    return counterTerroristNumberOfRoundsWin;
  }

  public void setCounterTerroristNumberOfRoundsWin(int counterTerroristNumberOfRoundsWin) {
    this.counterTerroristNumberOfRoundsWin = counterTerroristNumberOfRoundsWin;
  }

  @Override
  public String toString() {
    return "History " +
        "terrorist="  + terrorist +"\n" +
        ", counterTerrorist=" + counterTerrorist + "\n" +
    ", topPlayer=" + topPlayer + "\n" +
    ", terroristNumberOfRoundsWin=" + terroristNumberOfRoundsWin + "\n" +
    ", counterTerroristNumberOfRoundsWin=" + counterTerroristNumberOfRoundsWin+"\n";
  }
}

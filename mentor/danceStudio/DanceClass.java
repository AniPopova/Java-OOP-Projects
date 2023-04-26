package mentor.danceStudio;

import java.util.List;

public class DanceClass {

  private String danceClassName;
  private DanceTeacher teacher;
  private List<Client> clients;
  private double tax;
  private double dailyTurnover;
  private int numOfClientsUsingCard;
  private int numOfClientsWithoutCards;

  public DanceClass() {
  }

  public String getDanceClassName() {
    return danceClassName;
  }

  public void setDanceClassName(String danceClassName) {
    this.danceClassName = danceClassName;
  }

  public DanceTeacher getTeacher() {
    return teacher;
  }

  public void setTeacher(DanceTeacher teacher) {
    this.teacher = teacher;
  }

  public List<Client> getClients() {
    return clients;
  }

  public void setClients(List<Client> clients) {
    this.clients = clients;
  }

  public double getTax() {
    return tax;
  }

  public void setTax(double tax) {
    this.tax = tax;
  }

  public double getDailyTurnover() {
    return dailyTurnover;
  }

  public void setDailyTurnover(double dailyTurnover) {
    this.dailyTurnover = dailyTurnover;
  }

  public int getNumOfClientsUsingCard() {
    return numOfClientsUsingCard;
  }

  public void setNumOfClientsUsingCard(int numOfClientsUsingCard) {
    this.numOfClientsUsingCard = numOfClientsUsingCard;
  }

  public int getNumOfClientsWithoutCards() {
    return numOfClientsWithoutCards;
  }

  public void setNumOfClientsWithoutCards(int numOfClientsWithoutCards) {
    this.numOfClientsWithoutCards = numOfClientsWithoutCards;
  }

  public void calcDailyTurnover() {
    for (Client client : clients) {
      if (client.isHasMultiSportCard()) {
        this.dailyTurnover += this.tax * 0.9;
        this.numOfClientsUsingCard++;
      } else {
        this.dailyTurnover += this.tax;
        this.numOfClientsWithoutCards++;
      }
    }
    System.out.println(
        "We gained " + dailyTurnover + " BGN for today from the class " + getDanceClassName()
            + ".");
    System.out.printf(
        "We have %d clients with MultiSport card today. And we have %d clients without card.\n",
        this.numOfClientsUsingCard, this.numOfClientsWithoutCards);
  }

  @java.lang.Override
  public java.lang.String toString() {
    return "\nDanceClass " + danceClassName + "\n" +
        "has as a " + teacher +
        "and the following clients: " + clients;
  }
}

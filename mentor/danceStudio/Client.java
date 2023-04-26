package mentor.danceStudio;

import java.util.Random;

public class Client {

  private String name;
  private String middleName;
  private String surname;
  private String email;
  private boolean hasMultiSportCard;
  private int numberOfCard;

  public Client() {
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getMiddleName() {
    return middleName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public boolean isHasMultiSportCard() {
    return hasMultiSportCard;
  }

  public void setHasMultiSportCard(boolean hasMultiSportCard) {
    this.hasMultiSportCard = hasMultiSportCard;
  }

  public int getNumberOfCard() {
    return numberOfCard;
  }

  public void setNumberOfCard() {
    this.numberOfCard = new Random().nextInt(200);
  }

  @Override
  public String toString() {
    return "\n\nClient: " + name + " " + middleName + " " + surname + "\n" +
        "e-mail: " + email + "\n" +
        "has card (" + hasMultiSportCard + ") with card number: " + getNumberOfCard() + "\n";
  }
}

package sportB;

public class Sport {

  private String name = "General Sport";
  private String numberOfTeamMembers = "0";

  public void setName(String name) {
    this.name = name;
  }

  public String getN() {
    return numberOfTeamMembers;
  }

  public void setNumberOfTeamMembers(String numberOfTeamMembers) {
    this.numberOfTeamMembers = numberOfTeamMembers;
  }

  public String getName() {
    return name;
  }

  public String getNumberOfTeamMembers() {
    return String.format("Each team has %s players in %s", numberOfTeamMembers, getName());
  }
}

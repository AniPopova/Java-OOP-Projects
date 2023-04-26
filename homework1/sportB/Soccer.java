package sportB;

public class Soccer extends Sport {

  @Override
  public String getName() {
    return "Soccer";
  }

  @Override
  public String getNumberOfTeamMembers() {
    String numberOfTeamMembers = "11";
    return String.format("Each team has %s players in %s", numberOfTeamMembers, getName());
  }
}

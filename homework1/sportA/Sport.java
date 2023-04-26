package sportA;

public class Sport {

  String name = "General Sport";
  String n = "0";

  String getName() {
    return name;
  }

  String getNumberOfTeamMembers() {
    return String.format("Each team has %s players in %s", n, getName());
  }
}

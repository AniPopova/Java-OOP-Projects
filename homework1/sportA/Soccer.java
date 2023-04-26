package sportA;

public class Soccer extends Sport {

  @Override
  String getName() {
    this.name = "Soccer";
    return super.getName();
  }

  @Override
  String getNumberOfTeamMembers() {
    this.n = "11";
    return super.getNumberOfTeamMembers();
  }
}

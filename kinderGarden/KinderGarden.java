package kinderGarden;

import java.util.List;

public class KinderGarden {

  private String kinderGardenName;
  private List<Group> groups;

  public KinderGarden() {
  }

  public String getKinderGardenName() {
    return kinderGardenName;
  }

  public void setKinderGardenName(String kinderGardenName) {
    this.kinderGardenName = kinderGardenName;
  }

  public List<Group> getGroups() {
    return groups;
  }

  public void setGroups(List<Group> groups) {
    this.groups = groups;
  }

  @Override
  public String toString() {
    return "KinderGarden " + kinderGardenName + "\n" +
        "has " + groups.size()+ " groups" + groups +"\n";
  }
}


package mentor.kinderGarden;

import java.util.Arrays;
import java.util.List;

public class KinderGarden {

  private String name;
  private List<Child> children;

  public KinderGarden(String name, List<Child> children) {
    this.name = name;
    this.children = children;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<Child> getChildren() {
    return children;
  }

  public void setChildren(List<Child> children) {
    this.children = children;
  }

  @Override
  public String toString() {
    return "Kinder Garden " + name + " " +
        "has got " + children.size() + " children as it follows: \n" + Arrays.toString(children.toArray())
        .replace("[", "")
        .replace("]", "").replace(", ", "");
  }
}

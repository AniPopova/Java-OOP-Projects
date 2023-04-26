package mentor.kinderGarden;

public class Parent {

  private String name;
  private String familyName;

  public Parent(String name, String familyName) {
    this.name = name;
    this.familyName = familyName;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getFamilyName() {
    return familyName;
  }

  public void setFamilyName(String familyName) {
    this.familyName = familyName;
  }

  @Override
  public String toString() {
    return name + " "+ familyName ;
  }
}

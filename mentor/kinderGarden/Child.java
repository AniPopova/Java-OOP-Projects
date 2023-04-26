package mentor.kinderGarden;

import java.util.Arrays;
import java.util.List;

public class Child {

  private String name;
  private String familyName;
  private int age;
  private List<Parent> parents;
  private GroupType groupType;

  public Child(String name, String familyName, int age, List<Parent> parents) {
    this.name = name;
    this.familyName = familyName;
    this.age = age;
    this.parents = parents;
    getGroupType();

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

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public List<Parent> getParents() {
    return parents;
  }

  public void setParents(List<Parent> parents) {
    this.parents = parents;
  }

  public GroupType getGroupType() {
    return groupType;
  }

  public void setGroupType() {
    if (this.age <=3){
      this.groupType = GroupType.NURSERY;

    }
    if(this.age >3 && this.age <=6){
      this.groupType = GroupType.PUPILS;
    }
  }

  @Override
  public String toString() {
    return "Child " + name + " "+ familyName + " " +
        "at the age of " + age +
        " with parents: " + Arrays.toString(parents.toArray())
        .replace("[", "")
        .replace("]", "").replace(", ", " and ") +
        ". Participates in " + groupType +" group with teacher " +groupType.teacherName+"\n";
  }
}

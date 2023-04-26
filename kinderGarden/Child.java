package kinderGarden;

import java.util.List;

public class Child {

  private String name;
  private String sirname;
  private int age;
  private List<Parent> parents;
  private String group;

  public Child(String name, String sirname, int age) {
    this.name = name;
    this.sirname = sirname;
    this.age = age;

  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSirname() {
    return sirname;
  }

  public void setSirname(String sirname) {
    this.sirname = sirname;
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
    if (parents.size() !=0 && parents.size() <=2 )
    this.parents= parents;
  }

  public String getGroup(){
    return this.group;
  }

  public void setGroupType() {
        this.group = group;
    }

  @Override
  public String toString() {
    return "Child " + name + "\b" + sirname + "\b" +
        "age: " + age +"\n"+
        "has parents " + parents + "\n";
  }
}

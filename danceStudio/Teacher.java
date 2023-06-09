package danceStudio;

public class Teacher {

  private String name;
  private String nickName;

  public Teacher(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getNickName() {
    return nickName;
  }

  public void setNickName(String nickName) {
    this.nickName = nickName;
  }

  @Override
  public String toString() {
    return "Teacher " + name + "\n" +
        "with nickname " + nickName + "\n";
  }
}

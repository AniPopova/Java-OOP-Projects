package mentor.danceStudio;

public class DanceTeacher {

  private String name;
  private String nickname;

  public DanceTeacher(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getNickName() {
    return nickname;
  }

  public void setNickName(String nickName) {
    this.nickname = nickName;
  }

  @Override
  public String toString() {
    return "Teacher " + name + "\n" +
        "with nickname " + nickname + "\n";
  }

}

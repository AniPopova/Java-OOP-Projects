package mentor.studentBook;

public class Subject {

  private String name;
  private String teacher;

  public Subject(String name, String teacher) {
    this.name = name;
    this.teacher = teacher;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Предмет: " + name + ". Преподавател: "  + teacher;
  }
}

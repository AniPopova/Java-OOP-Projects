package svetlanaProycheva.exercise20220706;

public class Subject {
  private String nameOfTheSubject;
  private double studentMark;
  private Teacher teacher;

  public Subject() {
  }

  public String getNameOfTheSubject() {
    return nameOfTheSubject;
  }

  public void setNameOfTheSubject(String nameOfTheSubject) {
    this.nameOfTheSubject = nameOfTheSubject;
  }

  public double getStudentMark() {
    return studentMark;
  }

  public void setStudentMark(double studentMark) {
    this.studentMark = studentMark;
  }

  public Teacher getTeacher() {
    return teacher;
  }

  public void setTeacher(Teacher teacher) {
    this.teacher = teacher;
  }

  @Override
  public String toString() {
    return "Subject{" +
        "nameOfTheSubject='" + nameOfTheSubject + '\'' +
        ", studentMark=" + studentMark +
        ", teacher=" + teacher +
        '}';
  }
}

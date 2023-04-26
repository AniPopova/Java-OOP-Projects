package svetlanaProycheva.exercise20220706;

import java.util.ArrayList;
import java.util.List;

public class Student {

  private String firstName;
  private String lastName;
  private StudentMark studentMark;
  private List<Subject> subjects = new ArrayList<>();

  public Student() {
  }

  public StudentMark getStudentMark() {
    return studentMark;
  }

  public void setStudentMark(StudentMark studentMark) {
    this.studentMark = studentMark;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public List<Subject> getSubjects() {
    return subjects;
  }

  public void setSubjects(List<Subject> subjects) {
    this.subjects = subjects;
  }

  public double average(List<Subject> subjects){
    double average = 0;
    double sum = 0;
    for (Subject subject : subjects) {
      sum += subject.getStudentMark();
    }
    average = sum/subjects.size();
    return average;
  }

  @Override
  public String toString() {
    return "Student" +
        "firstName " + firstName + "\n" +
        "lastName " + lastName + "\n" +
        "subjects " + subjects + "\n";
  }

}

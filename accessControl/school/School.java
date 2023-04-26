package accessControl.school;

import java.util.HashSet;
import java.util.List;

public class School {

  private String name;
  private List<Student> students;
  private HashSet<Integer> schoolClasses;

  public School(String name, List<Student> students, HashSet<Integer> schoolClasses) {
    this.name = name;
    this.students = students;
    this.schoolClasses = schoolClasses;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<Student> getStudents() {
    return students;
  }

  public void setStudents(List<Student> students) {
    this.students = students;
  }

  public HashSet<Integer> getSchoolClasses() {
    return schoolClasses;
  }

  public void setSchoolClasses(HashSet<Integer> schoolClasses) {
    this.schoolClasses = schoolClasses;
  }

  @Override
  public String toString() {
    return "\nУчилище " + name +
        " има "+schoolClasses.size()+" класа и "+ students.size()+" ученика в следните класове:\n" +getSchoolClasses() + "\n" +students
        ;
  }
}

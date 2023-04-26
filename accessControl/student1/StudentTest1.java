package accessControl.student1;

import java.util.ArrayList;
import java.util.List;

public class StudentTest1 {
  static List<Student1> students = new ArrayList<>();

  public static void main(String[] args) {
    students.add(new Student1(new StringBuilder("Ana"), new StringBuilder("Popova"), 16, 9));
    students.add(new Student1(new StringBuilder("Sherif"), new StringBuilder("Bolkar"), 17, 10));
    students.add(new Student1(new StringBuilder("Svetlana"), new StringBuilder("Proycheva"), 15, 8));

    for (Student1 student : students) {
      System.out.println(student);
    }
  }
}

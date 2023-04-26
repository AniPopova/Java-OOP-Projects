package accessControl.student3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentTest3 {

  public static void main(String[] args) {

    List<Student3> students = new ArrayList<>();
    List<Student3> excellentStudents = new ArrayList<>();
    List<Student3> badStudents = new ArrayList<>();

    Student3 student1 = new Student3(new StringBuilder("Ivan"), new StringBuilder("Vazov"), 14, 7,
        2.50);
    Student3 student2 = new Student3(new StringBuilder("Ivan"), new StringBuilder("Georgiev"), 16,
        9, 3.5);
    Student3 student3 = new Student3(new StringBuilder("Dimcho"), new StringBuilder("Debelyanov"), 12, 6,
        4);
    Student3 student4 = new Student3(new StringBuilder("Kiril"), new StringBuilder("Hristov"), 12, 6,
        5.5);
    Student3 student5 = new Student3(new StringBuilder("Vladislav"), new StringBuilder("Minkov"), 12, 6,
        5.5);
    Student3 student6 = new Student3(new StringBuilder("Lilyana"), new StringBuilder("Dimitrova"), 12, 6,
        6);

    students.add(student1);
    students.add(student2);
    students.add(student3);
    students.add(student4);
    students.add(student5);
    students.add(student6);


    for (Student3 student : students) {
      if (student.getAverageScore() > 5.0) {
        excellentStudents.add(student);
      }
      if(student.getAverageScore()<3.0) {
        badStudents.add(student);
      }
    }

    System.out.println("All students we have are:"+Arrays.toString(students.toArray())
        .replace("[", "")
        .replace("]", "")
        .replace(", ", "\n")+"\n");

    System.out.println("All excellent students are:"+Arrays.toString(excellentStudents.toArray())
        .replace("[", "")
        .replace("]", "")
        .replace(", ", "\n")+"\n");

    System.out.println("All bad students are:"+Arrays.toString(badStudents.toArray())
        .replace("[", "")
        .replace("]", "")
        .replace(", ", "\n")+"\n");

  }

}



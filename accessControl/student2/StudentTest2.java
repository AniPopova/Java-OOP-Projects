package accessControl.student2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentTest2 {

  public static void main(String[] args) {
    List<Student2> students = new ArrayList<>();

    Student2 student1 = new Student2(new StringBuilder("Ivan"), new StringBuilder("Vazov"), 14, 7);
    Student2 student2 = new Student2(new StringBuilder("Geo"), new StringBuilder("Milev"), 16, 9);
    Student2 student3 = new Student2(new StringBuilder("Dimitar"), new StringBuilder("Dimov"), 12, 6);

    student1.increaseAge();
    student2.increaseAge(2);
    student3.goToNextClass();

    students.add(student1);
    students.add(student2);
    students.add(student3);


    System.out.println(Arrays.toString(students.toArray())
        .replace("[", "")
        .replace("]", "")
        .replace(", ", "\n"));

  }

}



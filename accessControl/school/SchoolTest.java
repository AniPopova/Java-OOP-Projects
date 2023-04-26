package accessControl.school;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class SchoolTest {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    List<Student> students = new ArrayList<>();
    HashSet<Integer> schoolClassList = new HashSet<>();
    School school = new School("Руската гимназия", students, schoolClassList);

    Student student1 = new Student(new StringBuilder("Иван"), new StringBuilder("Вазов"), 14, 7,
        2.50);
    Student student2 = new Student(new StringBuilder("Гео"), new StringBuilder("Милев"), 16,
        9, 3.5);
    Student student3 = new Student(new StringBuilder("Димчо"), new StringBuilder("Дебелянов"),
        16, 9,
        4);
    Student student4 = new Student(new StringBuilder("Кирил"), new StringBuilder("Христов"), 17,
        10,
        5.5);
    Student student5 = new Student(new StringBuilder("Светослав"), new StringBuilder("Минков"),
        18, 12,
        5.5);
    Student student6 = new Student(new StringBuilder("Лиляна"), new StringBuilder("Димитрова"),
        15, 8,
        6);

    students.add(student1);
    students.add(student2);
    students.add(student3);
    students.add(student4);
    students.add(student5);
    students.add(student6);

    schoolClassList.add(student1.getSchoolClass());
    schoolClassList.add(student2.getSchoolClass());
    schoolClassList.add(student3.getSchoolClass());
    schoolClassList.add(student4.getSchoolClass());
    schoolClassList.add(student5.getSchoolClass());
    schoolClassList.add(student6.getSchoolClass());

    System.out.println(Arrays.toString(new School[]{school}));


    System.out.println("Искате ли да добавите нов ученик в гимназията? Изберете 1(да) или 2(не).");
    int addStudents;
    while ((addStudents = Integer.parseInt(scanner.nextLine())) != 2) {
      if (addStudents == 1) {
        System.out.println("Моля въведете колко ученика искате да добавите: ");
        int numberOfStudents = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < numberOfStudents; i++) {

          Student student = new Student();

          System.out.println("Моля въведете първото име на ученика: ");
          student.setFirstName(new StringBuilder(scanner.nextLine()));
          System.out.println("Въведете фамилното име на ученика: ");
          student.setLastName(new StringBuilder(scanner.nextLine()));
          System.out.println("Възраст на ученика: ");
          student.setAge(Integer.parseInt(scanner.nextLine()));
          System.out.println("Въведете в кой клас е ученика: ");
          student.setSchoolClass(Integer.parseInt(scanner.nextLine()));
          System.out.println("Въведете средния успех на ученика: ");
          student.setAverageScore(Double.parseDouble(scanner.nextLine()));
          students.add(student);
        }

        for (Student student : students) {
          int numberOfClass = student.getSchoolClass();
          schoolClassList.add(numberOfClass);
          student.goToNextClass();
        }
        System.out.println(Arrays.toString(new School[]{school}));
      }
//      else {
//        System.out.println(Arrays.toString(new School[]{school}));
//      }
    }
    System.out.println(Arrays.toString(new School[]{school}));
  }
}

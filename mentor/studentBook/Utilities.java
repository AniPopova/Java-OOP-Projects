//package mentor.studentBook;
///*Best way to create a utility class
//- final keyword to prevent subclass operation
//- private constructor to prevent instantiation
//- public static methods
// */
//
//import java.util.*;
//
//<<<<<<< working copy
//public final class Utilities {
//
//static Scanner scanner = new Scanner(System.in);
//
//  private Utilities() {
//
//  }
//
//  public static int getUserChoice() {
//    String choice =
//        "Моля изберете една от следните опции: \n"
//            + "\u001B[31m(1) Принтирайте данните на всички ученици.\u001B[0m\n"
//            + "\u001B[32m(2) Сортирайте учениците по успех.\u001B[0m\n"
//            + "\u001B[33m(3) Принтирайте всички ученици, които ще повтарят годината.\u001B[0m\n"
//            + "\u001B[34m(4) Принтирайте учениците по класове с класен ръководите.\u001B[0m\n"
//            + "\u001B[35m(5) Сортирайте учениците по възраст.\u001B[0m\n"
//            + "\u001B[31m(6) Сортирайте ученицие по азбучен ред.\u001B[0m\n"
//            + "\u001B[32m(7) Филтрирай учениците по клас.\u001B[0m\n"
//            + "\u001B[36m(8) Изход от електронния дневник.\u001B[0m";
//    System.out.println(choice);
//    int userChoice = validInteger(choice);
//    return userChoice;
//  }
//
//  public static int validInteger(String check) {
//    while (true) {
//      if (scanner.hasNextInt()) {
//        return Integer.parseInt(scanner.nextLine());
//      } else {
//        validatingUserChoice();
//        scanner.nextLine();
//        System.out.print(check);
//      }
//    }
//  }
//
//  public static void validatingUserChoice() {
//    System.out.println("\u001B[31mИзборът ви е невалиден, опитайте пак!\u001B[0m");
//  }
//
//  public static void avgScore(List<Student> students) {
//    Collections.sort(students, (o1, o2) -> o1.compareTo(o2));
//  }
//
//  public static void expelStudents(List<Student> students, List<Student> expelledStudents) {
//    Iterator<Student> iterator = students.iterator();
//    while (iterator.hasNext()) {
//      Student student = iterator.next();
//      double avg = student.getAverageScore(student.getGrades());
//      if (avg < 3.00) {
//        iterator.remove();
//        expelledStudents.add(student);
//      }
//    }
//  }
//
//  public static void printExpelled(List<Student> expelledStudents) {
//    for (Student student : expelledStudents
//    ) {
//      System.out.println(student);
//    }
//  }
//
//  public static void ageSort(List<Student> students) {
//    students.sort(Comparator.comparing(Student::getAge));
//    for (Student student : students) {
//      System.out.println(student.getName() + " " + student.getFamilyName() + " " +
//          +student.getAge() + " е ученик от " + student.getClassType() + " с класен ръководител "
//          + student.getClassType().teacherName);
//    }
//  }
//
//  public static void nameSort(List<Student> students) {
//    students.sort(Comparator.comparing(Student::getName).thenComparing(Student::getFamilyName));
//    for (Student student : students) {
//      System.out.println(student.getName() + " " + student.getFamilyName() + " " +
//          +student.getAge() + " е ученик от " + student.getClassType() + " с класен ръководител "
//          + student.getClassType().teacherName);
//    }
//  }
//
//  public static void classSort(List<Student> students) {
//    students.sort(Comparator.comparing(Student::getClassType));
//    for (Student student : students) {
//      System.out.println(student.getName() + " " + student.getFamilyName()
//          + " е ученик от " + student.getClassType() + " с класен ръководител "
//          + student.getClassType().teacherName);
//    }
//  }
//
//  public static int chooseClass() {
//    String choice2 =
//        "Моля изберете една от следните опции: \n"
//            + "\u001B[31m(1) Клас А.\u001B[0m\n"
//            + "\u001B[32m(2) Клас Б.\u001B[0m\n"
//            + "\u001B[33m(3) Клас В.\u001B[0m\n"
//            + "\u001B[34m(4) Клас Г.\u001B[0m\n"
//            + "\u001B[35m(5) Клас Д.\u001B[0m";
//    System.out.println(choice2);
//    int classNumber = Integer.parseInt(scanner.nextLine());
//    return classNumber;
//  }
//
//  public static void classSortByClass(List<Student> students, int classNumber) {
//=======
//public final class Utilities
//{
//
//  static Scanner scanner = new Scanner(System.in);
//
//  private Utilities()
//  {
//
//  }
//
//  public static int getUserChoice()
//  {
//    String choice =
//        "Моля изберете една от следните опции: \n"
//            + "\u001B[31m(1) Принтирайте данните на всички ученици.\u001B[0m\n"
//            + "\u001B[32m(2) Сортирайте учениците по успех.\u001B[0m\n"
//            + "\u001B[33m(3) Принтирайте всички ученици, които ще повтарят годината.\u001B[0m\n"
//            + "\u001B[34m(4) Принтирайте учениците по класове с класен ръководите.\u001B[0m\n"
//            + "\u001B[35m(5) Сортирайте учениците по възраст.\u001B[0m\n"
//            + "\u001B[31m(6) Сортирайте ученицие по азбучен ред.\u001B[0m\n"
//            + "\u001B[32m(7) Филтрирай учениците по клас.\u001B[0m\n"
//            + "\u001B[36m(8) Изход от електронния дневник.\u001B[0m";
//    System.out.println(choice);
//    int userChoice = validInteger(choice);
//    return userChoice;
//  }
//
//  public static int validInteger(String check)
//  {
//    while (true) {
//      if (scanner.hasNextInt()) {
//        return Integer.parseInt(scanner.nextLine());
//      }
//      else {
//        validatingUserChoice();
//        scanner.nextLine();
//        System.out.print(check);
//      }
//    }
//  }
//
//  public static void validatingUserChoice()
//  {
//    System.out.println("\u001B[31mИзборът ви е невалиден, опитайте пак!\u001B[0m");
//  }
//
//  public static void avgScore(List<Student> students)
//  {
//    Collections.sort(students, (o1, o2) -> o1.compareTo(o2));
//  }
//
//  public static void expelStudents(List<Student> students, List<Student> expelledStudents)
//  {
//    Iterator<Student> iterator = students.iterator();
//    while (iterator.hasNext()) {
//      Student student = iterator.next();
//      double avg = student.getAverageScore(student.getGrades());
//      if (avg < 3.00) {
//        iterator.remove();
//        expelledStudents.add(student);
//      }
//    }
//  }
//
//  public static void printExpelled(List<Student> expelledStudents)
//  {
//    for (Student student : expelledStudents
//    ) {
//      System.out.println(student);
//    }
//  }
//
//  public static void ageSort(List<Student> students)
//  {
//    students.sort(Comparator.comparing(Student::getAge));
//    for (Student student : students) {
//      System.out.println(student.getName() + " " + student.getFamilyName() + " " +
//          +student.getAge() + " е ученик от " + student.getClassType() + " с класен ръководител "
//          + student.getClassType().teacherName);
//    }
//  }
//
//  public static void nameSort(List<Student> students)
//  {
//    students.sort(Comparator.comparing(Student::getName).thenComparing(Student::getFamilyName));
//    for (Student student : students) {
//      System.out.println(student.getName() + " " + student.getFamilyName() + " " +
//          +student.getAge() + " е ученик от " + student.getClassType() + " с класен ръководител "
//          + student.getClassType().teacherName);
//    }
//  }
//
//  public static void classSort(List<Student> students)
//  {
//    students.sort(Comparator.comparing(Student::getClassType));
//    for (Student student : students) {
//      System.out.println(student.getName() + " " + student.getFamilyName()
//          + " е ученик от " + student.getClassType() + " с класен ръководител "
//          + student.getClassType().teacherName);
//    }
//  }
//
//  public static int chooseClass()
//  {
//    String choice2 =
//        "Моля изберете една от следните опции: \n"
//            + "\u001B[31m(1) Клас А.\u001B[0m\n"
//            + "\u001B[32m(2) Клас Б.\u001B[0m\n"
//            + "\u001B[33m(3) Клас В.\u001B[0m\n"
//            + "\u001B[34m(4) Клас Г.\u001B[0m\n"
//            + "\u001B[35m(5) Клас Д.\u001B[0m";
//    System.out.println(choice2);
//    int classNumber = Integer.parseInt(scanner.nextLine());
//    return classNumber;
//  }
//
//  public static void classSortByClass(List<Student> students, int classNumber)
//  {
//>>>>>>> merge rev
//    switch (classNumber) {
//      case 1:
//        System.out.println("Учениците от А клас.");
//        for (Student student : students) {
//          if (student.getClassType() == ClassType.A_CLASS) {
//            System.out.println(student);
//          }
//        }
//        break;
//      case 2:
//        System.out.println("Учениците от Б клас.");
//        for (Student student : students) {
//          if (student.getClassType() == ClassType.B_CLASS) {
//            System.out.println(student);
//          }
//        }
//        break;
//      case 3:
//        System.out.println("Учениците от В клас.");
//        for (Student student : students) {
//          if (student.getClassType() == ClassType.V_CLASS) {
//            System.out.println(student);
//          }
//        }
//        break;
//      case 4:
//        System.out.println("Учениците от Г клас.");
//        for (Student student : students) {
//          if (student.getClassType() == ClassType.G_CLASS) {
//            System.out.println(student);
//          }
//        }
//        break;
//      case 5:
//        System.out.println("Учениците от Д клас.");
//        for (Student student : students) {
//          if (student.getClassType() == ClassType.D_CLASS) {
//            System.out.println(student);
//          }
//        }
//        break;
//      default:
//        System.out.println("Няма такъв клас.");
//        break;
//    }
//  }
//}

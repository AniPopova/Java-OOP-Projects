package svetlanaProycheva.student.students;

import java.util.Scanner;

public class MainCourse {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    Course course = new Course();
    String name;
    int grade;
    int option;

    for (int i = 0; i < 3; i++) {

      System.out.print("Enter name:");
      name = scanner.nextLine();
      System.out.print("Enter a grade:");
      grade = Integer.parseInt(scanner.nextLine());
      Student student = new Student(name, grade);
      course.addStudent(student);
    }

    do {
      printMenu();

      option = Integer.parseInt(scanner.nextLine());

      switch (option) {
        case 1:
          System.out.printf("Average score of all student1 is: %.2f\n",
              course.getAverageGrade());
          break;
//                case 2:
//                    System.out.printf("The highest grade is: %d\n",
//                            getHighestGrade(grades));
//                    break;
//                case 3:
//                    System.out.printf("The count of highest grades is: %d\n",
//                            getNumberWithHighestGrade(grades));
//                    break;
        case 4:
          System.out.printf("The failed student1 are: %StudentBook\n",
              course.printNames());
          break;
//                case 5:
//                    System.out.println("Added bonus points to student1: ");
//                    bonusGrade(grades);
//                    break;
//                case 6:
//                    removeStudents(names, grades);
//                    System.out.println(names);
//                    System.out.println(grades);
//                    break;
//                case 7:
//                    removeGrades(grades);
//                    System.out.println(grades);
        case 8:
          System.out.println("Exiting!");
          break;

        default:
          System.out.println("Invalid option! Please try again.");
      }
    } while (option != 8);
  }
  private static void printMenu() {

    System.out.println("1. Average grades:");
    System.out.println("2. Highest grade:");
    System.out.println("3. Number with highest grades:");
    System.out.println("4. Failed student1 list:");
    System.out.println("5. Add bonus:");
    System.out.println("6. Remove student1: ");
    System.out.println("7. Remove grades: ");
    System.out.println("8. Exit:");
    System.out.print("Please choose an option: ");
  }
}

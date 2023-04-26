//package mentor.studentBook;
//
//import java.util.*;
//
//public class Main {
//
//  static Scanner scanner = new Scanner(System.in);
//
//  public static void main(String[] args) {
//
//    Subject history = new Subject("История", "Георги Георгиев");
//    Subject geometry = new Subject("Геометрия", "Лилия Неделева");
//    Subject english = new Subject("Английскиh", "Катя Банчева");
//    Subject geography = new Subject("География", "Ирина Данева");
//    Subject chemistry = new Subject("Химия", "Константин Илиев");
//    Subject computerScience = new Subject("Информатика", "Васил Симеонов");
//    Subject art = new Subject("Рисуване", "Георги Табаков");
//
//    Map<Subject, Double> gradesOfIvo = new LinkedHashMap<>();
//    Student ivo = new Student("Иво", "Кандев", 16, gradesOfIvo, ClassType.A_CLASS);
//    gradesOfIvo.put(history, 5.5);
//    gradesOfIvo.put(geometry, 4.5);
//    gradesOfIvo.put(english, 3.0);
//    gradesOfIvo.put(geography, 4.0);
//    gradesOfIvo.put(chemistry, 2.0);
//    gradesOfIvo.put(computerScience, 5.0);
//    gradesOfIvo.put(art, 2.5);
//    ivo.getAverageScore(gradesOfIvo);
//
//    Map<Subject, Double> gradesOfPetar = new LinkedHashMap<>();
//    Student petar = new Student("Петър", "Петров", 16, gradesOfPetar, ClassType.A_CLASS);
//    gradesOfPetar.put(history, 5.5);
//    gradesOfPetar.put(geometry, 5.5);
//    gradesOfPetar.put(english, 5.0);
//    gradesOfPetar.put(geography, 4.0);
//    gradesOfPetar.put(chemistry, 6.0);
//    gradesOfPetar.put(computerScience, 5.0);
//    gradesOfPetar.put(art, 4.5);
//    petar.getAverageScore(gradesOfPetar);
//
//    Map<Subject, Double> gradesOfTodor = new LinkedHashMap<>();
//    Student todor = new Student("Тодор", "Кандев", 16, gradesOfTodor, ClassType.B_CLASS);
//    gradesOfTodor.put(history, 5.5);
//    gradesOfTodor.put(geometry, 4.5);
//    gradesOfTodor.put(english, 3.0);
//    gradesOfTodor.put(geography, 4.0);
//    gradesOfTodor.put(chemistry, 2.0);
//    gradesOfTodor.put(computerScience, 5.0);
//    gradesOfTodor.put(art, 2.5);
//    todor.getAverageScore(gradesOfTodor);
//
//    Map<Subject, Double> gradesOfAni = new LinkedHashMap<>();
//    Student ani = new Student("Анета", "Павлова", 15, gradesOfAni, ClassType.D_CLASS);
//    gradesOfAni.put(history, 5.0);
//    gradesOfAni.put(geometry, 4.0);
//    gradesOfAni.put(english, 6.0);
//    gradesOfAni.put(geography, 6.0);
//    gradesOfAni.put(chemistry, 2.0);
//    gradesOfAni.put(computerScience, 5.0);
//    gradesOfAni.put(art, 5.5);
//    ani.getAverageScore(gradesOfAni);
//
//    Map<Subject, Double> gradesOfGoeorge = new LinkedHashMap<>();
//    Student george = new Student("Георги", "Запрянов", 15, gradesOfGoeorge, ClassType.G_CLASS);
//    gradesOfGoeorge.put(history, 2.0);
//    gradesOfGoeorge.put(geometry, 2.0);
//    gradesOfGoeorge.put(english, 2.0);
//    gradesOfGoeorge.put(geography, 2.0);
//    gradesOfGoeorge.put(chemistry, 2.0);
//    gradesOfGoeorge.put(computerScience, 2.0);
//    gradesOfGoeorge.put(art, 2.5);
//    george.getAverageScore(gradesOfGoeorge);
//
//    Map<Subject, Double> gradesOfBoris = new LinkedHashMap<>();
//    Student boris = new Student("Борис", "Хаджиев", 14, gradesOfBoris, ClassType.D_CLASS);
//    gradesOfBoris.put(history, 3.0);
//    gradesOfBoris.put(geometry, 2.0);
//    gradesOfBoris.put(english, 2.5);
//    gradesOfBoris.put(geography, 3.0);
//    gradesOfBoris.put(chemistry, 3.0);
//    gradesOfBoris.put(computerScience, 2.0);
//    gradesOfBoris.put(art, 3.5);
//    boris.getAverageScore(gradesOfBoris);
//
//    Map<Subject, Double> gradesOfAneta2 = new LinkedHashMap<>();
//    Student aneta2 = new Student("Анета", "Генадиева", 14, gradesOfAneta2, ClassType.D_CLASS);
//    gradesOfAneta2.put(history, 6.0);
//    gradesOfAneta2.put(geometry, 6.0);
//    gradesOfAneta2.put(english, 6.0);
//    gradesOfAneta2.put(geography, 6.0);
//    gradesOfAneta2.put(chemistry, 6.0);
//    gradesOfAneta2.put(computerScience, 6.0);
//    gradesOfAneta2.put(art, 5.5);
//    aneta2.getAverageScore(gradesOfAneta2);
//
//    Map<Subject, Double> gradesOfDaniela = new LinkedHashMap<>();
//    Student daniela = new Student("Даниела", "Симова", 14, gradesOfDaniela, ClassType.D_CLASS);
//    gradesOfDaniela.put(history, 3.0);
//    gradesOfDaniela.put(geometry, 2.0);
//    gradesOfDaniela.put(english, 2.5);
//    gradesOfDaniela.put(geography, 3.0);
//    gradesOfDaniela.put(chemistry, 3.0);
//    gradesOfDaniela.put(computerScience, 2.0);
//    gradesOfDaniela.put(art, 3.5);
//    daniela.getAverageScore(gradesOfDaniela);
//
//    List<Student> students = new ArrayList<>();
//    students.add(ivo);
//    students.add(ani);
//    students.add(george);
//    students.add(todor);
//    students.add(boris);
//    students.add(daniela);
//    students.add(petar);
//    students.add(aneta2);
//    List<Student> expelledStudents = new ArrayList<>();
//
//    while (true) {
//      int userChoice = Utilities.getUserChoice();
//      System.out.println(userChoice);
//      if (userChoice == 1) {
//        System.out.println(Arrays.toString(students.toArray())
//            .replace("=", " - ")
//            .replace(", ", "\n"));
//      } else if (userChoice == 2) {
//        Utilities.avgScore(students);
//        System.out.println(Arrays.toString(students.toArray())
//            .replace("=", " - ")
//            .replace(", ", "\n"));
//      } else if (userChoice == 3) {
//        Utilities.expelStudents(students, expelledStudents);
//        Utilities.printExpelled(expelledStudents);
//      } else if (userChoice == 4) {
//        Utilities.classSort(students);
//      } else if (userChoice == 5) {
//        Utilities.ageSort(students);
//      } else if (userChoice == 6) {
//        Utilities.nameSort(students);
//      } else if (userChoice == 7) {
//        Utilities.classSortByClass(students, Utilities.chooseClass());
//      } else if (userChoice == 8) {
//        System.out.println("Вие избрахте изход от електронния дневник.");
//        break;
//      } else {
//        System.out.print("Невалиден избор. Опитай пак.");
//      }
//    }
//  }
//}
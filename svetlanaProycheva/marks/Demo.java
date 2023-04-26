package svetlanaProycheva.marks;

import java.util.ArrayList;
import java.util.List;

public class Demo {

  public static void main(String[] args) {
   List<Grade> gradesOfJohn = new ArrayList<>();

    gradesOfJohn.add(Grade.BASIC);
    gradesOfJohn.add(Grade.SATISFACTORY);
    gradesOfJohn.add(Grade.VERY_GOOD);
    gradesOfJohn.add(Grade.BASIC);
    gradesOfJohn.add(Grade.EXCELLENT);
    gradesOfJohn.add(Grade.BASIC );
    gradesOfJohn.add(Grade.LOW);

    gradesOfJohn.sort(null);

    for (Grade grade: gradesOfJohn) {
      System.out.println(grade.pass() + "-> " + grade + "-> " + grade.getGrade()+"-> "+grade.getCharGrade());

    }
  }
}

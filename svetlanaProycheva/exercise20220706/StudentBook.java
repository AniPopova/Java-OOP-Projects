package svetlanaProycheva.exercise20220706;

import java.util.ArrayList;
import java.util.List;

public class StudentBook {

  public static void main(String[] args) {
    Student student1 = new Student();
    student1.setFirstName("Mark");
    student1.setLastName("Twen");

    Subject subject = new Subject();
    subject.setNameOfTheSubject("Chemistry");
    subject.setStudentMark(4);

    Teacher teacher1 = new Teacher();
    teacher1.setFirstName("Ivan");
    teacher1.setLastName("Ivanov");
    subject.setTeacher(teacher1);

    Subject subject1 = new Subject();
    subject1.setNameOfTheSubject("Bulgarian");
    subject1.setStudentMark(5);

    Teacher teacher2 = new Teacher();
    teacher2.setFirstName("Georgi");
    teacher2.setLastName("Georgiev");
    subject1.setTeacher(teacher2);

    List<Subject> subjects = new ArrayList<>();
    subjects.add(subject);
    subjects.add(subject1);
    student1.setSubjects(subjects);


    //System.out.println(student1.getFirstName()+ " "+student1.getLastName()+" "+student1.average(subjects));
    System.out.println("The student blok contains: "+student1);
  }

}

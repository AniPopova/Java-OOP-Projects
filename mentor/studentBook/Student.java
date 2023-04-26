package mentor.studentBook;

import java.util.Map;

public class Student implements Comparable<Student> {

  private String name;
  private String familyName;
  private int age;
  private Map<Subject, Double> grades;
  private Map<String, String> expelled;

  private ClassType classType;

  public Student(String name, String familyName, int age, Map<Subject, Double> grades,
      ClassType classType) {
    this.name = name;
    this.familyName = familyName;
    this.age = age;
    this.grades = grades;
    this.classType = classType;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getFamilyName() {
    return familyName;
  }

  public void setFamilyName(String familyName) {
    this.familyName = familyName;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public Map<Subject, Double> getGrades() {
    return grades;
  }

  public void setGrades(Map<Subject, Double> grades) {
    this.grades = grades;
  }

  public Map<String, String> getExpelled() {
    return expelled;
  }

  public void setExpelled(Map<String, String> expelled) {
    this.expelled = expelled;
  }

  public ClassType getClassType() {
    return classType;
  }

  public void setClassType(ClassType classType) {
    this.classType = classType;
  }

  public double getAverageScore(Map<Subject, Double> grades) {
    double sum = 0;
    for (Map.Entry<Subject, Double> entry : grades.entrySet()) {
      sum += entry.getValue();
    }
    double average = sum / grades.size();
    average = Math.round(average * 100.0) / 100.0;
    return average;
  }

  @Override
  public int compareTo(Student o) {
    if (getAverageScore(this.grades) < o.getAverageScore(o.grades)) {
      return 1;
    } else if (getAverageScore(this.grades) > o.getAverageScore(o.grades)) {
      return -1;
    } else {
      return 0;

    }
  }

  @Override
  public String toString() {
    return
       "\u001B[33mУченикът \u001B[0m" + name + " " + familyName + ", на възраст " + age
            + " години, е ученик на "+getClassType()+" с класен ръководител "
           +classType.teacherName+". Със среден успех "+getAverageScore(grades)+" ,има следните оценки по следните предмети: \n" + grades.toString()
            .replace("=", " с успех ").replace("{", "").replace("}", "")
            .replace(", ", "\n");
  }
}

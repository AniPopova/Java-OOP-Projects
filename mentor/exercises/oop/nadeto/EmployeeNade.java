package mentor.exercises.oop.nadeto;

import java.util.List;

public class EmployeeNade {
  private String name;
  private String surName;
  private int age;
  private double salary;
  private String jobTitle;
  private List<String> responsibilities;

  public EmployeeNade() {
  }

  public EmployeeNade(String name, String surName, int age) {
    this.name = name;
    this.surName = surName;
    this.age = age;
  }

  public EmployeeNade(String name, String surName, int age, double salary, String jobTitle,
      List<String> responsibilities) {
    this.name = name;
    this.surName = surName;
    this.age = age;
    this.salary = salary;
    this.jobTitle = jobTitle;
    this.responsibilities = responsibilities;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSurName() {
    return surName;
  }

  public void setSurName(String surName) {
    this.surName = surName;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  public String getJobTitle() {
    return jobTitle;
  }

  public void setJobTitle(String jobTitle) {
    this.jobTitle = jobTitle;
  }

  public List<String> getResponsibilities() {
    return responsibilities;
  }

  public void setResponsibilities(List<String> responsibilities) {
    this.responsibilities = responsibilities;
  }

  @Override
  public String toString() {
    return "\nEmployeeTest:" + "\n"+
        "name = " + name + "\n" +
        "surName = " + surName + "\n" +
        "age = " + age + "\n"+
        "salary = " + salary +"\n"+
        "jobTitle = " + jobTitle + "\n" +
        "responsibilities = " + responsibilities;
  }
}

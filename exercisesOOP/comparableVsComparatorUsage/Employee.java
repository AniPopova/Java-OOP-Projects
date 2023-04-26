package exercisesOOP.comparableVsComparatorUsage;

import java.util.Comparator; // Трябва да импортнем този util -> comparator

public class Employee implements Comparable<Employee> { //трябва да имплементираме този интерфейс, за да ползваме метода compareTo

  private int id;
  private String name;
  
  private int salary;

  public Employee(int id, String name, int salary) {
    this.id = id;
    this.name = name;
    this.salary = salary;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getSalary() {
    return salary;
  }

  public void setSalary(int salary) {
    this.salary = salary;
  }

  @Override
  public String toString() {
    return "Employee with id number " + id +
        ", name " + name + ",and salary" + salary;
  }

  @Override
  public int compareTo(Employee o) { //този метод взима само един аргумент, МОЖЕ ДА ИМА САМО ЕДИН НАЧИ ЗА СОРТИРАНЕ С МЕТОДА compare To
    return this.id - o.id;
  }
  public static Comparator<Employee> NameComaparator = new Comparator<Employee>() { //ТУК ИМАМЕ АНОНИМЕН КЛАС, КАТО ГО ПОЗНАВАМЕ, ЧЕ ";" Е НЕ СЛЕД КРЪГЛИТЕ СКОБИ, А СЛЕД КЪДРАВИТЕ
    @Override //МОЖЕ ДА ИМАМЕ НЯКОЛКО КОМПАРАТОРА
    public int compare(Employee e1, Employee e2) { //този метод взима два аргумента
      return e1.getName().compareTo(e2.getName());
    }
  }; //ТОЧКА И ЗАПЕТАЯ ТУК ОЗНАЧАВА, ЧЕ КЛАСА Е АНОНИМЕН

}

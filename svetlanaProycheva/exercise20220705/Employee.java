package svetlanaProycheva.exercise20220705;

public class Employee {

  private String name;
  private String familyName;
  private double salary;
  private EmployeeCar car;

  public EmployeeCar getCar() {
    return car;
  }

  public void setCar(EmployeeCar car) {
    this.car = car;
  }
  public Employee(String name, String familyName, double salary, EmployeeCar car) {
    this.name = name;
    this.familyName = familyName;
    this.salary = salary;
    this.car = car;
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

  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }
public void showCarDocuments(){
  System.out.println("This is info for my car: "+car.toString());
}
  @Override
  public String toString() {
    return
        "name " + name + "\n" +
        "familyName " + familyName + "\n" +
        "salary " + salary +
         car;
  }
}

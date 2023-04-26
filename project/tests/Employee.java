package project.tests;

import java.math.BigDecimal;

public class Employee

{

  enum EmployeeType
  {
    BARMAN, SECURITY, WAITER;
  }

  private EmployeeType employeeType;
  private BigDecimal   salary;

  public EmployeeType getEmployeeType()
  {
    return employeeType;
  }

  public void setEmployeeType(EmployeeType employeeType)
  {
    this.employeeType = employeeType;
  }

  public BigDecimal getSalary()
  {
    return salary;
  }

  public void setSalary(BigDecimal salary)
  {
    this.salary = salary;
  }

  class Waitress extends Employee
  {

    double tips; // само сервитьора взима бакшиш

    void takeOrder()
    {
      System.out.println("Can I have you order?");
    }
  }

}

package project.tests;


import project.tests.Alcohol;
import project.tests.Employee;

public class Main
{
  public static void main(String[] args)
  {
    Employee employee = new Employee();

//    Employee.Waitress waiter1 = employee.new Waitress();
//    waiter1.setEmployeeType(EmployeeType.WAITER);
    Alcohol.BEER.setAmount(15);

    System.out.println(Alcohol.BEER.getAmount());



  }

}

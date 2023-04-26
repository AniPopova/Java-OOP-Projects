package svetlanaProycheva.exercise20220705;

import java.util.Random;

public class EmployeeTest {

  public static void main(String[] args) {
    Random random = new Random();
    EmployeeCar car1 = new EmployeeCar("Renault", random.nextInt());
    Employee employee1 = new Employee("Albert", "Einstein", 5000.50, car1);

    System.out.println(employee1.toString());
    employee1.showCarDocuments();


  }

}

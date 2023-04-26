package mentor.exercises.oop.nadeto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeNadeTest {

  public static void main(String[] args) {
    //DEFAULT CONSTRUCTOR
    EmployeeNade employee = new EmployeeNade();
    employee.setName("Nadeto");
    employee.setSurName("Hristeva");
    employee.setAge(24);
    employee.setJobTitle("Software dev");
    employee.setSalary(4500);

    List<String> nadesResponsibilities = new ArrayList<>();
    //List<String> nadesResponsibilities = new ArrayList<String>(Collections.singleton("blablabla"));
    nadesResponsibilities.add("Support several tools.");
    nadesResponsibilities.add("New developments.");
    nadesResponsibilities.add("Update old software.");

    employee.setResponsibilities(nadesResponsibilities);
    //SET ALL ATTRIBUTES CONSTRUCTOR
    EmployeeNade employee1 = new EmployeeNade("Zlati", "Ivanova", 25, 5000, "Java dev", new ArrayList<>(Collections.singleton("get salary")));
   //SET HALF ATTRIBUTES CONSTRUCTOR, THE OTHER HALF BY HAND
    EmployeeNade employee2 = new EmployeeNade("Vladi", "Stamenov", 30);
    employee2.setSalary(2500);
    employee2.setJobTitle("Java dev");
    List<String>vladiResponsibilities = new ArrayList<>();
    vladiResponsibilities.add("da slusha");
    vladiResponsibilities.add("homeworks");
    employee2.setResponsibilities(vladiResponsibilities);

    //ADD ALL EMPLOYEES TO LIST
    List<EmployeeNade> myEmployees = new ArrayList<>();
    employee1.setSalary(employee1.getSalary()+1000);
    employee1.setResponsibilities(nadesResponsibilities);
    myEmployees.add(employee);
    myEmployees.add(employee1);
    myEmployees.add(employee2);

    System.out.println(myEmployees);
//    for (EmployeeNade emp: myEmployees) {
//      emp.setSalary(5000);
//    }
    for (int i = 0; i < myEmployees.size(); i++) {
      myEmployees.get(i).setSalary(5000);
    }
    System.out.println(myEmployees);

  }

}

package exercisesOOP.comparableVsComparatorUsage;

import java.util.Arrays;

public class EmployeeTest {

  public static void main(String[] args) {

    int[] myArr = {17, 5, 9, 1, 10};
    Arrays.sort(myArr);
    System.out.println(Arrays.toString(myArr));

    Employee[] empArr = new Employee[5];
    empArr[0] = new Employee(17, "John", 5000);
    empArr[1] = new Employee(5, "Paul", 8000);
    empArr[2] = new Employee(9, "Amit", 3500);
    empArr[3] = new Employee(1, "Kate", 7005);
    empArr[4] = new Employee(10, "Amie", 4500);

    Arrays.sort(empArr); // сортираме по естествен ред като използваме метода compareTo, НЕ ВЗИМА АРГУМЕНТИ
    System.out.println("sorted employees " + Arrays.toString(empArr));

    Arrays.sort(empArr, Employee.NameComaparator); // сортираме с метода compare, ТРЯБВА ДА СЕ ИЗБЕРЕ ПОДХОДЯЩ АРГУМЕНТ
    System.out.println("sorted employees " + Arrays.toString(empArr));

//    Arrays.sort(empArr, Employee.SalaryComaparator); // НЕ РАБОТИ??? ЗАЩО???
//    System.out.println("sorted employees " + Arrays.toString(empArr));

  }

}

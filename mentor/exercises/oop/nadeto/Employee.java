package mentor.exercises.oop.nadeto;

class Employee {
  // това е атрибут, (в случая константа) на класа
  // тя е обща за всички обекти от тип EmployeeNade
  public static final String CLASS_VERSION = "1.0";

  // този е атрибут на обект
  public String name;

  // методите на обекта не
  public String getName() {
    // тук нямаме проблем да достъпим name
    return name;
  }

  // Нестатичните атрибути са така наречените "атрибути на обекта"
  // За да може статичен метод да достъпи такъв атрибут, се
  // нуждае от обект.
  public static String getNameStatic2(Employee employee) {
    // Ако използваме само "name" като горе, ще се получи грешка
    // Но тук използваме обекта, чийто атрибут достъпваме и това работи!
    return employee.name;
  }
}


class Main {
  public static void main(String[] args) {
    // създаваме един обект
    Employee e1 = new Employee();
    // викаме негов нестатичен метод
    e1.getName();

    // можем да викнем статичен метод по този начин

    e1.getNameStatic2(e1);
    // но много по-често ще видите следното
    Employee.getNameStatic2(e1); // все пак е метод на класа, нали?

    // по аналогичен начин бихме могли да достъпим и статичните атрибути
    System.out.println(e1.CLASS_VERSION);
    System.out.println(Employee.CLASS_VERSION);
    // Вторият вариант е по-правилен, защото веднага разбираме, че това е
    // атрибут на класа, т.е. статичен атрибут.

  }
}

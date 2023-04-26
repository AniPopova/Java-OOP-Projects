package accessControl.student2;


public class Student2 {

  private StringBuilder firstName;
  private StringBuilder lastName;
  private int age;
  private int schoolClass;

  public Student2(StringBuilder firstName, StringBuilder lastName, int age, int schoolClass) {
    this.firstName = firstName;
    this.lastName = lastName;
    setAge(age);
    setSchoolClass(schoolClass);
  }


  public StringBuilder getFirstName() {
    return firstName;
  }

  public void setFirstName(StringBuilder firstName) {
    this.firstName = firstName;
  }

  public StringBuilder getLastName() {
    return lastName;
  }

  public void setLastName(StringBuilder lastName) {
    this.lastName = lastName;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void increaseAge() {
    this.age++;

  }

  public void increaseAge(int years) {
    this.age += years;
    if (this.schoolClass + years <= 12) {
      this.schoolClass += years;
    } else {
      System.out.println("Invalid input.");
    }
  }

  public void goToNextClass() {
    if (this.schoolClass < 12) {
      this.schoolClass++;
      this.age++;
    } else {
      System.out.println("You have graduated.");
    }

  }

  public int getSchoolClass() {
    return schoolClass;
  }

  public void setSchoolClass(int schoolClass) {
    if (schoolClass > 0 && schoolClass < 12) {
      this.schoolClass = schoolClass;
    } else {
      System.out.println("No such class.");
    }
  }

  @Override
  public String toString() {
    return "Student " + firstName + "\t" + lastName +
        " at the age of " + getAge() + "\n" +
        "participate in " + getSchoolClass() + " class";
  }
}

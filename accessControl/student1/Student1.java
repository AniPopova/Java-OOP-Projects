package accessControl.student1;


public class Student1 {

  private StringBuilder firstName;
  private StringBuilder lastName;
  private int age;
  private int schoolClass;

  public Student1(StringBuilder firstName, StringBuilder lastName, int age, int schoolClass) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.schoolClass = schoolClass;
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

  public int getSchoolClass() {
    return schoolClass;
  }

  public void setSchoolClass(int schoolClass) {
    this.schoolClass = schoolClass;
  }

  @Override
  public String toString() {
    return "Student " + firstName + "\t"+ lastName +
        " at the age of " + getAge() + "\n"+
        " participate in class " + getSchoolClass();
  }
}

package accessControl.school;


public class Student {

  private StringBuilder firstName;
  private StringBuilder lastName;
  private int age;
  private int schoolClass;
  private double averageScore;

  public Student() {
  }

  public Student(StringBuilder firstName, StringBuilder lastName, int age, int schoolClass,
      double averageScore) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.averageScore = averageScore;
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

  public double getAverageScore() {
    return averageScore;
  }

  public void setAverageScore(double averageScore) {
    this.averageScore = averageScore;
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
    if (this.schoolClass + years <= 11) {
      this.schoolClass += years;
    } else {
      System.out.println("Йееейй! Завърших!");
    }
  }

  public void goToNextClass() {
    if (this.schoolClass <= 11) {
      this.schoolClass++;
      this.age++;
    } else if (this.schoolClass == 12) {
      this.age++;
      System.out.println("Йееейй! Завърших!");
    }

  }

  public int getSchoolClass() {
    return schoolClass;
  }

  public void setSchoolClass(int schoolClass) {
    this.schoolClass = schoolClass;
  }


  @Override
  public String toString() {
    return "\nУченик " + firstName + "\t" + lastName +
        " на " + getAge() + " години," +
        " записан в " + getSchoolClass() + " клас. Има среден успех " + getAverageScore();
  }
}

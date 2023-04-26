package accessControl.student3;


public class Student3 {

  private StringBuilder firstName;
  private StringBuilder lastName;
  private int age;
  private int schoolClass;

  private double averageScore;

  public Student3(StringBuilder firstName, StringBuilder lastName, int age, int schoolClass, double averageScore) {
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
    this.age+=years;
  }

  public void goToNextClass(){
    if(this.schoolClass < 12 ){
      this.schoolClass++;
    }
    else{
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
    return "Student4 " + firstName + "\t"+ lastName +
        " at the age of " + getAge() + "\n"+
        " participate in class " + getSchoolClass() +" .Has average score "+getAverageScore();
  }
}

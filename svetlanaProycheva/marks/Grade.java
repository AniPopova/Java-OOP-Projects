package svetlanaProycheva.marks;

public enum Grade {
  LOW('F', 2) {
    @Override
    public boolean pass() {
      return false;
    }
  }, BASIC('D', 3), SATISFACTORY('C',4), VERY_GOOD('B',5), EXCELLENT('A', 6);

  private char charGrade;
  private double grade;

  Grade(char charGrade, double grade ) {
    this.charGrade = charGrade;
    this.grade = grade;
  }

  public double getGrade() {
    return grade;
  }

  public char getCharGrade() {
    return charGrade;
  }

  public boolean pass() {
    return true;
  }
}

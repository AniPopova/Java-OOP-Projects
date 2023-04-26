package svetlanaProycheva.exercise20220706;

final class StudentMark {

  private final int mark;

  public StudentMark(int mark) {
    this.mark = mark;
  }

  public int getMark() {
    return mark;
  }

  @Override
  public String toString() {
    return "StudentMark: " +
        "mark = " + mark + "\n";
  }
}

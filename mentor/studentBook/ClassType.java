package mentor.studentBook;

public enum ClassType {
  A_CLASS(" Г-н Георги Георгиев"),
  B_CLASS(" Г-жа Маргарита Гарова"),
  V_CLASS(" Г-жа Марина Стоева"),
  G_CLASS(" Г-н Димитър Иванов"),
  D_CLASS(" Г-жа Мария Богатева");


  final String teacherName;
  final int size = 5;

  ClassType(String teacherName) {
    this.teacherName = teacherName;
  }

  public int getSize() {
    return size;
  }
}


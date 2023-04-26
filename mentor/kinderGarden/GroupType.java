package mentor.kinderGarden;

public enum GroupType {
  NURSERY("Mr. Grigoriev"), PUPILS("Mrs. Dobreva");

  final String teacherName;
  final int size = 2;

  GroupType(String teacherName) {
    this.teacherName = teacherName;
  }

  public int getSize() {
    return size;
  }
}

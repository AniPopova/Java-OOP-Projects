package kinderGarden;

import java.util.List;

public class Group {

  private String teacherName;
  private List<Child> children;
  private String groupType;

  public Group() {
  }

  public String getTeacherName() {
    return teacherName;
  }

  public void setTeacherName(String teacherName) {
    this.teacherName = teacherName;
  }

  public String getGroupType() {
   return groupType;
  }

  public void setGroupType(String groupType) {
    this.groupType = groupType;
  }

  public List<Child> getChildren() {
    return children;
  }

  public void setChildren(List<Child> children) {
    this.children = children;
  }

  @Override
  public String toString() {
    return "Group " + groupType + "\n"+
        "teachers' name " + teacherName + "\n" +
        "children " + children +"\n";
  }
}

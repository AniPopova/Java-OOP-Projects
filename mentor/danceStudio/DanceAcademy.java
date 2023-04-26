package mentor.danceStudio;

import java.util.List;

public class DanceAcademy {

  private String nameOfAcademy;
  private List<DanceClass> danceClasses;

  public DanceAcademy() {
  }

  public String getNameOfAcademy() {
    return nameOfAcademy;
  }

  public void setNameOfAcademy(String nameOfAcademy) {
    this.nameOfAcademy = nameOfAcademy;
  }

  public List<DanceClass> getDanceClasses() {
    return danceClasses;
  }

  public void setDanceClasses(List<DanceClass> danceClasses) {
    this.danceClasses = danceClasses;
  }

  @Override
  public String toString() {
    return getNameOfAcademy() +" is dancing studio. Welcome to our classes!" +
        "We have " + danceClasses.size() +" Classes:" + danceClasses + "\n";
  }
}

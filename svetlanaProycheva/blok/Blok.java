package svetlanaProycheva.blok;

public class Blok {

  private int floor;
  private int entrance;
  private int people;

  public Blok(int floor, int entrance, int people) {
    setPeople(people);
    this.people = people;
    setEntrance(entrance);
  }

  public Blok() {
  }

  public int getFloor() {
    return floor;
  }

  private void setFloor(int floor) {
    if (floor < 0) {
      this.floor = 0;
    } else {
      this.floor = floor;
    }

  }

  public int getEntrance() {
    return entrance;
  }

  public void setEntrance(int entrance) {
    this.entrance = entrance;
  }

  public int getPeople() {
    return people;
  }

  public void setPeople(int people) {
    this.people = people;
  }
}
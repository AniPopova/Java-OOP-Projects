package svetlanaProycheva.exercise20220705;

import java.util.Random;

public class EmployeeCar {
  Random random = new Random(400);
  private String car;
  private int parkingNumber;

  public EmployeeCar(String car, int parkingNumber) {
    this.car = car;
    this.parkingNumber = random.nextInt(400);
  }

  public String getCar() {
    return car;
  }

  public void setCar(String car) {
    this.car = car;
  }

  public int getParkingNumber() {
    return parkingNumber;
  }

  public void setParkingNumber(int parkingNumber) {
    this.parkingNumber = random.nextInt(400);
  }

  @Override
  public String toString() {
    return "\n" + "car "+ car + "\n" +
        "parkingNumber " + parkingNumber;
  }
}

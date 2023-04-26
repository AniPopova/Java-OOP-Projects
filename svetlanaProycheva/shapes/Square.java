package svetlanaProycheva.shapes;

public class Square extends Side{


  public Square(double side) {
    super(side);
  }


  private double getArea(double side){
    return Math.sqrt(side);
  }
 private double getSurface(double side)
 {  return side+side+side+side; }


}

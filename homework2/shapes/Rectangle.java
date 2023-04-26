package homework2.shapes;

public class Rectangle extends Shape implements Comparable<Rectangle> {
  int width;
  int height;

  public Rectangle() {

  }

  public int getWidth() {
    return width;
  }

  public void setWidth(int width) {
    this.width = width;
  }

  public int getHeight() {
    return height;
  }

  public void setHeight(int height) {
    this.height = height;
  }
  //В класът Rectangle добавете метод getMaxPossibleSquareInside() който ще връщат страната на най-големия възможен
  // (т.е. с най-голяма страна) квадрат който се събира в правъгълника.
  // Сега в ShapesTest в случая когато обектът е правоъгълник добавете в изхода и страната на най-големия възможен квадрат който се събира в правоъгълника.
  // т.е. примерен изход: “Правоъгълник с височина Х и широчина У” .
  // Страната на най-големия квадрат който се събира в правоъгълника е: "

  @Override
  public double getArea() {
    return height * width;
  }

  @Override
  public double getPerimeter() {
    return 2*height + 2*width;
  }
  public  int getMaxPossibleSquareInside(){
    if(getWidth() < getHeight()){
      return getWidth();
    }
      return getHeight();

  }

  @Override
  public int compareTo(Rectangle o) {
    if (this.height == o.height) {
      return 0;
    }
    return 1;
  }
}

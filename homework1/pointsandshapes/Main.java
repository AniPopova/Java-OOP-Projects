package homework1.pointsandshapes;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    Point x1=new Point();
    x1.setX(4);
    x1.setY(4);
    Point y1=new Point();
    y1.setX(4);
    y1.setY(4);
    Line l1=new Line();
    l1.setPoint1(x1);
    l1.setPoint2(y1);
    Point x2=new Point();
    x2.setX(4);
    x2.setY(4);
    Point y2=new Point();
    y2.setX(4);
    y2.setY(4);
    Line l2=new Line();
    l2.setPoint1(x2);
    l2.setPoint2(y2);

    System.out.println(l1.getPoint1().getY());
    double a1=l1.getPoint2().getY()-l1.getPoint1().getY();
    double b1=l1.getPoint1().getX()-l1.getPoint2().getX();
    double c1=a1* l1.getPoint1().getX()+b1*l1.getPoint1().getY();
    System.out.println(a1+" "+b1+" "+c1);
    double a2=l2.getPoint2().getY()-l2.getPoint1().getY();
    double b2=l2.getPoint1().getX()-l2.getPoint2().getX();
    double c2=a2* l2.getPoint1().getX()+b2*l2.getPoint1().getY();
    System.out.println(a2+" "+b2+" "+c2);
    double test1=a1/a2;
    double test2=b1/b2;
    double test3=c1/c2;
    double k=Math.abs(1+((a1/b1)*(a2/b2)));
    System.out.println(test1);
    System.out.println(test2);
    System.out.println(k);
    if (Double.isNaN(test1)&&Double.isNaN(test2)&&Double.isNaN(test3)){
      System.out.println("same coordinates");
    }
    else if (test1!=test2){
      if (Double.isNaN(k)){
        System.out.println("Perpendicular");
      }else {System.out.println("Cross each other");}

    }else if (test1==test2&&test2!=test3){
      System.out.println("Parallel");
    }


    }


}

package homework1.pointsAndSahpe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Line line1=new Line();
        Line line2=new Line();
        Point line1StartPoint=new Point();
        Point line2StartPoint=new Point();
        Point line1EndPoint=new Point();
        Point line2EndPoint=new Point();

        System.out.println("Please enter coordinates for start point  for the Line 1:");
        System.out.print("X1: ");
        line1StartPoint.setX(Double.parseDouble(scan.nextLine()));
        System.out.print("Y1: ");
        line1StartPoint.setY(Double.parseDouble(scan.nextLine()));
        System.out.println("Please enter coordinates for end point  for the Line 1:");
        System.out.print("X2: ");
        line1EndPoint.setX(Double.parseDouble(scan.nextLine()));
        System.out.print("Y2: ");
        line1EndPoint.setY(Double.parseDouble(scan.nextLine()));

        System.out.println("Please enter coordinates for start point  for the Line 2:");
        System.out.print("X1: ");
        line2StartPoint.setX(Double.parseDouble(scan.nextLine()));
        System.out.print("Y1: ");
        line2StartPoint.setY(Double.parseDouble(scan.nextLine()));
        System.out.println("Please enter coordinates for end point for the Line 2:");
        System.out.print("X2: ");
        line2EndPoint.setX(Double.parseDouble(scan.nextLine()));
        System.out.print("Y2: ");
        line2EndPoint.setY(Double.parseDouble(scan.nextLine()));

        line1.setStartPoint(line1StartPoint);
        line1.setEndPoint(line1EndPoint);
        line2.setStartPoint(line2StartPoint);
        line2.setEndPoint(line2EndPoint);

        double x=(Math.abs(line1.getEquation().get("x"))+1)/(Math.abs(line2.getEquation().get("x"))+1);
        double y=(Math.abs(line1.getEquation().get("y"))+1)/(Math.abs(line2.getEquation().get("y"))+1);
        double c=(Math.abs(line1.getEquation().get("c"))+1)/(Math.abs(line2.getEquation().get("c"))+1);

        System.out.println(line1.getEquation());
        System.out.println(line2.getEquation());

        if(x!=y){
            if(line1.getEquation().get("x")*line2.getEquation().get("x")+
                    line1.getEquation().get("y")*line2.getEquation().get("y")==0){
                System.out.println("Two lines are perpendicular!");
            }
            else{
            System.out.println("Two lines cross each other but they are not perpendicular!");
            }
        }
       else if(x==y&&x!=c){
            System.out.println("Two lines are parallel!");
       }
       else{
            System.out.println("Two lines has same coordinates");
        }





    }
}

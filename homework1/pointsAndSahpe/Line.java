package homework1.pointsAndSahpe;

import java.util.LinkedHashMap;

public class Line {
    private Point point1;
    private Point point2;

    public Point getPoint1() {
        return point1;
    }

    public void setStartPoint(Point point1) {
        this.point1 = point1;
    }

    public Point getPoint2() {
        return point2;
    }

    public void setEndPoint(Point point2) {
        this.point2 = point2;
    }
    public LinkedHashMap<String,Double> getEquation(){
        LinkedHashMap<String,Double> result = new LinkedHashMap<>();

        result.put("x", getPoint1().getY()-getPoint2().getY());
        result.put("c", (getPoint1().getX()- getPoint2().getX())* getPoint1().getY()+ (getPoint2().getY()- getPoint1().getY())* getPoint1().getX());
        result.put("y", getPoint2().getX()-getPoint1().getX());
        return result;

    }
// Ax + By +C = 0;
}

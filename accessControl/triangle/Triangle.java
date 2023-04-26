package accessControl.triangle;

public class Triangle {

    private double sideA;
    private double sideB;
    private double sideC;
    private double angleAlpha;
    private double angleBeta;
    private double angleGama;

    public Triangle(double sideA, double sideB, double angleGama) {

        this.sideA = sideA;
        this.sideB = sideB;
        this.angleGama = angleGama;
        this.sideC = Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2) - 2 * sideA * sideB * Math.cos(Math.toRadians(angleGama)));
        double x = ((Math.sin(Math.toRadians(angleGama))) * sideB) / sideC;
        angleBeta = Math.round(Math.toDegrees(Math.asin(x)));
        this.angleAlpha = 180 - (angleGama + angleBeta);
    }

    public double getPerimeter() {

        return this.sideA + this.sideB + this.sideC;
    }

    public double getArea(){

        return (sideA*sideB*Math.sin(Math.toRadians(angleGama)))/2;
    }

    @Override
    public String toString() {
        return "Triangle data: " +
                "sideA: " + sideA +
                ", sideB: " + sideB +
                ", sideC: " + sideC +
                ", angleAlpha: " + angleAlpha +
                ", angleBeta: " + angleBeta +
                ", angleGama: " + angleGama;
    }
}
import java.util.Scanner;
import java.lang.Math;

public class Task3 implements Printable {

    @Override
    public void Start() {
        Scanner scanner = new Scanner(System.in);

        // Get cylinder dimensions
        System.out.print("Введіть радіус циліндра: ");
        double cylinderRadius = scanner.nextDouble();
        System.out.print("Введіть висоту циліндра: ");
        double cylinderHeight = scanner.nextDouble();

        // Get pyramid dimensions
        System.out.print("Введіть сторону основи піраміди: ");
        double pyramidSide = scanner.nextDouble();
        System.out.print("Введіть висоту піраміди: ");
        double pyramidHeight = scanner.nextDouble();

        // Get ball radius
        System.out.print("Введіть радіус кулі: ");
        double ballRadius = scanner.nextDouble();

        // Create objects
        Cylinder cylinder = new Cylinder(cylinderRadius, cylinderHeight);
        Pyramid pyramid = new Pyramid(pyramidSide, pyramidHeight);
        Ball ball = new Ball(ballRadius);

        // Calculate and print volumes
        System.out.println("Об'єм циліндра: " + cylinder.getVolume());
        System.out.println("Об'єм піраміди: " + pyramid.getVolume());
        System.out.println("Об'єм кулі: " + ball.getVolume());
    }

abstract class Shape {

    protected double volume;

    public abstract double getVolume();

}

abstract class SolidOfRevolution extends Shape {

    protected double radius;

    public SolidOfRevolution(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

}

class Cylinder extends SolidOfRevolution {

    protected double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    @Override
    public double getVolume() {
        return Math.PI * radius * radius * height;
    }

}

class Pyramid extends SolidOfRevolution {

    protected double height;

    public Pyramid(double side, double height) {
        super(side / 2); // Set radius as half side
        this.height = height;
    }

    @Override
    public double getVolume() {
        return (1.0 / 3.0) * radius * radius * height;
    }

}

class Ball extends SolidOfRevolution {

    public Ball(double radius) {
        super(radius);
    }

    @Override
    public double getVolume() {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }
}
}
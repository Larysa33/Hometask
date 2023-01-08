package by.teachmeskills.oop.task1;

public class Circle extends Figure {

    private String name;
    private double radius;
    public static final double Pi = 3.14; //можно ли делать константы типа private?
    private double square;
    private double perimeter;

    public Circle(String name, double radius) {
        this.name = name;
        this.radius = radius;
    }

    public String getName() {
        return name;
    }

    public double getRadius() {
        return radius;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void countSquare() {
        square = Pi * Math.pow(radius, 2);
        System.out.println("Площадь " + name + " = " + square);
    }

    @Override
    public double countPerimeter() {
        perimeter = 2 * Pi * radius;
        return perimeter;
    }

}

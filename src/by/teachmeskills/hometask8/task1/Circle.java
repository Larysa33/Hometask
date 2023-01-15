package by.teachmeskills.hometask8.task1;

public class Circle extends Figure {

    private String name;
    private double radius;
    private double square;
    private double perimeter;

    public Circle(String name, double radius) {
        this.name = name;
        this.radius = radius;
    }


    @Override
    public double countSquare() {
        square = Math.PI * Math.pow(radius, 2);
        return square;
    }

    @Override
    public double countPerimeter() {
        perimeter = 2 * Math.PI * radius;
        return perimeter;
    }

}

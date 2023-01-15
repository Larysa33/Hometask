package by.teachmeskills.hometask8.task1;

public class Rectangle extends Figure {

    private String name;
    private int sideA;
    private int sideB;
    private double square;
    private double perimeter;

    public Rectangle(String name, int sideA, int sideB) {
        this.name = name;
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double countSquare() {
        square = sideA * sideB;
        return square;
    }


    @Override
    public double countPerimeter() {
        perimeter = (sideA + sideB) * 2;
        return perimeter;
    }
}

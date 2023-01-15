package by.teachmeskills.hometask8.task1;

public class Triangle extends Figure {
    private String name;
    private int sideA;
    private int sideB;
    private int sideC;
    private int height;
    private double square;
    private double perimeter;

    public Triangle(String name, int sideA, int sideB, int sideC, int height) {
        this.name = name;
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.height = height;
    }

    @Override
    public double countSquare() {
        return sideC * height / 2;
    }

    @Override
    public double countPerimeter() {
        perimeter = sideA + sideB + sideC;
        return perimeter;
    }
}

package by.teachmeskills.oop.task1;

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

    public String getName() {
        return name;
    }

    public int getSideA() {
        return sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    @Override
    public void countSquare() {
        square = sideA * sideB;
        System.out.println("Площадь " + name + " = " + square);
    }

    @Override
    public double countPerimeter() {
        perimeter = (sideA + sideB) * 2;
        return perimeter;
    }
}

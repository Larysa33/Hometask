package by.teachmeskills.oop.task1;

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

    public int getSideC() {
        return sideC;
    }

    public int getHeight() {
        return height;
    }

    public void setSideC(int sideC) {
        this.sideC = sideC;
    }

    public void setHeight(int height) {
        this.height = height;
    }


    @Override
    public void countSquare() {  //как изменять название метода во всех взаимосвязанных классах?
        square = sideC * height / 2;
        System.out.println("Площадь " + name + " = " + square); //Как вставить name, если оно будет задано у родителя?
    }

    @Override
    public double countPerimeter() {
        perimeter = sideA + sideB + sideC;   //Как вставить sideA и sideB, если они будут заданы у родителя?
        return perimeter;
    }
}

package by.teachmeskills.hometask8.task1;

public class FigureDemo {
    public static void main(String[] args) {
        //Создать массив из 5 фигур.
        Triangle triangle1 = new Triangle("Треугольник 1", 2, 4, 10, 5);
        Triangle triangle2 = new Triangle("Треугольник 1", 1, 1, 1, 2);
        Triangle triangle3 = new Triangle("Треугольник 1", 7, 8, 9, 4);
        Rectangle rectangle1 = new Rectangle("Прямоугольник1", 4, 8);
        Circle circle1 = new Circle("Круг 1", 5);

        Figure[] figures = {triangle1, triangle2, triangle3, rectangle1, circle1};
    }

        //Вывести на экран сумму периметра всех фигур в массиве
    private static void sumOfPerimeters(Figure[] figures) {
        double sum = 0;
        for (Figure figure : figures) {
            double perimeter = figure.countPerimeter();
            System.out.println("Периметр фигуры = " + perimeter);
            sum += perimeter;
        }
        System.out.printf("Периметр всех фигур = " + (String.format("%.2f", sum)));
    }
}


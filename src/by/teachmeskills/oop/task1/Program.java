package by.teachmeskills.oop.task1;

public class Program {
    public static void main(String[] args) {
        //Создать массив из 5 фигур.

        /*
        Triangle triangle1 = new Triangle("Треугольник 1", 2, 4, 10, 5);   //можно ли сначала создать объекты и потом ключить их в массив?
        Triangle triangle2 = new Triangle("Треугольник 1", 1, 1, 1, 2);
        Triangle triangle3 = new Triangle("Треугольник 1", 7, 8, 9, 4);
        Rectangle rectangle1 = new Rectangle("Прямоугольник1", 4,8);
        Circle circle1=new Circle("Круг 1", 5);

        Figure[] array = new Figure{triangle1, triangle2, triangle3, rectangle1, circle1};
         */

        Figure[] array = new Figure[5];
        Triangle triangle1 = new Triangle("Треугольник 1", 2, 4, 10, 5);
        Triangle triangle2 = new Triangle("Треугольник 1", 1, 1, 1, 2);
        Triangle triangle3 = new Triangle("Треугольник 1", 7, 8, 9, 4);
        Rectangle rectangle1 = new Rectangle("Прямоугольник1", 4, 8);
        Circle circle1 = new Circle("Круг 1", 5);

        //Вывести на экран сумму периметра всех фигур в массиве

        /*метод не работает

        public static void countSum (Figure f){
            for (Figure f : array) {
                double sumOfPerimeters = f.countPerimeter();
                f.countPerimeter();
                sumOfPerimeters += f.countPerimeter();
                System.out.println("Сумма периметров всех фигур = " + sumOfPerimeters);
            }
        }
        */
    }
}


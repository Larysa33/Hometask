package by.teachmeskills.hometask2;

import java.util.Scanner;

public class Rainbow {
    public static void main(String[] args) {
        /*Задача 5. По введенному номеру определить цвет радуги (1 –
          красный, 4 – зеленый и т. д.).*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число от 1 до 7:");
        int number = Math.abs(scanner.nextInt());
        switch (number) {
            case 1:
                System.out.println("Красный");
                break;
            case 2:
                System.out.println("Оранжевый");
                break;
            case 3:
                System.out.println("Жёлтый");
                break;
            case 4:
                System.out.println("Зелёный");
                break;
            case 5:
                System.out.println("Голубой");
                break;
            case 6:
                System.out.println("Синий");
                break;
            case 7:
                System.out.println("Фиолетовый");
                break;
            default:
                System.out.println("Число не распознано, введите целое число от 1 до 7:");
        }
    }
}

package by.teachmeskills.hometask2;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {

        /* Задача 1. Дана переменная celsius типа double, предназначенная для хранения температуры в градусах Цельсия.
        Переведите данную температуру в градусы Фаренгейта и выведите результат на консоль.
        Данные для celsius вводятся из консоли.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите температуру в градусах Цельсия:");

        double celsius = scanner.nextDouble();
        double f = celsius*1.8+32;

        System.out.println("Ответ: " + celsius + " °C = " + f + " °F");
    }
}

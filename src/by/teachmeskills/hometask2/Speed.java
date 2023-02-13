package by.teachmeskills.hometask2;

import java.util.Scanner;

public class Speed {
    public static void main (String[] args) {
        /* Задача 2. Дана переменная kmPerHours содержащая скорость в км/ч.
        Перевести скорость из км/ч в м/с. Данные для kmPerHours вводятся из консоли.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите скорость в км/ч:");

        double kmPerHours = scanner.nextDouble();
        double mPerSeconds = kmPerHours*5/18;

        System.out.println("Ответ: " + kmPerHours + " км/ч = " + mPerSeconds + " м/с");
    }
}

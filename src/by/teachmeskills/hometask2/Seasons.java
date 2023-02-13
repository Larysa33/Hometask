package by.teachmeskills.hometask2;

import java.util.Scanner;

public class Seasons {
    public static void main(String[] args) {
         /* Задача 1. Написать программу для вывода названия поры года по номеру месяца.
         При решении используйте оператор switch-case.
          */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер месяца: ");

        int season = scanner.nextInt();

        switch (season) {
            case 12:
            case 1:
            case 2:
                System.out.println("Ответ: зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Ответ: весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Ответ: лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Ответ: осень");
                break;
            default:
                System.out.println("Месяц не распознан, введите значение от 1 до 12: ");
        }
    }
}

package by.teachmeskills.hometask2;

import java.util.Scanner;

public class SeasonsAlternative {
    public static void main (String[] args) {
        /* Задача 2. Написать программу для вывода названия поры года по номеру месяца.
        При решении используйте оператор if-else-if.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер месяца: ");

        int season = scanner.nextInt();

        if (season == 12||season == 1||season == 2) {
            System.out.println("Ответ: зима");
        } else if (season == 3||season == 4||season == 5) {
            System.out.println("Ответ: весна");
        } else if (season == 6||season == 7||season == 8) {
            System.out.println("Ответ: лето");
        } else if (season == 9||season == 10||season == 11) {
            System.out.println("Ответ: осень");
        } else {
            System.out.println("Месяц не распознан, введите значение от 1 до 12: ");
        }
    }
}

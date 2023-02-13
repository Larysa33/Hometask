package by.teachmeskills.hometask3;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        /*Задача 3. Напишите программу, где пользователь вводит любое целое
          положительное число. А программа суммирует все числа от 1 до
          введенного пользователем числа. Для ввода числа воспользуйтесь классом Scanner.
        */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое положительное число:");
        int eNumber = scanner.nextInt();
        int sum = 0;

        for (int number = 1; number <= eNumber; number++) {
            sum = sum + number;
        }
        System.out.println("Ответ: " + sum);
    }
}

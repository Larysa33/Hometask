package by.teachmeskills.hometask2;

import java.util.Scanner;

public class OddNumbers {
    public static void main(String[] args) {
        /*Напишите программу, которая будет принимать на вход число и
        на выход будет выводить сообщение четное число или нет.
        Для определения четности числа используйте операцию получения
        остатка от деления - операция выглядит так: '% 2').*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любое целое число:");
        int number = scanner.nextInt();

        if (Math.abs(number)==0) {
            System.out.println("Ответ: 0 не является ни чётным, ни нечётным числом");
        } else if (Math.abs(number) % 2 == 0) {
            System.out.println("Ответ: число чётное");
        }
        else {
            System.out.println("Ответ: число нечётное");
        }
    }
}

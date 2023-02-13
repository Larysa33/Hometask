package by.teachmeskills.hometask4.oneDimensionArrays.additionalTasks.simpleArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        /*Задание 1. Создайте массив целых чисел. Напишете программу, которая выводит
          сообщение о том, входит ли заданное число в массив или нет.
          Пусть число для поиска задается с консоли (класс Scanner).
        */
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        System.out.println(Arrays.toString(array));


        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число:");
        int number = Math.abs(scanner.nextInt());
        boolean isFound = false;

        for (int i = 0; i < array.length; i++) {
            if (number == array[i]) {
                isFound = true;
                break;
            }
        }

        System.out.println("Введённое число входит в массив.");
        /*Альтернативный вариант
        for (int element : array) {
            if (number == element) {
                System.out.println("Введённое число входит в массив.");
            }
        }
         */
    }
}

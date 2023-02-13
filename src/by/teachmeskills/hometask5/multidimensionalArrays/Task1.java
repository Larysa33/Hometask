package by.teachmeskills.hometask5.multidimensionalArrays;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        /* Задание 1. Создать трехмерный массив из целых чисел. С помощью циклов "пройти" по всему массиву
        и увеличить каждый элемент на заданное число.
        Пусть число, на которое будет увеличиваться каждый элемент, задается из консоли.*/

        int[][][] array = new int[2][2][2];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[j].length; k++) {
                    array[i][j][k] = random.nextInt(10);
                }
            }
        }

        System.out.println("Первоначальный массив: ");
        for (int[][] array2D : array) {
            for (int[] array1D : array2D) {
                for (int item : array1D) {
                    System.out.println(item);
                }
            }
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int number = Math.abs(scanner.nextInt());

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[j].length; k++) {
                    array[i][j][k] = array[i][j][k] + number;
                }
            }
        }

        System.out.println("Изменённый массив: ");
        for (int[][] array2D : array) {
            for (int[] array1D : array2D) {
                for (int item : array1D) {
                    System.out.println(item);
                }
            }
        }

    }
}

package by.teachmeskills.hometask4.oneDimensionArrays.additionalTasks.simpleArrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        /*Создайте массив целых чисел. Удалите все вхождения заданного
          числа из массива. Пусть число задается с консоли (класс Scanner).
          Если такого числа нет - выведите сообщение об этом.
          В результате должен быть новый массив без указанного числа.
        */
        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
        System.out.println("Исходный массив: " + Arrays.toString(array));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любое целое число: ");
        int numberForRemoval = Math.abs(scanner.nextInt());
        int amountOfRepetitions = 0;

        for (int element : array) {
            if (element == numberForRemoval) {
                amountOfRepetitions++;
            }
        }

        if (amountOfRepetitions == 0) {
            System.out.println("Введённое число не входит в массив.");
        } else {
            int newLength = array.length - amountOfRepetitions;
            int[] newArray = new int[newLength];
            for (int i = 0, j = 0; i < array.length; i++) {
                if (array[i] != numberForRemoval) {
                    newArray[j] = array[i];
                    j++;
                }
            }
            System.out.println("Обновлённый массив: " + Arrays.toString(newArray));
        }
    }
}

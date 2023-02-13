package by.teachmeskills.hometask4.oneDimensionArrays.additionalTasks.simpleArrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        /* Задание 3. Создайте и заполните массив случайным числами и выведете
           максимальное, минимальное и среднее значение.
           Для генерации случайного числа используйте метод Math.random().
           Пусть будет возможность создавать массив произвольного размера.
           Пусть размер массива вводится с консоли.
         */
        int[] array;
        int n;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Задайте размер массива целым числом:");
        n = Math.abs(scanner.nextInt());

        array = new int[n];
        for (int i = 0; i < array.length; i++) {
            Random random = new Random();
            array[i] = random.nextInt(100);
        }
        System.out.println("Массив: " + Arrays.toString(array));

        int min = array[0];
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            //min
            if (array[i] < min) {
                min = array[i];
            }
            //max
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Минимальный элемент массива = " + min);
        System.out.println("Максимальный элемент массива = " + max);

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        double average = (double) sum / array.length;
        System.out.println(average);

    }
}

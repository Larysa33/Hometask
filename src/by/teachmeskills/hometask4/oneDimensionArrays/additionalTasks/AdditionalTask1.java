package by.teachmeskills.hometask4.oneDimensionArrays.additionalTasks;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class AdditionalTask1 {
    public static void main(String[] args) {
        /* Дополнительное задание 1. Создайте массив из n случайных целых чисел и выведите его на экран.
        Размер массива пусть задается с консоли и размер массива может быть больше 5 и меньше или равно 10.
        Если n не удовлетворяет условию - выведите сообщение об этом.
        Если пользователь ввёл неподходящее число, то программа должна просить пользователя повторить ввод.
        Создайте второй массив только из чётных элементов первого массива, если они там есть, и выведите его на экран.
        */

        int length = 0;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Введите размер массива целым числом от 6 до 10 включительно:");
            length = Math.abs(scanner.nextInt());

            if (length > 5 && length <= 10) {

                int[] array = new int[length];
                for (int j = 0; j < array.length; j++) {
                    Random random = new Random();
                    array[j] = random.nextInt(100);
                }
                System.out.println("Исходный массив: " + Arrays.toString(array));

                int nElementsToDelete = 0;
                for (int element : array) {
                    if (element % 2 == 0) {
                        nElementsToDelete++;
                    }
                }

                int newLength = nElementsToDelete;
                int[] newArray = new int[newLength];
                for (int k = 0, m = 0; k < array.length; k++) {
                    if (array[k] % 2 == 0) {
                        newArray[m] = array[k];
                        m++;
                    }
                }
                System.out.println("Новый массив: " + Arrays.toString(newArray));
                break;
            }
        }
    }
}

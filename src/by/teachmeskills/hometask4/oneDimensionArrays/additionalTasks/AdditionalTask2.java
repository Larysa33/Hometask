package by.teachmeskills.hometask4.oneDimensionArrays.additionalTasks;

import java.util.Arrays;
import java.util.Random;

public class AdditionalTask2 {
    public static void main(String[] args) {
        /* Дополнительное задание 2. Создайте массив и заполните массив. Выведите массив на экран в строку.
           Замените каждый элемент с нечётным индексом на ноль.
           Снова выведете массив на экран на отдельной строке
        */
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            Random random = new Random();
            array[i] = random.nextInt(100);
        }
        System.out.println("Первоначальный массив: " + Arrays.toString(array));

        int[] newArray = array;

        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                newArray[i] = 0;
            }
        }
        System.out.println("Изменённый массив: " + Arrays.toString(array));
    }
}

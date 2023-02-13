package by.teachmeskills.hometask4.oneDimensionArrays.additionalTasks;

import java.util.Arrays;
import java.util.Random;

public class AdditionalTask3 {
    public static void main(String[] args) {
    /* Дополнительное задание 3. Преобразовать массив так, чтобы сначала шли нулевые элементы, а затем все остальные.
    Пример массива: {1, 7, 0, 9, 5, 0, 3, 2} -> {0, 0, 1, 7, 9, 5, 3, 2}
    */
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            Random random = new Random();
            array[i] = random.nextInt(100);
        }
        System.out.println("Изначальный массив: " + Arrays.toString(array));

        int numberOfZeros = 0;
        for (int element : array) {
            if (element == 0) {
                numberOfZeros++;
            }
        }

        if (numberOfZeros == 0) {
            System.out.println("В массиве нет нулей.");
        } else {
            int[] newArray = new int[10];
            for (int i = 0, j = numberOfZeros; i < array.length; i++) {
                if (array[i] != 0) {
                    newArray[j] = array[i];
                    j++;
                }
            }
            System.out.println("Обновлённый массив: " + Arrays.toString(newArray));
        }
    }
}

package by.teachmeskills.hometask4.oneDimensionArrays.additionalTasks.simpleArrays;

import java.util.Arrays;

public class Task4 {
        public static void main(String[] args) {
        /*Задание 4. Создайте 2 массива из 5 чисел. Выведите массивы на консоль в двух отдельных cтроках.
        Посчитайте среднее арифметическое элементов каждого массива и сообщите,
        для какого из массивов это значение оказалось больше (либо сообщите, что их средние арифметические равны).
        */
            int[] array1 = {3, 4, 6, 0, 8};
            System.out.println("Массив 1: " + Arrays.toString(array1));

            int[] array2 = {3, 4, 6, 0, 9};
            System.out.println("Массив 2: " + Arrays.toString(array2));

            int sum1 = 0;
            for (int i = 0; i < array1.length; i++) {
                sum1 = sum1 + array1[i];
            }
            double average1 = (double) sum1 / array1.length;
            System.out.println("Среднее арифметическое элементов первого массива = " + average1);

            int sum2 = 0;
            for (int i = 0; i < array2.length; i++) {
                sum2 = sum2 + array2[i];
            }
            double average2 = (double) sum2 / array2.length;
            System.out.println("Среднее арифметическое элементов второго массива = " + average2);

            if (average1 == average2) {
                System.out.println("Средние арифметические обоих массивов равны.");
            } else if (average1 > average2) {
                System.out.println("Среднее арифметическое первого массива больше.");
            } else {
                System.out.println("Среднее арифметическое второго массива больше.");
            }
        }
}

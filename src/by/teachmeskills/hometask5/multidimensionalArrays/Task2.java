package by.teachmeskills.hometask5.multidimensionalArrays;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        /* Задание 2.	Шахматная доска. Создать программу для раскраски шахматной доски с помощью цикла.
        Создать двумерный массив String'ов 8х8.
        С помощью циклов задать элементам циклам значения B(Black) или W(White).
        Результат работы программы:
        W B W B W B W B
        B W B W B W B W
        W B W B W B W B
        B W B W B W B W
        W B W B W B W B
        B W B W B W B W
        W B W B W B W B
        B W B W B W B W
        */
        String[][] array = new String[8][8];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if ((i + j) % 2 == 0) {
                    array[i][j] = "W";
                } else {
                    array[i][j] = "B";
                }
            }
        }
        System.out.println(Arrays.deepToString(array));
    }
}

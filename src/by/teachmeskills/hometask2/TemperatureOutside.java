package by.teachmeskills.hometask2;

import java.util.Scanner;

public class TemperatureOutside {
    public static void main(String[] args) {
        /*Задача 4. Для введенного числа t (температура на улице) вывести
        Если t>–5, то вывести «Тепло».
        Если –5> = t > –20, то вывести «Нормально».
        Если –20>= t, то вывести «Холодно».*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите температуру целым числом: ");
        int t = scanner.nextInt();
        if (t > -5) {
            System.out.println("Тепло");
        } else if (t <= -5 && t > -20) {
            System.out.println("Нормально");
        } else {
            System.out.println("Холодно");
        }
    }
}

package by.teachmeskills.hometask2;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        /*Задача 6. Определить, является ли год, который ввел пользователь, високосным или невисокосным.
        В високосном году 366 дней, в обычном 365.
        Примечание: Високосные года делятся нацело на 4. Однако из этого правила есть исключение:
        столетия, которые не делятся нацело на 400, високосными не являются.*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год:");
        int year = scanner.nextInt();
        if (year % 400 == 0)
            System.out.println("количество дней в году: 366");
        else if (year % 4 == 0 && year % 100 > 0)
            System.out.println("количество дней в году: 366");
        else if (year % 100 == 0)
            System.out.println("количество дней в году: 365");
        else
            System.out.println("количество дней в году: 365");
    }

    /*Альтернативное решение:
    if (year%400==0||(year%4==0&&year%100>0)){
    System.out.println("количество дней в году: 366")
    } else {
    System.out.println("количество дней в году: 365");
    }*/
}

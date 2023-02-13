package by.teachmeskills.hometask3;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        /* Дополнительное задание 2. За каждый год банк начисляет к сумме вклада 7% от суммы.
           Напишите программу, в которую пользователь вводит сумму вклада и количество лет.
           А банк вычисляет конечную сумму вклада с учетом начисления процентов за каждый год.
           Для вычисления суммы с учетом процентов используйте цикл for.
           Пусть сумма вклада будет представлять тип float.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму вклада в долларах:");
        float deposit = scanner.nextFloat();
        System.out.println("Введите количество лет вклада:");
        int years = scanner.nextInt();

        /*Альтернативное решение:
        final float PERCENT=0.07f;
        for (int i=1; i<=year; i++){
        float total = deposit*PERCENT+deposit;
        deposit=total;
        System.out.println("Ответ: сумма вклада с прибылью составит " + deposit + "$");
        }
        */
        while (years!=0){
            float profit = deposit * 0.07f;
            deposit = deposit + profit;
            years--;
        }
        System.out.println("Ответ: сумма вклада с прибылью составит " + deposit + "$");
    }
}

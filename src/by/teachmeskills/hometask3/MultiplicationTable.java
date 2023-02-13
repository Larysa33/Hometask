package by.teachmeskills.hometask3;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое положительное число до 10:");
        int num1 = scanner.nextInt();

        for (int i=1; i<=10; i++){
            System.out.println(num1 + " x " + i + " =" + (num1 * i));
        }
    }
}

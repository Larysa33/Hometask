package by.teachmeskills.classesAndObjects.task1;

import java.util.Scanner;

public class CreditCard {

    /*Задание 1. Создать класс CreditCard c полями:
    -номер счета
    -текущая сумма на счету
    */
    String accountNumber;
    double accountAmount;
    public static final double MaxAmount = 1000000;

    CreditCard(String cardNumber, double amount) {
        accountNumber = cardNumber;
        accountAmount = amount;
    }

    //Добавьте метод, который позволяет начислять сумму на кредитную карточку.
    void topUp() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i < 4; i++) {
            System.out.println("Введите сумму, которую хотите положить на счёт " + accountNumber + " в пределах от 1 до 1 000 000 руб.");
            double addAmount = Math.abs(scanner.nextDouble());
            if (addAmount > MaxAmount) {
                System.out.println("Максимальная сумма вклада: 1000000 руб.");
            } else if (addAmount == 0) {
                System.out.println("Введено некорреткное значение.");
            } else {
                accountAmount += addAmount;
                break;
            }
        }
    }

    //Добавьте метод, который позволяет снимать с карточки некоторую сумму.
    void withdraw() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i < 4; i++) {
            System.out.println("Введите сумму, которую хотите снять со счёта: " + accountNumber + " . Текущая сумма счёта: " + accountAmount);
            double withdrawAmount = Math.abs(scanner.nextDouble());
            if (withdrawAmount > accountAmount) {
                System.out.println("На счету недостаточно средств.");
            } else if (withdrawAmount == 0) {
                System.out.println("Введено некорректное значение.");
            } else {
                accountAmount -= withdrawAmount;
                break;
            }
        }
    }

    //Добавьте метод, который выводит текущую информацию о карточке.
    void cardInfo() {
        System.out.println("Баланс счёта " + accountNumber + " = " + accountAmount + " руб.");
        System.out.println("");
    }


}

package by.teachmeskills.classesAndObjects.additionalTask2;

import java.util.Scanner;

public class ATM {

    /* Дополнительное задание 2. Создать класс, описывающий банкомат. Набор купюр, находящихся в банкомате,
    должен задаваться тремя свойствами: количеством купюр номиналом 20, 50 и 100.
    Создать конструктор с тремя параметрами - количеством купюр каждого номинала.
    */
    private int nominal20;
    private int nominal20amount;
    private int nominal50;
    private int nominal50amount;
    private int nominal100;
    private int nominal100amount;
    private int atmAmount;

    public ATM(int nominal20, int nominal50, int nominal100) {
        this.nominal20 = nominal20;
        this.nominal50 = nominal50;
        this.nominal100 = nominal100;
    }

    public int getNominal20() {
        return nominal20;
    }

    public int getNominal50() {
        return nominal50;
    }

    public int getNominal100() {
        return nominal100;
    }

    public void setNominal20(int nominal20) {
        this.nominal20 = nominal20;
    }

    public void setNominal50(int nominal50) {
        this.nominal50 = nominal50;
    }

    public void setNominal100(int nominal100) {
        this.nominal100 = nominal100;
    }

    void atmInfo() {
        System.out.println("Кол-во купюр номиналом 20 = " + nominal20);
        System.out.println("Кол-во купюр номиналом 50 = " + nominal50);
        System.out.println("Кол-во купюр номиналом 100 = " + nominal100 + " \n");
    }

    void countAtmAmount() {
        atmAmount = nominal20 * 20 + nominal50 * 50 + nominal100 * 100;
        System.out.println("Общая сумма денег в банкомате = " + atmAmount + " \n");
    }

    //Сделать метод для добавления денег в банкомат.
    void topUp(int add20, int add50, int add100) {
        this.nominal20 += add20;
        this.nominal50 += add50;
        this.nominal100 += add100;
        nominal20amount = nominal20 * 20;
        nominal50amount = nominal50 * 50;
        nominal100amount = nominal100 * 100;
        System.out.println("Кол-во купюр номиналом 20 = " + nominal20);
        System.out.println("Кол-во купюр номиналом 50 = " + nominal50);
        System.out.println("Кол-во купюр номиналом 100 = " + nominal100);
        countAtmAmount();
    }

    /*Сделать функцию, снимающую деньги, которая принимает сумму денег, а возвращает булевое значение -
    успешность выполнения операции. При снятии денег функция должна распечатывать каким количеством купюр
    какого номинала выдаётся сумма.*/
    Scanner scanner = new Scanner(System.in);

    boolean withdraw() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Введите сумму для снятия целым числом:");
            int sumToWithdraw = Math.abs(scanner.nextInt());
            if (sumToWithdraw <= atmAmount) {
                atmAmount -= sumToWithdraw;
                System.out.println("В банкомате осталось: " + atmAmount);
                break;
            } else {
                System.out.println("В банкомате недостаточно денег. Введите меньшую сумму.");
            }
        }
        return true;
    }
}

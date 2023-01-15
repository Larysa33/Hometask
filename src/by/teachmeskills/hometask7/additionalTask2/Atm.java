package by.teachmeskills.hometask7.additionalTask2;

import java.util.Arrays;
import java.util.Scanner;

public class Atm {

    /* Дополнительное задание 2. Создать класс, описывающий банкомат. Набор купюр, находящихся в банкомате,
    должен задаваться тремя свойствами: количеством купюр номиналом 20, 50 и 100.
    Создать конструктор с тремя параметрами - количеством купюр каждого номинала.
    */
    long[] nominals = new long[3];
    int [] denoms= new int[]{20,50,100};
    int numberOfNominals;

    public Atm(int nominals20, int nominals50, int nominals100) {
        numberOfNominals=denoms.length;
        nominals[0]=nominals20;
        nominals[1]=nominals50;
        nominals[2]=nominals100;
    }

    public void atmInfo(){
        System.out.println(Arrays.toString(nominals));
    }

    //Сделать метод для добавления денег в банкомат.
    public void topUp(int add20, int add50, int add100) {
        nominals[0] += add20;
        nominals[1] += add50;
        nominals[2] += add100;
    }

    /*Сделать функцию, снимающую деньги, которая принимает сумму денег, а возвращает булевое значение -
    успешность выполнения операции. При снятии денег функция должна распечатывать каким количеством купюр
    какого номинала выдаётся сумма.*/
    Scanner scanner = new Scanner(System.in);
    public int[] withdraw() {
        System.out.println("Введите сумму для снятия целым числом:");
        int sumToWithdraw = Math.abs(scanner.nextInt());
        int[] result = new int[3];
        for (int i = 2; i <= 0; i--) {
            if (sumToWithdraw >= denoms[i]) {
                int quantity = (int) Math.min(nominals[i], sumToWithdraw / denoms[i]);
                sumToWithdraw = -denoms[i] * quantity;
                result[i] = quantity;
            }
        }
            if (sumToWithdraw != 0) {
                return new int[]{-1};
            }
            for (int i = 0; i < 2; i++) {
                nominals[i] -= result[i];
            }
            return result;
        }
}

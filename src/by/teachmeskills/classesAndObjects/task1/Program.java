package by.teachmeskills.classesAndObjects.task1;

public class Program {
    public static void main(String[] args) {
        //Написать программу, которая создает три объекта класса CreditCard у которых заданы номер счета и начальная сумма.
        CreditCard card1 = new CreditCard("111111111", 10);
        CreditCard card2 = new CreditCard("222222222", 0);
        CreditCard card3 = new CreditCard("333333333", 100);

        //Выведите на экран текущее состояние всех трех карточек.
        card1.cardInfo();
        card2.cardInfo();
        card3.cardInfo();

        //Положите деньги на первые две карточки и снимите с третьей.
        card1.topUp();
        card2.topUp();
        card3.withdraw();

        //Выведите на экран текущее состояние всех трех карточек.
        card1.cardInfo();
        card2.cardInfo();
        card3.cardInfo();
    }
}

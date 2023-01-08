package by.teachmeskills.classesAndObjects.additionalTask2;

public class ATMfunction {
    public static void main(String[] args) {
        ATM atm = new ATM(0, 20, 100);
        atm.atmInfo();
        atm.countAtmAmount();

        atm.topUp(20, 40, 100);
        atm.withdraw();
    }
}

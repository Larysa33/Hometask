package by.teachmeskills.hometask7.additionalTask2;

import java.util.Arrays;

public class AtmDemo {
    public static void main(String[] args) {
        Atm atm = new Atm(0, 0, 0);
        atm.atmInfo();

        atm.topUp(1, 0, 3);
        atm.atmInfo();

        int[] testPositive1 = atm.withdraw();
        int[] testNegative1 = atm.withdraw();

    }
}

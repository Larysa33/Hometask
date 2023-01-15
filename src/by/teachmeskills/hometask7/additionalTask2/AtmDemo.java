package by.teachmeskills.hometask7.additionalTask2;

public class AtmDemo {
    public static void main(String[] args) {
        Atm atm = new Atm(0, 20, 100);
        atm.atmInfo();

        atm.topUp(20, 40, 100);
        atm.atmInfo();
        atm.withdraw();
    }
}

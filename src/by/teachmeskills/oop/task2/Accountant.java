package by.teachmeskills.oop.task2;

public class Accountant implements Employee {
    final String POSITION = "Бухгалтер";

    @Override
    public void info() {
        System.out.println(POSITION);
    }
}

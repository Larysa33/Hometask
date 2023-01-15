package by.teachmeskills.hometask8.task2;

public class Worker implements Employee {
    final String POSITION = "Рабочий";

    @Override
    public void info() {
        System.out.println(POSITION);
    }
}

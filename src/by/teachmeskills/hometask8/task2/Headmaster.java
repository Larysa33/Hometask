package by.teachmeskills.hometask8.task2;

public class Headmaster implements Employee {
    final String POSITION = "Директор";

    @Override
    public void info() {
        System.out.println(POSITION);
    }
}

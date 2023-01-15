package by.teachmeskills.hometask8.task2;

public class ChiefExecutive implements Employee {
    final String POSITION = "Директор";

    @Override
    public void info() {
        System.out.println(POSITION);
    }
}

package by.teachmeskills.hometask3;

public class OddNumbers {
    public static void main(String[] args) {
        /*Задача1. При помощи цикла for вывести на экран нечетные числа от 1 до 99.
          При решении используйте операцию инкремента (++).
        */
        for (int i = 1; i <= 99; i++) {
            if (i % 2 != 0) {
                System.out.print(i + "; ");
            }
        }
    }
}

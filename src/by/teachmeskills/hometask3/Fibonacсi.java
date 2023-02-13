package by.teachmeskills.hometask3;

public class Fibonacсi {
    public static void main(String[] args){
        /*Доп. задание 1. Выведите на экран первые 11 членов последовательности Фибоначчи (Элементы числовой последовательности :
        0, 1, 1, 2, 3, 5, 8, 13, 21…, в которой первые два числа равны 0 и 1,
        а каждое последующее число равно сумме двух предыдущих чисел).*/

        int a=0,b=1,sum=0;
        System.out.println(a + "; " + b + "; ");

        for(int i=1;i<=11;i++){
            sum=a+b;
            a=b;
            b=sum;
            System.out.print(sum+"; ");
        }
    }
}

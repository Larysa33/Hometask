package by.teachmeskills.classesAndObjects.additionalTask1;

public class Program {
    public static void main(String[] args) {
        RAM ram = new RAM("RDRAM", 6);
        HDD hdd = new HDD("SATA", 500, "inner");

        //Cоздать объект "компьютер 1" с помощью первого конструктора и вывести информацию на экран
        Computer computer1 = new Computer(200.39, "HP");
        computer1.computerInfo();

        //Cоздать объект "компьютер 2" с помощью первого конструктора и вывести информацию на экран
        /*Computer computer2 = new Computer(500, "Lenovo", ram, hdd);
        computer2.computerInfo();
         */
    }
}

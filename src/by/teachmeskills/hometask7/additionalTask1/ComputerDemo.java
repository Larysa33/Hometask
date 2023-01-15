package by.teachmeskills.hometask7.additionalTask1;

public class ComputerDemo {
    public static void main(String[] args) {
        Ram ram = new Ram("RDRAM", 6);
        Hdd hdd = new Hdd("SATA", 500, "Internal");

        //Cоздать объект "компьютер 1" с помощью первого конструктора и вывести информацию на экран
        Computer computer1 = new Computer(200.39, "HP");
        computer1.computerInfo();

        //Cоздать объект "компьютер 2" с помощью первого конструктора и вывести информацию на экран
        Computer computer2 = new Computer(500, "Lenovo", ram, hdd);
        computer2.computerInfo();
    }
}

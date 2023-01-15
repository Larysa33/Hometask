package by.teachmeskills.hometask7.additionalTask1;

public class Computer {
    /* Дополнительное задание 1. Создать класс для описания компьютера, в этом классе должны быть
поля:
●	стоимость
●	модель(строковый тип)
●	RAM
●	HDD
Для полей RAM и HDD следует создать свои собственные классы.
*/
    private double computerPrice;
    private String computerModel;

    private Ram ram;
    private Hdd hdd;

    /* Класс Computer должен иметь два конструктора:
    ●	первый - с параметрами стоимость и модель,
    ●	второй - со всеми полями.
    */

    public Computer(double computerPrice, String computerModel) {
        this.computerPrice = computerPrice;
        this.computerModel = computerModel;
        this.ram = new Ram();
        this.hdd = new Hdd();
    }

    public Computer(double computerPrice, String computerModel, Ram ram, Hdd hdd) {
        this.computerPrice = computerPrice;
        this.computerModel = computerModel;
        this.ram = ram;
        this.hdd = hdd;
    }

    public double getComputerPrice() {
        return computerPrice;
    }

    //В каждом из классов предусмотреть методы для вывода полной информации (вывод всех полей и всех значений).
    public void computerInfo() {
        System.out.println("Модель компьютера: " + computerModel);
        System.out.println("Стоимость компьютера: " + computerPrice);
        ram.ramInfo();
        hdd.hddInfo();
        System.out.println();
    }
}

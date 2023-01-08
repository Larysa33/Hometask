package by.teachmeskills.classesAndObjects.additionalTask1;

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

    private RAM ram;
    private HDD hdd;

    /* Класс Computer должен иметь два конструктора:
    ●	первый - с параметрами стоимость и модель,
    ●	второй - со всеми полями.
    */

    public Computer(double computerPrice, String computerModel) {
        this.computerPrice = computerPrice;
        this.computerModel = computerModel;
    }

    public Computer(double computerPrice, String computerModel, RAM ram, HDD hdd) {
        this.computerPrice = computerPrice;
        this.computerModel = computerModel;
        this.ram = ram;
        this.hdd = hdd;
    }

    public double getComputerPrice() {
        return computerPrice;
    }

    public String getComputerModel() {
        return computerModel;
    }

    public void setComputerPrice(double computerPrice) {
        this.computerPrice = computerPrice;
    }

    public void setComputerModel(String computerModel) {
        this.computerModel = computerModel;
    }

    //В каждом из классов предусмотреть методы для вывода полной информации (вывод всех полей и всех значений).
    void computerInfo() {
        System.out.println("Модель компьютера: " + computerModel);
        System.out.println("Стоимость компьютера: " + computerPrice);
        ram.ramInfo();
        hdd.hddInfo();
    }
}

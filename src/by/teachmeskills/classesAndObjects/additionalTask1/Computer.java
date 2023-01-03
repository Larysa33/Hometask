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
    double computerPrice;
    String computerModel;

    /* Класс Computer должен иметь два конструктора:
    ●	первый - с параметрами стоимость и модель,
    ●	второй - со всеми полями.
    */

    Computer(double price, String model) {
        computerPrice = price;
        computerModel = model;
    }

    //В каждом из классов предусмотреть методы для вывода полной информации (вывод всех полей и всех значений).
}

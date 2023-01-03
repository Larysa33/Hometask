package by.teachmeskills.classesAndObjects.additionalTask1;

public class HDD {
    // Класс HDD имеет поля "название", "объем" и "тип" (внешний или внутренний).
    String hddName;
    int hddVolume;
    String hddType;

    //Классы для RAM и HDD должны иметь конструктор по умолчанию и конструктор со всеми параметрами.
    HDD(String name, int volume, String type) {
        hddName = name;
        hddVolume = volume;
        hddType = type;
    }

    //В каждом из классов предусмотреть методы для вывода полной информации (вывод всех полей и всех значений).
    void hddInfo() {
        System.out.println("Объём HDD " + hddName + " = " + hddVolume + " . Тип - " + hddType);
    }
}

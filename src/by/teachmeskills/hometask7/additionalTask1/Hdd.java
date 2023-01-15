package by.teachmeskills.hometask7.additionalTask1;

import java.util.Objects;

public class Hdd {
    // Класс HDD имеет поля "название", "объем" и "тип" (внешний или внутренний).
    private static final String HDD_TYPE_MESSAGE = "Тип может быть только внутренний или внешний";
    private static final String HDD_TYPE_INTERNAL = "Internal";
    private static final String HDD_TYPE_EXTERNAL = "External";
    private String name;
    private int capacity;
    private String type;

    //Классы для RAM и HDD должны иметь конструктор по умолчанию и конструктор со всеми параметрами.
    public Hdd() {
    }

    public Hdd(String name, int capacity, String type) {
        this.name = name;
        this.capacity = capacity;
        if (Objects.equals(type, HDD_TYPE_INTERNAL) || Objects.equals(type, HDD_TYPE_EXTERNAL)) {
            this.type = type;
        } else {
            System.out.println(HDD_TYPE_MESSAGE);
        }
    }

    //В каждом из классов предусмотреть методы для вывода полной информации (вывод всех полей и всех значений).
    public void hddInfo() {
        System.out.println("Объём HDD " + name + " = " + capacity + " . Тип - " + type);
    }
}

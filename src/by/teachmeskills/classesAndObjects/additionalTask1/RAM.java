package by.teachmeskills.classesAndObjects.additionalTask1;

public class RAM {
    //Класс RAM имеет поля "название" и "объем".
    String ramName;
    int ramVolume;

    //Классы для RAM и HDD должны иметь конструктор по умолчанию и конструктор со всеми параметрами.
    RAM(String name, int volume) {
        ramName = name;
        ramVolume = volume;
    }

    //В каждом из классов предусмотреть методы для вывода полной информации (вывод всех полей и всех значений).
    void ramInfo() {
        System.out.println("Объём RAM " + ramName + " = " + ramVolume);
    }
}

package by.teachmeskills.hometask7.additionalTask1;

public class Ram {
    //Класс RAM имеет поля "название" и "объем".
    private String name;
    private int capacity;

    //Классы для RAM и HDD должны иметь конструктор по умолчанию и конструктор со всеми параметрами.
    public Ram() {
    }

    public Ram(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    //В каждом из классов предусмотреть методы для вывода полной информации (вывод всех полей и всех значений).
    public void ramInfo() {
        System.out.println("Объём RAM " + name + " = " + capacity);
    }
}

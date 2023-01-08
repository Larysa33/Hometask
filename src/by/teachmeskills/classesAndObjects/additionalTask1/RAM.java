package by.teachmeskills.classesAndObjects.additionalTask1;

public class RAM {
    //Класс RAM имеет поля "название" и "объем".
    private String ramName;
    private int ramVolume;

    //Классы для RAM и HDD должны иметь конструктор по умолчанию и конструктор со всеми параметрами.
    public RAM() {
    }

    public RAM(String ramName, int ramVolume) {
        this.ramName = ramName;
        this.ramVolume = ramVolume;
    }

    public String getRamName() {
        return ramName;
    }

    public int getRamVolume() {
        return ramVolume;
    }

    public void setRamName(String ramName) {
        this.ramName = ramName;
    }

    public void setRamVolume(int ramVolume) {
        this.ramVolume = ramVolume;
    }

    //В каждом из классов предусмотреть методы для вывода полной информации (вывод всех полей и всех значений).
    void ramInfo() {
        System.out.println("Объём RAM " + ramName + " = " + ramVolume);
    }
}

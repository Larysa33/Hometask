package by.teachmeskills.classesAndObjects.additionalTask1;

public class HDD {
    // Класс HDD имеет поля "название", "объем" и "тип" (внешний или внутренний).
    private String hddName;
    private int hddVolume;
    private String hddType;

    //Классы для RAM и HDD должны иметь конструктор по умолчанию и конструктор со всеми параметрами.
    public HDD() {
    }

    public HDD(String hddName, int hddVolume, String hddType) {
        this.hddName = hddName;
        this.hddVolume = hddVolume;
        this.hddType = hddType;
    }

    public String getHddName() {
        return hddName;
    }

    public int getHddVolume() {
        return hddVolume;
    }

    public String getHddType() {
        return hddType;
    }

    public void setHddName(String hddName) {
        this.hddName = hddName;
    }

    public void setHddVolume(int hddVolume) {
        this.hddVolume = hddVolume;
    }

    public void setHddType(String hddType) {
        this.hddType = hddType;
    }

    //В каждом из классов предусмотреть методы для вывода полной информации (вывод всех полей и всех значений).
    void hddInfo() {
        System.out.println("Объём HDD " + hddName + " = " + hddVolume + " . Тип - " + hddType);
    }
}
